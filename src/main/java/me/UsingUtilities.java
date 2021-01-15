package me;

public class UsingUtilities implements IWork {

    @Override
    public void doSomething() {
        System.out.printf("%s%n", "performed work");
    }
    public static void main(String[] args) {
        final OneToOne toOne = new OneToOne();
        System.out.println(toOne.getType());
        final ManyToOne manyToOne = new ManyToOne();
        System.out.println(manyToOne.getType());
        final UsingUtilities util = new UsingUtilities();
        util.doSomething();
    }
}
