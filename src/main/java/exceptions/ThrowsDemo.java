package exceptions;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.printf("Yup, it happened..%n%s%n", e);
        }
    }

    private static void throwOne() throws IllegalAccessException {
        System.out.printf("Inside throwOne..%n");
        throw new IllegalAccessException("demo");
        // throw new RuntimeException("Demo");
    }
}
