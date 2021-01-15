package enums;

enum Apple {GoldenDel, RedDel, Jonathan, Winesap, Cortland}

public class EnumsDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        // Output an enum value
        System.out.printf("Value of ap: %s%n", ap);
        ap = Apple.GoldenDel;
        // Compare two enum values
        if (ap == Apple.GoldenDel) {
            System.out.printf("ap contains GoldenDel.%n");
        }
        // Using enum to control a switch statement
        switch (ap) {
            case Jonathan:
                System.out.printf("Jonathan is red.%n");
                break;
            case GoldenDel:
                System.out.printf("Golden delicious is yellow.%n");
                break;
            case RedDel:
                System.out.printf("Red delicious is red.%n");
                break;
            case Winesap:
                System.out.printf("Winesap is red.%n");
                break;
            case Cortland:
                System.out.printf("Cortland is red.%n");
                break;
        }
        // Iterate through enumerations
        for (Apple apple : Apple.values()) {
            System.out.printf("%s%n", apple);
        }
        ap = Apple.valueOf("RedDel");
        System.out.printf("ap contains %s%n", ap);

    }
}
