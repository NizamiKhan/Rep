import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydbtest?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection connection;
//

    public static void main(String[] args) {
        Body body = new Body();
        try {
            connection = DriverManager.getConnection(url, user, password);
            if(!(connection.isClosed()))
                System.out.println("Соединение установлено!");
            body.bodyStart(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
