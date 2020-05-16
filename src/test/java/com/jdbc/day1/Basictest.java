package com.jdbc.day1;

import java.sql.*;

public class Basictest {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@18.207.120.16:1521:xe";
        String username = "system";
        String password = "system";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);


        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2) + " "+resultSet.getString(3));

        }

        resultSet.beforeFirst();
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        System.out.println("JDBC driver : " +databaseMetaData.getDriverName());
        System.out.println("JDBC driver version : " +databaseMetaData.getDriverVersion());
        System.out.println("Database name : " + databaseMetaData.getDatabaseProductName());
        System.out.println(" Database version : " + databaseMetaData.getDatabaseProductVersion());

        System.out.println(" Type of employee id column : " + resultSetMetaData.getColumnCount());
        System.out.println("Label of 1st column: " + resultSetMetaData.getColumnName(1));
        System.out.println("Data type of first column : " + resultSetMetaData.getColumnType(1));

        System.out.println("##############");
        // iterete rows
        while (resultSet.next()){
            // iterete columns
            for (int columnIndex = 1 ; columnIndex <= resultSetMetaData.getColumnCount();columnIndex++){

                System.out.printf("%-15s" + resultSet.getString(columnIndex) + " ");
            }
            System.out.println("");
        }

        while (resultSet.next()){
            System.out.println(resultSet.getString("salary"));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
