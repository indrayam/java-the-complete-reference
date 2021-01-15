package interfaces;

public class AnotherCallbackImpl implements Callback {
    @Override
    public void callback(int value) {
        System.out.printf("Another version of callback..%n");
        System.out.printf("square of the value passed = %d%n", (value * value));
    }
}
