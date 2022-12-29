package com.t3h.helloworld.mapper;

import java.sql.ResultSet;

public interface IRowMapper <T>{
    T mapFromDbToClass(ResultSet resultSet);
}
