package me;

class AnotherBox {
    double width;
    double height;
    double depth;

    AnotherBox(double width, double height, double depth) {
        System.out.printf("Constructing a Box with all 3 dimensions provided...%n");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    AnotherBox() {
        System.out.printf("Constructing a Box with no dimensions provided...%n");
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    AnotherBox(double commonLength) {
        System.out.printf("Constructing a Box (cube) with one dimension provided...%n");
        this.width = commonLength;
        this.height = commonLength;
        this.depth = commonLength;
    }

    AnotherBox(AnotherBox box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }

    double volume() {
        return width * height * depth;
    }

}

public class AnotherBoxDemo {
    public static void main(String[] args) {
        AnotherBox mybox1 = new AnotherBox(10, 20, 15);
        AnotherBox mybox2 = new AnotherBox(3, 6, 9);
        AnotherBox mybox3 = new AnotherBox();
        AnotherBox myCube = new AnotherBox(7);
        AnotherBox mybox4 = new AnotherBox(mybox1);

        System.out.printf("Volume of mybox1 = %.2f%n", mybox1.volume());
        System.out.printf("Volume of mybox2 = %.2f%n", mybox2.volume());
        System.out.printf("Volume of mybox3 = %.2f%n", mybox3.volume());
        System.out.printf("Volume of myCube = %.2f%n", myCube.volume());
        System.out.printf("Volume of mybox4 = %.2f%n", mybox4.volume());
    }
}
