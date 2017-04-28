import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        DBWork dbWork = new DBWork();
        String query = "select * from users";
        try {
            statement = DBWork.getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.getStackTrace();
        }

    }
}