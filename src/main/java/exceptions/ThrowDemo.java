package exceptions;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.printf("Recaught: %s%n", e.getMessage());
        }
    }

    private static void demoproc() {
        try {
            throw new NullPointerException("NPE for Demo Purposes");
        } catch (NullPointerException e) {
            System.out.printf("Caught inside demoproc()..%n");
            throw e;
        }
    }
}
