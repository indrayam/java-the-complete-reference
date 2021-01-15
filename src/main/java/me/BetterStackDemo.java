package me;

import java.util.concurrent.ThreadLocalRandom;

class BetterStack {
    private int stack[];
    private int topOfStack;

    BetterStack(int size) {
        this.stack = new int[size];
        this.topOfStack = -1;
    }

    void push(int item) {
        if (topOfStack == stack.length - 1) {
            System.out.printf("Stack overflow...");
        } else {
            stack[++topOfStack] = item;
        }
    }

    int pop() {
        if (topOfStack < 0) {
            System.out.printf("Stack underflow...");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }

}

public class BetterStackDemo {
    public static void main(String[] args) {
        final int size1 = 5;
        final int size2 = 10;
        BetterStack stack1 = new BetterStack(size1);
        BetterStack stack2 = new BetterStack(size2);

        int start = ThreadLocalRandom.current().nextInt(0, 100);
        for (int i = start; i < start + size1; i++) {
            stack1.push(i);
        }

        start = ThreadLocalRandom.current().nextInt(100, 200);
        for (int i = start; i < start + size2; i++) {
            stack2.push(i);
        }

        System.out.printf("Stack in stack1: ");
        for (int i = 0; i < size1; i++) {
            System.out.printf("%d ", stack1.pop());
        }
        System.out.println();
        System.out.printf("Stack in stack2: ");
        for (int i = 0; i < size2; i++) {
            System.out.printf("%d ", stack2.pop());
        }
        System.out.println();
        /*stack1.topOfStack = -1;
        stack2.stack[3] = 100;*/
    }
}
