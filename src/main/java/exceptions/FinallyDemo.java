package exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.printf("Exception caught in main(): %s%n", e);
        }
        procB();
        procC();
    }

    private static void procA() {
        try {
            System.out.printf("Inside procA()..%n");
            throw new RuntimeException("demo");
        } finally {
            System.out.printf("procA()'s finally..%n");
        }
    }

    private static void procB() {
        try {
            System.out.printf("Inside procB()..%n");
            return;
        } finally {
            System.out.printf("procB()'s finally..%n");
        }
    }

    private static void procC() {
        try {
            System.out.printf("Inside procC()..%n");
        } finally {
            System.out.printf("procC()'s finally..%n");
        }
    }
}
