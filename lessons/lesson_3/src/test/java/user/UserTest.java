package user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void reflexive() {
        User user = new User("1", "1");
        assertEquals(user, user);
    }

    @Test
    public void symmetric() {
        User u1 = new User("1", "2");
        User u2 = new User("1", "2");
        assertEquals(u1, u2);
        assertEquals(u2, u1);
    }

    @Test
    public void transitive() {
        User u1 = new User("1", "2");
        User u2 = new User("1", "2");
        User u3 = new User("1", "2");
        assertEquals(u1, u2);
        assertEquals(u2, u3);
        assertEquals(u1, u3);
    }

    @Test
    public void consistent() {
        User u1 = new User("1", "2");
        User u2 = new User("1", "2");
        for (int i = 0; i < 10; i++)
            assertEquals(u1, u2);
    }
}