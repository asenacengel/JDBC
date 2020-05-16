package muhtar_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    public static void main(String[] args) throws SQLException {

        String userName = "hr";
        String password = "hr";
        String URL =  "jdbc:oracle:thin:@18.207.120.16:1521:xe";

        Connection connection = DriverManager.getConnection(URL,userName,password);
        System.out.println("Connect Successfully");

    }
}
