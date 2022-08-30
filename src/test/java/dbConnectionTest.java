import org.junit.jupiter.api.Test;
import software.design.rest.mysql.mysqlConnect;

import java.sql.SQLException;

public class dbConnectionTest {

    mysqlConnect c = null;
@Test
    void dbTest() throws SQLException {
    mysqlConnect c = new mysqlConnect();
    assert !c.getConn().isClosed();
}


}
