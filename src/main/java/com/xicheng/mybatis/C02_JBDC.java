package com.xicheng.mybatis;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * description jdbc demo
 *
 * @author xichengxml
 * @date 2021/2/3 下午 11:47
 */
public class C02_JBDC {

    private static final String URL = "jdbc:mysql://localhost:3306/wishing-tree?serverTimezone=UTC&characterEncoding=utf-8";

    private static final String USER_NAME = "root";

    private static final String PASSWORD = "123456";

    private static final String SQL = "select * from `user` where id = ?";

    static {
        try {
            // 为什么要加载?
            Class.forName(Driver.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        selectByPreparedStatement();
        selectByStatement();
    }

    private static void selectByPreparedStatement() throws Exception {
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, "1");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String columnName1 = resultSet.getMetaData().getColumnName(1);
            String columnName2 = resultSet.getMetaData().getColumnName(2);
            System.out.println("columnName1: " + columnName1 + "--" + resultSet.getString(1));
            System.out.println("columnName2: " + columnName2 + "--" + resultSet.getString(2));
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    private static void selectByStatement() throws Exception {
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL.replace("?", "1"));

        while (resultSet.next()) {
            String columnName1 = resultSet.getMetaData().getColumnName(1);
            String columnName2 = resultSet.getMetaData().getColumnName(2);
            System.out.println("columnName1: " + columnName1 + "--" + resultSet.getString(1));
            System.out.println("columnName2: " + columnName2 + "--" + resultSet.getString(2));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
