package muhtar_jdbc;

import Utility.DBUtility;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaData {
    public static void main(String[] args) throws SQLException {

        System.out.println(DBUtility.metaData.getUserName());
        System.out.println(DBUtility.metaData.getDriverVersion());
        System.out.println(DBUtility.metaData.getDatabaseProductName());

        ResultSet rs = DBUtility.getResult("select * from employees");
        ResultSetMetaData resultData = rs.getMetaData();
        System.out.println(resultData.getColumnCount());
        System.out.println(resultData.getColumnName(5));
        System.out.println("===============================");

        for (int columnCount = resultData.getColumnCount(); columnCount > 1; columnCount++) {
            System.out.println(resultData.getColumnName(columnCount));
        }

    }
}
