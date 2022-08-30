package software.design.rest.mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class CreateTable {

    Connection conn = null;
    public CreateTable(String tbName,String att1 ) throws  ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = new mysqlConnect().getConn();
            String ct = "CREATE TABLE " + tbName + " (id INTEGER not NULL, " + "test"+ " VARCHAR(255), PRIMARY KEY (id) )";
            conn.createStatement().executeUpdate(ct);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
