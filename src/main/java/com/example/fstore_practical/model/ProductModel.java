package com.example.fstore_practical.model;

import com.example.fstore_practical.entity.tbProducts;
import com.example.fstore_practical.ulti.Config.ConfigSql;
import com.example.fstore_practical.ulti.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
//    public boolean save(tbProducts obj){
//        try
//        {
//            Connection connection = ConnectionHelper.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(ConfigSql.DATEBASE_PRODUCT_INSERT);
//            preparedStatement.setString(1, obj.getName());
//            preparedStatement.setDouble(2, obj.getPrice());
//            preparedStatement.setDouble(3, obj.getAmount());
//            preparedStatement.setString(4, obj.getDetails());
//            preparedStatement.execute();
//            return true;
//        }catch(SQLException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        return false;
//    }

    public List<tbProducts> findAll(){
        List<tbProducts> listObj = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            String sqlSelect = ConfigSql.DATABASE_PRODUCT_SELECT;
            PreparedStatement statement = connection.prepareStatement(sqlSelect);
            ResultSet resultSet = statement.executeQuery(sqlSelect);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                double amount = resultSet.getDouble("amount");
                String details = resultSet.getString("details");
                tbProducts obj = new tbProducts(id, name, price, amount, details);
                listObj.add(obj);
            }
        }catch (Exception e){

        }
        return listObj;
    }

//    public tbProducts findById(int id){
//        tbProducts obj = null;
//        try {
//            Connection connection = ConnectionHelper.getConnection();
//            PreparedStatement statement = connection.prepareStatement(ConfigSql.DATABASE_PRODUCT_SELECT2);
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            if (resultSet.next()){
//                String name = resultSet.getString("name");
//                double price = resultSet.getDouble("price");
//                double amount = resultSet.getDouble("amount");
//                String details = resultSet.getString("details");
//                obj = new tbProducts(id, name, price, amount, details);
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return obj;
//    }

//    public boolean update(int id, tbProducts updateProduct) {
//        try {
//            Connection connection = ConnectionHelper.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(ConfigSql.DATABASE_PRODUCT_UPDATE);
//            preparedStatement.setString(1, updateProduct.getName());
//            preparedStatement.setDouble(2, updateProduct.getPrice());
//            preparedStatement.setDouble(3, updateProduct.getAmount());
//            preparedStatement.setString(4, updateProduct.getDetails());
//            preparedStatement.setInt(5, id);
//            preparedStatement.execute();
//            return true;
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean delete(int id) {
//        try {
//            Connection connection = ConnectionHelper.getConnection();
//            PreparedStatement statement = connection.prepareStatement(ConfigSql.DATABASE_PRODUCT_DELETE);
//            statement.setInt(1,id);
//            statement.execute();
//            return true;
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
