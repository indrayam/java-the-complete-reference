package me;

class Outer {
    private int outer_x;
    // private Inner innerObject;

    Outer(int x) {
        System.out.printf("Instantiating Outer using constructor...%n");
        this.outer_x = x;
        // this.innerObject = new Inner(x);
    }

    private class Inner {
        private int inner_x = 101;

        Inner(int x) {
            System.out.printf("Instantiating Inner using constructor...%n");
            this.inner_x = x;
        }

        void display() {
            System.out.printf("Starting display() method of Inner..%n");
            System.out.printf("Inside inner.display(): outer_x = %d%n", outer_x);
            System.out.printf("Inside inner.display(): inner_x = %d%n", inner_x);
            System.out.printf("Ending display() method of Inner..%n");
        }
    }

    protected static class InnerStatic {
        private int innerStatic_x = 102;
        static {
            System.out.printf("Inside static block of InnerStatic...%n");
        }

        void displayStatic() {
            // System.out.printf("Inside inner.display(): outer_x = %d%n", outer_x);
            System.out.printf("Inside InnerStatic.displayStatic(): inner_x = %d%n", innerStatic_x);
        }

    }

    public void test() {
        System.out.printf("Starting test() method of Outer..%n");
        Inner innerObject = new Inner(101);
        innerObject.display();
        System.out.printf("Inside test() method of Outer: outer_x = %d%n", outer_x);
        // System.out.printf("Outside inner.display(): inner_x = %d%n", inner_x);
        System.out.printf("Ending test() method of Outer..%n");
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        System.out.printf("Starting static main() method of InnerClassDemo..%n");
        Outer outer = new Outer(100);
        outer.test();
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.displayStatic();
        System.out.printf("Ending static main() method of InnerClassDemo..%n");
    }
}
