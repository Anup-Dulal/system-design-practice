package builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("Alice")
                .setEmail("alice@example.com")
                .setAge(30)
                .build();

        System.out.println(user);
    }
}
