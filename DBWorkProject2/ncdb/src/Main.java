import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydbtest?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection connection;


    public static void main(String[] args) {

        try {
            connection = DriverManager.getConnection(url, user, password);
            if (!(connection.isClosed()))
                System.out.println("Соединение установлено!");



            connection.close();
            if (connection.isClosed())
                System.out.println("Соединение закрыто!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

