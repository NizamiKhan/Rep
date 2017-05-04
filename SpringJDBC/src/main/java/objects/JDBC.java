package objects;

import java.sql.*;

public class JDBC {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
    private static final String user = "root";
    private static final String password = "root";

    public static ResultSet getResultSet() {
        return resultSet;
    }

    public static void setResultSet(String query) throws SQLException {
        resultSet = statement.executeQuery(query);
    }

    public static void setConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public static Connection getConnection() {
        return connection;
    }


    public static Statement getStatement() {
        return statement;
    }

    public static void setStatement() throws SQLException {
        statement = connection.createStatement();
    }

    public static void connectionTest() throws SQLException {

        if (!connection.isClosed()) {
            System.out.println("Connection established!");
        } else {
            System.out.println("Connection is broken!");
        }
    }
}
