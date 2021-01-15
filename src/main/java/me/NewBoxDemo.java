package me;

class NewBox {
    double width;
    double height;
    double depth;

    void volume(String boxName) {
        double volume = this.width * this.height * this.depth;
        System.out.printf("Volume of the box %s = %.2f%n", boxName, volume);
    }
}

public class NewBoxDemo {

    public static void main(String[] args) {
        NewBox mybox1 = new NewBox();
        NewBox mybox2 = new NewBox();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // display volume of box1
        mybox1.volume("mybox1");

        // display volume of box2
        mybox2.volume("mybox2");

    }
}
