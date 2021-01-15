package stack;

public class IntStackDemo1 {
    public static void main(String[] args) {
        DynamicStack stack1 = new DynamicStack(10);
        DynamicStack stack2 = new DynamicStack(20);

        // Populate the stacks
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 10; i < 30; i++) {
            stack2.push(i);
        }

        System.out.printf("stack1 members..%n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", stack1.pop());
        }
        System.out.println();

        System.out.printf("stack2 members..%n");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d ", stack2.pop());
        }
        System.out.println();    }
}
