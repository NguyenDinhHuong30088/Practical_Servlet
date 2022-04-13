package com.example.fstore_practical.model;

import com.example.fstore_practical.entity.tbUser;
import com.example.fstore_practical.ulti.Config.ConfigSql;
import com.example.fstore_practical.ulti.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {
    public tbUser findAccountByUsername(String username) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement(
                            ConfigSql.SELECT_ACCOUNT_BY_USERNAME);
            preparedStatement.setString(1, username);
            // PrepareStatement
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String usernameDatabase = resultSet.getString("username");
                String passwordDatabase = resultSet.getString("password");
                tbUser user = new tbUser();

                user.setUsername(usernameDatabase);
                user.setPassword(passwordDatabase);
                return user;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
