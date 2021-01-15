package interfaces;

public class MyInterfaceImpl2 implements MyInterface {
    @Override
    public int getNumber() {
        return 200;
    }

    @Override
    public String getString() {
        return "This is a different string.";
    }
}
