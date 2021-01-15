package p2;

import p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.printf("derived, different package constructor..%n");
        // System.out.printf("n = %d%n", n);
        // System.out.printf("n_pri = %d%n", n_pri);
        System.out.printf("n_pro = %d%n", n_pro);
        System.out.printf("n_pub = %d%n", n_pub);
    }
}
