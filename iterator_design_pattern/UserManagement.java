package iterator_design_pattern;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(users);
    }
}
