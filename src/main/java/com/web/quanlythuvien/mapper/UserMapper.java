package com.t3h.helloworld.mapper;

import com.t3h.helloworld.model.entity.UserEntity;
import com.t3h.helloworld.util.MapUtils;

import java.sql.ResultSet;

public class UserMapper implements IRowMapper<UserEntity>{
    @Override
    public UserEntity mapFromDbToClass(ResultSet resultSet) {
        return MapUtils.mapRowFromTableToClass(new UserEntity(),resultSet);
    }
}
