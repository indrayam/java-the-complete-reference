package p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.printf("Same package constructor");
        System.out.printf("n = %d%n", p.n);
        // System.out.printf("n_pri = %d%n", p.n_pri);
        System.out.printf("n_pro = %d%n", p.n_pro);
        System.out.printf("n_pub = %d%n", p.n_pub);
    }
}
