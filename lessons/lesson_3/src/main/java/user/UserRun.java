package user;

import java.util.*;

public class UserRun {
    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("1", "first"));
        users.add(new User("2", "first"));
        users.add(new User("3", "first"));

        for (User user : users) {
            System.out.println(user);
        }

        Iterator iterator = users.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

