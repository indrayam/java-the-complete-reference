package me;

class NewOuter {
    static {
        System.out.printf("Inside static block of NewOuter...%n");
    }

    private int outer_x = 100;

    NewOuter(int outer_x) {
        System.out.printf("Instantiating a new NewOuter object...%n");
        this.outer_x = outer_x;
    }

    void test() {
        System.out.printf("Starting test()...%n");
        class Inner {
            Inner(int loopVar) {
                System.out.printf("Instantiating a new Inner object for loop # %d. outer_x was %d%n", loopVar, outer_x);
            }

            void display(int loopVar) {
                outer_x = loopVar;
                System.out.printf("Calling display() for loop %d.  outer_x is now %d%n", loopVar, outer_x);
            }
        }
        for (int i = 0; i < 10; i++) {
            Inner inner = new Inner(i);
            inner.display(i);
        }
        System.out.printf("Ending test()...%n");
    }
}

public class InnerClassDemo1 {
    public static void main(String[] args) {
        NewOuter outer = new NewOuter(200);
        outer.test();
    }
}
