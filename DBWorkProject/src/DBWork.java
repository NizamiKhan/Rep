import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWork {
    private static final String url = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection connection;

    public DBWork() {

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
