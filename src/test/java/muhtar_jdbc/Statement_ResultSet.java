package muhtar_jdbc;

import java.sql.*;

public class Statement_ResultSet {
    public static void main(String[] args) throws SQLException {

        String userName = "hr";
        String password = "hr";
        String URL =  "jdbc:oracle:thin:@18.207.120.16:1521:xe";

        Connection connection = DriverManager.getConnection(URL,userName,password);
        System.out.println("Connect Successfully");

        Statement statement = connection.createStatement();
        System.out.println("Statement is created");

        ResultSet result = statement.executeQuery("select * From employees");
        System.out.println("Result set is completed");
        String sql = "Update developers set name = 'Madina' where name = 'Erhan'";
        statement.executeLargeUpdate(sql);





    }
}
