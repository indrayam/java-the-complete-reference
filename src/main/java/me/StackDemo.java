package me;

class Stack {
    int stack[] = new int[10];
    int topofstack;

    // Initialize a Stack by setting Top-of-Stack
    Stack() {
        topofstack = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (topofstack == 9) {
            System.out.printf("Stack overflow. Ignoring the push. %n");
        } else {
            stack[++topofstack] = item;
        }
    }

    // Pop item from the stack
    int pop() {
        if (topofstack < 0) {
            System.out.printf("Stack underflow. %n");
            return 0;
        } else {
            return stack[topofstack--];
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        // pop those numbers from the stack
        System.out.printf("Stack in mystack1...");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", mystack1.pop());
        }
        System.out.println();
        System.out.printf("Stack in mystack2...");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", mystack2.pop());
        }
        System.out.println();
    }
}
