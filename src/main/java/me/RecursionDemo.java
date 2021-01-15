package me;

class RecursionTest {
    int values[];

    RecursionTest(int size) {
        this.values = new int[size];
    }

    void printArray(int firstN) {
        if (firstN == 0) {
            return;
        } else {
            printArray(firstN - 1);
            System.out.printf("values[%d] = %d%n", firstN - 1, values[firstN - 1]);
        }
    }

}

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionTest obj = new RecursionTest(10);
        // Using iteration
        for (int i = 0; i < 10; i++) {
            obj.values[i] = i;
        }
        obj.printArray(10);
    }
}
