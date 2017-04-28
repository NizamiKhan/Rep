import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

public class Main {
    private static final String url = "jdbc:oracle:thin:@sql.edu-netcracker.com:1251:XE";
    private static final String user = "unc17i_hanguseinov";
    private static final String password = "ZZ6t9bNJ";
    private static Connection connection;

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Body body = new Body();

        try {
            connection = DriverManager.getConnection(url, user, password);
            if (!(connection.isClosed()))
                System.out.println("Соединение установлено!");
            body.bodyStart(connection);

            connection.close();
            if (connection.isClosed())
                System.out.println("Соединение разорвано!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
