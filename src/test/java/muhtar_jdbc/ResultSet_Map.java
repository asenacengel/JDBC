package muhtar_jdbc;

import Utility.DBUtility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResultSet_Map {
    public static void main(String[] args) throws SQLException {

       ResultSet result = DBUtility.getResult("select * from employees");
        Map<String,Integer> employeeInfo = new LinkedHashMap<>();



       while (result.next()){
           String firstName = result.getString("first_name");
           String lastName = result.getString("last_name");
           String fullName = firstName+" "+lastName;
           Integer salary = result.getInt("salary");
           System.out.println(fullName+" "+salary);

           employeeInfo.put(fullName, salary);

       }
        System.out.print(employeeInfo);
        System.out.println(employeeInfo.get("Steven King"));
        String sql = "Update developers set name = 'Madina' where name = 'Erhan";


    }
}
