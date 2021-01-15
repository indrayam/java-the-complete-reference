package me;

public class ModulusDemo {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.printf("%d mod 10 = %d%n", x, (x % 10));
        System.out.printf("%.2f mod 10 = %.2f%n", y, (y % 10));
    }
}
