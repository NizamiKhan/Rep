import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Body extends CRUD {
    public Body() {
    }

    public void bodyStart(Connection connection) throws SQLException {
        CRUD crud = new CRUD();
        System.out.println("1. Вывод таблицы");
        System.out.println("2. ");
        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        switch (key) {
            case 1: {
                System.out.println("1. us");
                System.out.println("2. address");
                System.out.println("Введите число: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1: {
                        crud.printActor(connection);
                        break;
                    }
                    case 2:
                        crud.printAddress(connection);
                        break;
                }
                break;
            }
            case 2:{
                System.out.println("второй  пунтк");
            }
        }
    }


}
