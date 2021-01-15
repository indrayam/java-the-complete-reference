package p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.printf("base constructor..%n");
        System.out.printf("n = %d%n", n);
        System.out.printf("n_pri = %d%n", n_pri);
        System.out.printf("n_pro = %d%n", n_pro);
        System.out.printf("n_pub = %d%n", n_pub);
    }
}
