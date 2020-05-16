package muhtar_jdbc;

import java.sql.*;

public class PrintingResult {

    public static void main(String[] args) throws SQLException {


        String userName = "hr";
        String password = "hr";
        String URL =  "jdbc:oracle:thin:@18.207.120.16:1521:xe";
        Connection connection = DriverManager.getConnection(URL,userName,password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * From employees");

        while (result.next()){
         // String firstname =  result.getString("first_name");
            String firstname = result.getString(2);
            String lastName = result.getString(3);
            int salary = result.getInt("salary");

            System.out.println(firstname + " " + lastName+" "+salary);


        }
    }
}
