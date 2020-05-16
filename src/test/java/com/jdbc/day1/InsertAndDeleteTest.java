package com.jdbc.day1;

import java.sql.*;

public class InsertAndDeleteTest {


        static String url = "jdbc:oracle:thin:@18.207.120.16:1521:xe";
        static String username = "system";
        static String password = "system";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        String INSERT_QUERY = "INSERT INTO employees VALUES(223, 'Hasan', 'Mammadov', 'hasan@cybertek.com(opens in new tab)', '777-777-7777', SYSDATE, 'SDET', 14999, 0, NULL, NULL)";
        String DELETE_QUERY = "DELETE FROM employees WHERE employee_id = 223";
        ResultSet resultSet = statement.executeQuery(INSERT_QUERY);
        
        resultSet.close();
        statement.close();
        connection.close();

    }

}
