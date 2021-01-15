package exceptions;

public class ChainedExceptionsDemo {
    private static void demoproc() {
        NullPointerException npe = new NullPointerException("A Standard NPE");
        npe.initCause(new ArithmeticException("Root Cause of the NPE"));
        throw npe;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.printf("Caught: %s%n", e);
            System.out.printf("Original Cause: %s%n", e.getCause());
        }
    }
}
