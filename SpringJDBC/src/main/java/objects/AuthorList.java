package objects;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import static objects.JDBC.getResultSet;
import static objects.JDBC.setResultSet;


public class AuthorList {

    private static String query;

    private static Iterator<Author> iterator;

    private static ArrayList<Author> authors;

    private AuthorList() {
    }

    public static ArrayList<Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Author>();
        }
        return authors;
    }

    public static void readAuthorsFromTheDataBase() throws SQLException {

        query = "SELECT * FROM author";
        setResultSet(query);
        while (getResultSet().next()) {
            authors.add(new Author(
                    getResultSet().getInt("id"),
                    getResultSet().getString("fio"),
                    getResultSet().getString("birthday")));
        }
    }

    public static void printAllAuthors() {
        iterator = authors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
