package stack;

public class DynamicStack implements IntStack {
    private int stack[];
    private int topOfStack;
    private int size;

    DynamicStack(int size) {
        this.stack = new int[size];
        this.topOfStack = -1;
        this.size = size;
    }

    @Override
    public void push(int item) {
        if (topOfStack == this.stack.length - 1) {
            System.out.printf("Resizing the DynamicStack..%n");
            this.size += 10;
            int newStack[] = new int[size];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            this.stack = newStack;
        }
        this.stack[++topOfStack] = item;
    }

    @Override
    public int pop() {
        if (topOfStack < 0) {
            System.out.printf("Stack underflow..%n");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }
}
