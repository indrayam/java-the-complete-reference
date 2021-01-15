package me;

public class UseStatic {
    static int a = 3;
    static int b;

    static {
        System.out.printf("Static block initialized...%n");
        b = a * 4;
    }

    static void aMethod(int x) {
        System.out.printf("x = %d%n", x);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
    }

    public static void main(String[] args) {
        System.out.printf("In main...%n");
        aMethod(42);
    }
}
