package exceptions;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        try {
            for (int i = 0; i < 32000; i++) {
                b = 100 + r.nextInt(100);
                c = 10 + r.nextInt(100);
                a = 12345 / (b / c);
                System.out.printf("a: %d%n", a);
            }
        } catch (ArithmeticException e) {
            System.out.printf("%s%n", e);
            System.out.printf("Division by zero detected where b = %d and c = %d%n", b, c);
            a = 0;
        }
        System.out.printf("Signing off with a: %d%n", a);
    }
}
