package me;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.printf("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("ANAND")) {
            System.out.printf("You entered...%s%n", name);
        } else if(name.equalsIgnoreCase("ShANNON")) {
            System.out.printf("You entered...%s%n", name);
        } else {
            System.out.printf("Beats me%n");
        }

        int num = 1;
        while (num <= 10) {
            System.out.printf("%d..", num);
            num++;
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d..", i);
        }
        System.out.println();
    }
}
