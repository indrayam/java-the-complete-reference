package me;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String name = console.readLine("What's your name: ");
            System.out.printf("What's your age: ");
            int age = Integer.parseInt(console.readLine());
            System.out.printf("Hello %s. Next year, you will be %d%n", name, ++age);
        } else {
            System.out.println("Hmm. The Console is null..");
        }
    }
}
