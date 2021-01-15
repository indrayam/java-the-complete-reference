package me;

class TheBox {
    private double width;
    private double height;
    private double depth;

    TheBox() {
        System.out.printf("Instantiating TheBox, no parameters...%n");
        width = -1;
        height = -1;
        depth = -1;
    }

    TheBox(TheBox box) {
        System.out.printf("Instantiating TheBox, with TheBox as the parameter...%n");
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }

    TheBox(double width, double height, double depth) {
        System.out.printf("Instantiating TheBox, with width, height and depth as the parameters...%n");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    TheBox(double common) {
        System.out.printf("Instantiating TheBox, with common length as the parameter...%n");
        this.width = common;
        this.height = common;
        this.depth = common;
    }

    double volume() {
        return width * height * depth;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    double getDepth() {
        return this.depth;
    }

}

class TheBoxWeight extends TheBox {
    private double weight;

    TheBoxWeight() {
        super();
        this.weight = -1;
    }

    TheBoxWeight(TheBoxWeight box) {
        super(box);
        this.weight = box.weight;
    }

    TheBoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    TheBoxWeight(double common, double weight) {
        /*super(common);
        this.weight = weight;*/
        this(common, common, common, weight);
    }

    double getWeight() {
        return this.weight;
    }
}

class TheShipment extends TheBoxWeight {
    private double cost;

    TheShipment() {
        super();
        this.cost = -1;
    }

    TheShipment(TheShipment box) {
        super(box);
        this.cost = box.cost;
    }

    TheShipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    TheShipment(double common, double weight, double cost) {
        super(common, weight);
        this.cost = cost;
    }

    double getCost() {
        return this.cost;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        double volume;

        TheBoxWeight box1 = new TheBoxWeight(10, 20, 15, 34.3);
        volume = box1.volume();
        System.out.printf("Volume of box1 = %.2f%n", volume);
        System.out.printf("Weight of box1 = %.2f%n", box1.getWeight());

        TheBoxWeight box2 = new TheBoxWeight(2, 3, 4, 0.076);
        volume = box2.volume();
        System.out.printf("Volume of box2 = %.2f%n", volume);
        System.out.printf("Weight of box2 = %.3f%n", box2.getWeight());

        TheBoxWeight box3 = new TheBoxWeight(3, 5, 7, 8.37);
        volume = box3.volume();
        System.out.printf("Volume of box3 = %.2f%n", volume);
        System.out.printf("Weight of box3 = %.2f%n", box1.getWeight());

        TheBox plainBox = box3;

        volume = plainBox.volume();
        System.out.printf("Volume of plainbox = %.2f%n", volume);
        // System.out.printf("Weight of plainbox = %.2f%n", plainBox.getWeight());


        TheBoxWeight cube = new TheBoxWeight(3, 2);
        System.out.printf("Volume of cube = %.2f%n", cube.volume());
        System.out.printf("Volume of cube = %.2f%n", cube.getWeight());

        TheBoxWeight clone = new TheBoxWeight(box3);
        System.out.printf("Volume of clone = %.2f%n", clone.volume());
        System.out.printf("Volume of clone = %.2f%n", clone.getWeight());

        TheShipment shipment1 = new TheShipment(10, 20, 15, 10, 3.41);
        volume = shipment1.volume();
        System.out.printf("Volume of shipment1 = %.2f%n", volume);
        System.out.printf("Volume of shipment1 = %.2f%n", shipment1.getWeight());
        System.out.printf("Cost of shipment1 = %.2f%n", shipment1.getCost());

        TheShipment shipment2 = new TheShipment(2, 3, 4, 0.76, 1.28);
        volume = shipment2.volume();
        System.out.printf("Volume of shipment2 = %.2f%n", volume);
        System.out.printf("Volume of shipment2 = %.2f%n", shipment2.getWeight());
        System.out.printf("Cost of shipment2 = %.2f%n", shipment2.getCost());
    }
}
