package me;

public class Average {
    public static void main(String[] args) {
        double num[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0.0;

        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }

        System.out.printf("Average = %.2f%n", result);
    }
}
