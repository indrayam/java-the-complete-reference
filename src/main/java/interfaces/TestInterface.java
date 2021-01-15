package interfaces;

public class TestInterface {
    public static void main(String[] args) {
        System.out.printf("Using the implementation class as a reference...%n");
        CallbackImpl callback = new CallbackImpl();
        callback.callback(42);
        callback.nonInterfaceMethod();
        System.out.println();

        System.out.printf("Using the interface as a reference...%n");
        Callback iCallback = new CallbackImpl();
        iCallback.callback(42);
        // iCallback.nonInterfaceMethod();
        System.out.println();

        System.out.printf("Using the interface as a reference to refer to another instance...%n");
        AnotherCallbackImpl anotherCallback = new AnotherCallbackImpl();
        iCallback = anotherCallback;
        iCallback.callback(42);
    }
}
