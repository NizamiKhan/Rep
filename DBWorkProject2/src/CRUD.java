import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    private Statement statement;
    private ResultSet resultSet;

    public void printActor(Connection connection) throws SQLException {
        String query = "select * from us";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String age = resultSet.getString("age");
            String email = resultSet.getString("email");
            System.out.println("{id: " + id
                    + ", name: " + name
                    + ", age: " + age
                    + ", email: "+email);
        }
    }

    public void printAddress(Connection connection) throws SQLException {
        String query = "select * from users";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String addres = resultSet.getString("username");
            String district = resultSet.getString("password");
            System.out.println("{address_id: " + id
                    + ", address: " + addres
                    + ", district: " + district + "}");
        }
    }
}
