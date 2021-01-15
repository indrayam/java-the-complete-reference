package me;

class Test {
    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test testObject) {
        if ((this.a == testObject.a) && (this.b == testObject.b)) {
            return true;
        } else {
            return false;
        }
    }
}


public class PassObjectsDemo {
    public static void main(String[] args) {
        Test testObject1 = new Test(100, 22);
        Test testObject2 = new Test(100, 22);
        Test testObject3 = new Test(-1, -1);

        System.out.printf("testObject1 == testObject2: %b%n", testObject1.equalTo(testObject2));
        System.out.printf("testObject1 == testObject3: %b%n", testObject1.equalTo(testObject3));
    }
}
