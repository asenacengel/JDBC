package muhtar_jdbc;

import Utility.DBUtility;

import java.sql.SQLException;

public class MetaData {
    public static void main(String[] args) throws SQLException {

        System.out.println(DBUtility.metaData.getUserName());
        System.out.println(DBUtility.metaData.getDriverVersion());
        System.out.println(DBUtility.metaData.getDatabaseProductName());
    }
}
