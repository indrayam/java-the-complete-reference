package me;

class A1 {
    private int i;
    private int j;

    A1() {
        System.out.printf("Creating A1 using default constructor...%n");
        this.i = 10;
        this.j = 20;
    }

    A1(int i, int j) {
        System.out.printf("Creating A1 using non-default constructor...%n");
        this.i = i;
        this.j = j;
    }

    void showIJ() {
        System.out.printf("i and j: %d and %d%n", i, j);
    }

    int sumIJ() {
        return i + j;
    }

}

class B1 extends A1 {
    private int k;

    B1() {
        super();
        System.out.printf("Creating B1 using default constructor...%n");
        this.k = 30;
    }

    B1(int i, int j, int k) {
        super(i, j);
        System.out.printf("Creating B1 using non-default constructor...%n");
        this.k = k;
    }

    void showK() {
        System.out.printf("k: %d%n", k);
    }

    int sumIJK() {
        return sumIJ() + k;
    }

}


public class InheritanceDemo {
    public static void main(String[] args) {
        A1 superObject = new A1();
        System.out.printf("Contents of superObject:%n");
        superObject.showIJ();
        System.out.printf("Sum of i and j in superObject: %d%n", superObject.sumIJ());
        System.out.println();

        A1 superObject1 = new A1(11, 22);
        System.out.printf("Contents of superObject1:%n");
        superObject1.showIJ();
        System.out.printf("Sum of i and j in superObject1: %d%n", superObject1.sumIJ());
        System.out.println();

        B1 subObject = new B1();
        System.out.printf("Contents of subObject:%n");
        subObject.showIJ();
        subObject.showK();
        System.out.printf("Sum of i, j and k in subObject: %d%n", subObject.sumIJK());
        System.out.println();

        B1 subObject1 = new B1(7, 8, 9);
        System.out.printf("Contents of subObject1:%n");
        subObject1.showIJ();
        subObject1.showK();
        System.out.printf("Sum of i, j and k in subObject1: %d%n", subObject1.sumIJK());
        System.out.println();
    }
}
