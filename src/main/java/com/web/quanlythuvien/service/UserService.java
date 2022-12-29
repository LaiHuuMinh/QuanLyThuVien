package com.t3h.helloworld.service;

import com.t3h.helloworld.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity findById(Integer idUser);

    void add(UserEntity user);

    List<UserEntity> findAll();

    List<UserEntity> findByCondition(String username,String age,String name);
}
