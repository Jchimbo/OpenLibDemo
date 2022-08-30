package software.design.rest.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlConnect {
    Connection conn = null;
    /*
    This class connects to the local database with the credentials below.
     */
    public mysqlConnect()  {
        try {
            String user = "Username";
            String pass = "password";
            String db = "OpenLibDemo";
            conn =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1/" + db +
                            "?user=" + user + "&password=" + pass
                    +"&useSSL=false");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public Connection getConn() {
        return conn;
    }

}
