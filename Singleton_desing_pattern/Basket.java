package Singleton_desing_pattern;

public class Basket {
    
    public static void main(String[] args) {
        Apple apple1 = Apple.getInstance();
        Apple apple2 = Apple.getInstance();

        //both apple1 and apple2 should point to the same instance
        System.out.println(apple1.hashCode() == apple2.hashCode()); //true
    }
}
