package Singleton_desing_pattern;

public class Apple {

    private static Apple apple;

    //private constructor to prevent instantiation from other classes
    private Apple() {}

    //lazy initialization of the singleton instance
    public static Apple getInstance(){

        //using synchronized block to ensure thread safety
        synchronized (Apple.class) {
            if (apple == null) {
                apple = new Apple();
            }
        }
        return apple;

    }
    
}
