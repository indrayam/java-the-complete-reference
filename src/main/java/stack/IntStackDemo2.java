package stack;

public class IntStackDemo2 {
    public static void main(String[] args) {
        IntStack stack;
        DynamicStack ds = new DynamicStack(5);
        FixedStack fs = new FixedStack(10);

        // Load FixedStack
        stack = fs;
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // Load Dynamic Stack
        stack = ds;
        for (int i = 10; i < 20; i++) {
            stack.push(i);
        }

        // Show contents of FixedStack
        stack = fs;
        System.out.printf("Contents of Fixed Stack..%n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println();

        // Show contents of DynamicStack
        stack = ds;
        System.out.printf("Contents of Dynamic Stack..%n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println();



    }
}
