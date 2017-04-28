import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkDb {

    private Statement statement;
    private ResultSet resultSet;

    private String query;
    private int deptno;
    private String dname;
    private String loc;

    public void readDB(Connection connection) throws SQLException {

        query = "select * from dept";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            deptno = resultSet.getInt("deptno");
            dname = resultSet.getString("dname");
            loc = resultSet.getString("loc");
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "WorkDb{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}


