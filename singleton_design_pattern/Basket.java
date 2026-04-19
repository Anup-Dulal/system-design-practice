package singleton_design_pattern;

public class Basket {
    public static void main(String[] args) {
        Apple apple1 = Apple.getInstance();
        Apple apple2 = Apple.getInstance();

        // both references should be identical
        System.out.println(apple1.hashCode() == apple2.hashCode()); // true
    }
}
