package stack;

public class FixedStack implements IntStack {
    private int stack[];
    private int topOfTheStack;

    FixedStack(int size) {
        this.stack = new int[size];
        this.topOfTheStack = -1;
    }

    @Override
    public void push(int item) {
        if (topOfTheStack == (this.stack.length - 1)) {
            System.out.printf("Overflow..%n");
        } else {
            stack[++topOfTheStack] = item;
        }
    }

    @Override
    public int pop() {
        if (this.topOfTheStack < 0) {
            System.out.printf("Underflow..%n");
            return -1;
        } else {
            return this.stack[topOfTheStack--];
        }
    }
}
