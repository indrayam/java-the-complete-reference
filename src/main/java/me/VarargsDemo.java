package me;

public class VarargsDemo {

    static void vargsTest(String message, int... v) {
        System.out.printf("Message: %s, Number of args: %d, Contents: ", message, v.length);
        for (int i : v) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static void vargsTest(boolean... v) {
        System.out.printf("Number of args: %d, Contents: ", v.length);
        for (boolean b : v) {
            System.out.printf("%b ", b);
        }
        System.out.println();
    }

    static void vargsTest(int v) {
        System.out.printf("Only 1 integer passed. Contents: %d%n", v);
    }

    public static void main(String[] args) {
        vargsTest( 10);
        vargsTest("Three varargs", 1, 2, 3);
        vargsTest(true, false, true);
    }
}
