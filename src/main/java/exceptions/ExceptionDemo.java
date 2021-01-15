package exceptions;

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        this.detail = a;
    }

    public String toString() {
        return String.format("MyException[%d]", this.detail);
    }
}

public class ExceptionDemo {
    private static void compute(int a) throws MyException {
        System.out.printf("Called compute(%d)..%n", a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.printf("Normal exit.%n");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.printf("Caught %s%n", e);
        }
    }
}
