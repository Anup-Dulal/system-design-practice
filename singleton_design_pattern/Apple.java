package singleton_design_pattern;

public class Apple {

    private static Apple apple;

    // private constructor to prevent instantiation
    private Apple() {}

    // lazy, thread-safe accessor
    public static Apple getInstance() {
        synchronized (Apple.class) {
            if (apple == null) {
                apple = new Apple();
            }
        }
        return apple;
    }
}
