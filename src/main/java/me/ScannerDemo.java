package me;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.printf("What's your name: ");
        String name = scanner.nextLine();
        System.out.printf("What's your age: ");
        int age = scanner.nextInt();
        System.out.printf("Hello %s. Next year, you will be %d%n", name, ++age);
    }
}
