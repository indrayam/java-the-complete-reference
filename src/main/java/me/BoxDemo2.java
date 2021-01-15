package me;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double volume;

        // assign value to box1's instance variables
        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        // assign value to box2's instance variables
        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        // compute volume of box1
        volume = box1.width * box1.height * box1.depth;
        System.out.printf("Volume of box1 is %.2f%n", volume);

        // compute volume of box2
        volume = box2.width * box2.height * box2.depth;
        System.out.printf("Volume of box2 is %.2f%n", volume);


    }
}
