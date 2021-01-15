package me;

class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callMe() {
        System.out.printf("a = %d%n", a);
    }
}

public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callMe();
        System.out.printf("b = %d%n", StaticDemo.b);
    }
}


