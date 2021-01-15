package interfaces;

public class CallbackImpl implements Callback {
    @Override
    public void callback(int value) {
        System.out.printf("callback called with %d%n", value);
    }

    public void nonInterfaceMethod() {
        System.out.printf("Classes that implement interfaces may also define other methods as well...%n");
    }
}
