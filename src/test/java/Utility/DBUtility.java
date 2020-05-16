package Utility;

import java.sql.*;

public class DBUtility {

   private final static String username = ConfigurationReader.getProperty("JDBC_userName"),
            password = ConfigurationReader.getProperty("JDBC_password"),
            url = ConfigurationReader.getProperty("JDBC_URL");

   private static Connection connection;
   private static Statement statement;

   public static  DatabaseMetaData metaData;

    static {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            metaData = connection.getMetaData();

        } catch (Exception e) {


        }}


        public static ResultSet getResult (String sql ){

            ResultSet result = null;
            try {
                result = statement.executeQuery(sql);
            } catch (Exception e) {
            }
                return result;

        }
        public static void tearDown(){
        try{
            connection.close();
        }catch (Exception e){

        }

        }
        public static void UpdateQuery(String sql){
        try {
            statement.executeUpdate(sql);
        }catch (SQLException e){

        }
        }
    }
