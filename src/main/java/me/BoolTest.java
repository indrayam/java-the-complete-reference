package me;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.printf("b is %b%n", b);
        b = true;
        System.out.printf("b is %b%n", b);

        if (b) {
            System.out.printf("This is executed.%n");
        }

        b = false;
        if (b) {
            System.out.printf("This is not executed.%n");
        }

        System.out.printf("10 > 9 is %b%n", (10 > 9));

    }
}
