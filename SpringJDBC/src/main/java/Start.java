import objects.Author;
import objects.AuthorList;

import java.sql.SQLException;
import java.util.ArrayList;

import static objects.AuthorList.printAllAuthors;
import static objects.AuthorList.readAuthorsFromTheDataBase;
import static objects.JDBC.*;

public class Start {

    private static ArrayList<Author> authors = AuthorList.getAuthors();

    public static void main(String[] args) throws SQLException {

        setConnection();
        setStatement();
        connectionTest();

        readAuthorsFromTheDataBase();
        printAllAuthors();

        getConnection().close();
        connectionTest();
    }
}
