package com.t3h.helloworld.service.impl;

import com.t3h.helloworld.dao.IUserDao;
import com.t3h.helloworld.dao.impl.UserDaoImpl;
import com.t3h.helloworld.mapper.UserMapper;
import com.t3h.helloworld.model.entity.UserEntity;
import com.t3h.helloworld.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {


    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public UserEntity findById(Integer idUser) {
        return userDao.findById(idUser);
    }

    @Override
    public void add(UserEntity user) {
        if (user.getId() == null){
            userDao.add(user);
        }else {
            userDao.update(user);
        }
    }
    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    /*
        Sql Injection
     */
    @Override
    public List<UserEntity> findByCondition(String username, String age, String name) {
        Integer ageFinal = age.isEmpty() ? null : Integer.parseInt(age);
        StringBuilder sqlBuider = new StringBuilder("select * from user where 1=1");
        if (ageFinal != null){
            sqlBuider.append(String.format(" and age=%d",ageFinal));
        }
        if (!username.isEmpty()){
            sqlBuider.append(String.format(" and username='%s'",username));
        }
        if (!name.isEmpty()){

            sqlBuider.append(String.format(" and lower(name)=lower('%s')",name));
        }
        return userDao.findByProperties(sqlBuider.toString(),new UserMapper());
    }
}
