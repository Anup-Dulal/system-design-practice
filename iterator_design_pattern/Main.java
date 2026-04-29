package iterator_design_pattern;

public class Main {

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Alice", 30));
        userManagement.addUser(new User("Bob", 25));
        userManagement.addUser(new User("Charlie", 35));

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.getName() + " - " + user.getAge());
        }
    }
    
}
