import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Body extends Querys {

    private Scanner scanner;
    private int key;
    private boolean aBoolean;

    public Body() {
    }

    public void bodyStart(Connection connection) throws SQLException {

        do {
            Querys querys = new Querys();
            System.out.println("1. Вывод таблиц");
            System.out.println("2. Cведения о работнике");
            System.out.println("3. Добавить работника");
            System.out.println("4. Удалить работника");
            System.out.println("5. Поиск работников");
            System.out.println("Введите число: ");

            scanner = new Scanner(System.in);
            valid(scanner);
            key = scanner.nextInt();
            switch (key) {
                case 1: {
                    System.out.println("1. Служащие"); //эмплоее
                    System.out.println("2. Подразделения "); //департмент
                    System.out.println("Введите число: ");
                    valid(scanner);
                    key = scanner.nextInt();
                    switch (key) {
                        case 1: {
//                            System.out.println("Выполнить запрос? (1)");
//                            key = scanner.nextInt();
//                            if (key == 1)
                            if (validQ(scanner) == true)
                                querys.printEmployees(connection);
                            break;
                        }
                        case 2: {
                            if (validQ(scanner) == true)
                                querys.printDept(connection);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    querys.printEmployee(connection);
                    break;
                }
                case 3: {
                    querys.addEmployee(connection);
                    break;
                }
                case 4: {
                    System.out.println("1. Удалить по идентификатору");
                    System.out.println("2. Удалить по имени");
                    valid(scanner);
                    key = scanner.nextInt();
                    switch (key) {
                        case 1: {
                            querys.deleteEmployeeID(connection);
                            break;

                        }
                        case 2: {
                            querys.deleteEmployeeName(connection);
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("1. Поиск по категории(работе)");
                    System.out.println("2. Поиск по подразделению");
                    valid(scanner);
                    key = scanner.nextInt();
                    switch (key) {
                        case 1: {
                            querys.searchEmployeeJob(connection);
                            break;
                        }
                        case 2: {
                            querys.searchEmployeeDept(connection);
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Вернуться в меню? (1)");
            key = scanner.nextInt();
        } while (key == 1);
    }
}

