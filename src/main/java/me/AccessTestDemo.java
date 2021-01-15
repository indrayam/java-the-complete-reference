package me;

class AccessTest {
    int a;
    public int b;
    private int c;

    void setC(int c) {
        this.c = c;
    }

    int getC() {
        return this.c;
    }
}

public class AccessTestDemo {
    public static void main(String[] args) {
        AccessTest obj = new AccessTest();
        obj.a = 10;
        obj.b = 10;
        // obj.c = 100;
        obj.setC(100);
        System.out.printf("a, b and c: %d, %d and %d%n", obj.a, obj.b, obj.getC());
    }
}
