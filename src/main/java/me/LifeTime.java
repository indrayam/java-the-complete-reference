package me;

public class LifeTime {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int y = -1;
            System.out.printf("y is: %d%n", y);
            y = 100;
            System.out.printf("y is: %d%n", y);
        }
    }
}
