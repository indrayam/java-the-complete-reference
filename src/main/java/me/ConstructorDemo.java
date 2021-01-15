package me;

class A2 {
    A2() {
        System.out.printf("Instantiating A...%n");
    }
}

class B2 extends A2 {
    B2() {
        System.out.printf("Instantiating B...%n");

    }
}

class C2 extends B2 {
    C2() {
        System.out.printf("Instantiating C...%n");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}
