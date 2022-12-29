package com.weblhm.quanlythuvien.Dao;

import com.weblhm.quanlythuvien.util.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getListUser(){

        List<User> users = new ArrayList<>();

        String sqlQuery = "select * from user";
        ConnectMySQL connectMySQL = new ConnectMySQL();
        Connection connection = connectMySQL.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setSex(resultSet.getInt("sex"));
                user.setNumberPhone(resultSet.getInt("numberPhone"));
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;

    }

}
