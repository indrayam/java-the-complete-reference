package interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImpl();
        System.out.printf("%d%n", obj.getNumber());
        System.out.printf("%s%n", obj.getString());

        MyInterface obj1 = new MyInterfaceImpl2();
        System.out.printf("%d%n", obj1.getNumber());
        System.out.printf("%s%n", obj1.getString());

        System.out.printf("Default Number: %d%n", MyInterface.getDefaultNumber());
    }
}
