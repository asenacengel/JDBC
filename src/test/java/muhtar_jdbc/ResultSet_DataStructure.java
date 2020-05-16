package muhtar_jdbc;


import Utility.DBUtility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSet_DataStructure {
    public static void main(String[] args) throws SQLException {

        ResultSet result = DBUtility.getResult("Select * from Employees");
        List<String> employeeNames = new ArrayList<>();

        while (result.next()){
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            String fullName = firstName+" "+lastName;
            employeeNames.add(fullName);
        }
        System.out.println(employeeNames.contains("Steven King"));
        System.out.println(employeeNames);


        DBUtility.tearDown();

    }
}
