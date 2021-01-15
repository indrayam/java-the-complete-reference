package p2;

import p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new p1.Protection();
        System.out.printf("other package constructor..");
        // System.out.printf("n = %d%n", p.n);
        // System.out.printf("n_pri = %d%n", p.n_pri);
        // System.out.printf("n_pro = %d%n", p.n_pro);
        System.out.printf("n_pub = %d%n", p.n_pub);
    }
}
