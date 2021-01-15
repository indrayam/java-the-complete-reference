package me;

class Overload {
    void test() {
        System.out.println("No parameters.");
    }

    void test(int a) {
        System.out.printf("a: %d%n", a);
    }

    void test(int a, int b) {
        System.out.printf("a and b: %d and %d%n", a, b);
    }

    double test(double a) {
        System.out.printf("double a: %.2f%n", a);
        return a * a;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        double result;

        overload.test();
        overload.test(10);
        overload.test(10, 20);
        result = overload.test(123.25);
        System.out.printf("Result of calling test with double %.2f = %.2f%n", 123.25, result);
    }
}
