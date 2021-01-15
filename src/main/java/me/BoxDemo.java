package me;

class Box {
    double width;
    double height;
    double depth;

}

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        double volume;

        box.width = 10;
        box.height = 20;
        box.depth = 15;

        // Calculate the volume of the Box
        volume = box.width * box.height * box.depth;
        System.out.printf("Volume of the Box - %.2f%n", volume);

    }
}
