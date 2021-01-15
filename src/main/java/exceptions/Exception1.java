package exceptions;

public class Exception1 {
    public static void main(String[] args) {
        callMe();
    }

    private static void callMe() {
        try {
            int d = 0;
            int a = 42 / d;
            System.out.printf("This will not be printed.%n");
        } catch (ArithmeticException e) {
            System.out.printf("Why are you dividing by zero, dork?%n");
        }
        System.out.printf("After catch statement.%n");
    }
}
