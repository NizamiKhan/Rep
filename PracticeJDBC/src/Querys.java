import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Querys {
    private String query;
    private Statement statement;
    private ResultSet resultSet;
    private Employee employee = new Employee();
    private Dept dept = new Dept();
    private Scanner scanner = new Scanner(System.in);
    private Months months;

    public void printEmployee(Connection connection) throws SQLException {

        System.out.println("Введите индентификатор работника: ");
        int empno = scanner.nextInt();
        query = "SELECT * FROM emp e JOIN dept d ON e.DEPTNO=d.DEPTNO WHERE e.EMPNO=" + empno;
        if (validQ(scanner) == true)
            readEmployee(connection, employee, query);
    }

    public void printEmployees(Connection connection) throws SQLException {

        query = "SELECT * FROM emp e JOIN dept d ON e.DEPTNO=d.DEPTNO";
        readEmployee(connection, employee, query);
    }

    private void readEmployee(Connection connection, Employee employee, String query) throws SQLException {

        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            employee.setEmpno(resultSet.getInt("empno"));
            employee.setEname(resultSet.getString("ename"));
            employee.setJob(resultSet.getString("job"));
            employee.setMgr(resultSet.getInt("mgr"));
            employee.setHiredate(resultSet.getString("hiredate"));
            employee.setSal(resultSet.getDouble("sal"));
            employee.setComm(resultSet.getDouble("comm"));
            employee.setDeptno(resultSet.getInt("deptno"));
            employee.setDname(resultSet.getString("dname"));
            employee.setLoc(resultSet.getString("loc"));
            System.out.println(employee.toString());
        }
    }

    public void printDept(Connection connection) throws SQLException {

        query = "SELECT * FROM DEPT";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            dept.setDeptno(resultSet.getInt("deptno"));
            dept.setDname(resultSet.getString("dname"));
            dept.setLoc(resultSet.getString("loc"));
            System.out.println(dept.toString());
        }
    }

    public void addEmployee(Connection connection) throws SQLException {

        System.out.println("Номер сотрудникаа: ");
        valid(scanner);
        employee.setEmpno(scanner.nextInt());
        System.out.println("Имя: ");
        employee.setEname(scanner.next());
        System.out.println("Работа: ");
        employee.setJob(scanner.next());
        System.out.println("Номер менеджера: ");
        valid(scanner);
        employee.setMgr(scanner.nextInt());
        addHiredate();
        System.out.println("Зарплата: ");
        valid(scanner);
        employee.setSal(scanner.nextDouble());
        System.out.println("Comm: ");
        valid(scanner);
        employee.setComm(scanner.nextDouble());
        System.out.println("Номер департамента: ");
        valid(scanner);
        employee.setDeptno(scanner.nextInt());

        if (validQ(scanner) == true) {
            query = "INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) \n" +
                    "VALUES ("
                    + employee.getEmpno() + ",'"
                    + employee.getEname() + "','"
                    + employee.getJob() + "',"
                    + employee.getMgr() + ",'"
                    + employee.getHiredate() + "',"
                    + employee.getSal() + ","
                    + employee.getComm() + ","
                    + employee.getDeptno() + ")";

            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Работник добавлен.");
        }

    }

    private void addHiredate() {
        System.out.println("Дата приема на работу (в формате DD-MM-YY)");
        System.out.print("День (DD): ");
        valid(scanner);
        employee.setHiredateDay(scanner.nextInt());
        System.out.print("Месяц (1-12): ");
        valid(scanner);
        employee.setHiredateMonth(scanner.nextInt() - 1);
        months = Months.values()[employee.getHiredateMonth()];
        System.out.print("Год (YY): ");
        valid(scanner);
        employee.setHiredateYear(scanner.nextInt());
        employee.setHiredate(employee.getHiredateDay() + "-" + months.toString() + "-" + employee.getHiredateYear());
    }

    public void deleteEmployeeID(Connection connection) throws SQLException {

        System.out.println("Введите идентификатор сотрудника: ");
        employee.setEmpno(scanner.nextInt());
        if (validQ(scanner) == true) {
            query = "delete from emp where EMPNO =" + employee.getEmpno();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Работник с идентификаторм " + employee.getEmpno() + " удален");
        }
    }

    public void deleteEmployeeName(Connection connection) throws SQLException {

        System.out.println("Введите имя сотрудника: ");
        employee.setEname(scanner.next());
        if (validQ(scanner) == true) {
            query = "delete from emp where ENAME='" + employee.getEname() + "'";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Работник с именем " + employee.getEname() + " удален");
        }
    }

    public void searchEmployeeJob(Connection connection) throws SQLException {

        System.out.println("Введите название: ");
        employee.setJob(scanner.next());
        if (validQ(scanner) == true) {
            query = "select*from emp where job=upper('" + employee.getJob() + "')";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Результат поиска: ");
            while (resultSet.next()) {
                employee.setEname(resultSet.getString("ename"));
                System.out.println(employee.getEname());
            }
        }
    }

    public void searchEmployeeDept(Connection connection) throws SQLException {

        System.out.println("Введите подразделение: ");
        dept.setDname(scanner.next());
        if (validQ(scanner) == true) {
            query = "select *from emp where deptno in(select deptno from dept WHERE dname=upper('" + dept.getDname() + "'))";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Результат поиска: ");
            while (resultSet.next()) {
                employee.setEname(resultSet.getString("ename"));
                System.out.println(employee.getEname());
            }
        }
    }

    public void valid(Scanner scanner) {

        do {
            if (scanner.hasNextInt()) {
                return;
            } else {
                System.out.println("Ошибка, введите еще раз (только числа).");
                scanner.next();
            }
        } while (true);
    }

    public boolean validQ(Scanner scanner) {

        System.out.println("Выполнить запрос? (1)");
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() == 1) return true;
        } else {
            scanner.next();
        }
        return false;
    }
}
