package enums;

enum NewApple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    static {
        System.out.printf("NewApple static initialization block..%n");
    }

    {
        System.out.printf("Instance initialization block for %s and ordinal number is %d..%n", this, this.ordinal());
    }

    private int price;

    NewApple(int p) {
        System.out.printf("NewApple constructor called..%n");
        this.price = p;
    }

    int getPrice() {
        return this.price;
    }
}

public class EnumsDemo1  {
    public static void main(String[] args) {
        NewApple ap;
        System.out.printf("About to call Winesap getPrice() method...%n");
        System.out.printf("Winesap costs %d cents!%n", NewApple.Winesap.getPrice());
        System.out.printf("All NewApple prices...%n");
        for (NewApple apple : NewApple.values()) {
            System.out.printf("%s costs %d cents.%n", apple, apple.getPrice());
        }
    }
}
