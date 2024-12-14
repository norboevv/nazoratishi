package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

    DBConnection dbConnection = new DBConnection();


    void create(String name, double price) {
        String sql = "insert into product(name, price)" +
                "values" + " ('" + name + "'," + "'" + price + "');";
        try (Connection connection = dbConnection.getConnection();
             Statement statement = connection.createStatement();) {
            int res = statement.executeUpdate(sql);
            System.out.println(res);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void delete(int id) {


        String sql = "DELETE FROM product WHERE id = " + id + ";";
        try (Connection connection = dbConnection.getConnection(); // autoClosable
             Statement statement = connection.createStatement()) {
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void update(String name, double price, int id) {
        try (Connection connection = dbConnection.getConnection();
             Statement statement = connection.createStatement();) {
            String sql = "UPDATE Product SET name = '" + name
                    + "', price ='" + price + "' " +
                    "WHERE id =" + id + ";";
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    String getEmployees() {
        String sql = "select id, name" +
                " from product";

        try (Connection connection = dbConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);) {

            StringBuilder builder = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");


                builder.append(id + " | " + name);
                builder.append("\n");
            }
            return builder.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
