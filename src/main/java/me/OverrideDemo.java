package me;

class A3 {
    int i;
    int j;

    A3(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.printf("i and j: %d and %d%n", i, j);
    }

    void anA3MethodOnly() {
        System.out.printf("An A3 method only...%n");
    }

}

class B3 extends A3 {
    int k;

    B3(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void aB3MethodOnly() {
        System.out.printf("A B3 method only...%n");
    }

    @Override
    void show() {
        super.show();
        System.out.printf("k: %d%n", k);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        B3 b = new B3(1, 2, 3);
        b.show();
        b.anA3MethodOnly();
        b.aB3MethodOnly();

        A3 a = b;
        a.show();
        a.anA3MethodOnly();
        // a.aB3MethodOnly();

    }
}
