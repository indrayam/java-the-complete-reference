package me;

class NewerBox {
    double width;
    double height;
    double depth;

    double volume() {
        return this.width * this.height * this.depth;
    }
}

public class NewerBoxDemo {
    public static void main(String[] args) {
        NewerBox mybox1 = new NewerBox();
        NewerBox mybox2 = new NewerBox();
        double volume;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // get volume of mybox1
        volume = mybox1.volume();
        System.out.printf("Volume of mybox1 is %.2f%n", volume);

        // get volume of mybox2
        volume = mybox2.volume();
        System.out.printf("Volume of mybox2 is %.2f%n", volume);

    }
}
