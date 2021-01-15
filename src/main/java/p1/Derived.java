package p1;

public class Derived extends Protection {
    Derived() {
        System.out.printf("derived constructor..%n");
        System.out.printf("n = %d%n", n);
        // System.out.printf("n_pri = %d%n", n_pri);
        System.out.printf("n_pro = %d%n", n_pro);
        System.out.printf("n_pub = %d%n", n_pub);
    }
}
