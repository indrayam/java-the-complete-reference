package stack;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        throw new UnsupportedOperationException("clear() not implemented!");
    }
}
