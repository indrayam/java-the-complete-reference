package me;

class CBVTest {
    void callByValueMethod(int i, int j) {
        System.out.printf("\tInside method callByValueMethod...%n");
        i *= 2;
        j /= 2;
        System.out.printf("\tValue of i and j inside the method(): %d and %d%n", i, j);
    }
}

public class CallByValue {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        CBVTest cbvDemoObject = new CBVTest();
        System.out.printf("a and b before the method call: %d and %d%n", a, b);
        cbvDemoObject.callByValueMethod(a, b);
        System.out.printf("a and b after the method call: %d and %d%n", a, b);
    }

}
