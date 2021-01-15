package pack;

public class Balance {
    String name;
    double balance;

    public Balance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void show() {
        if (balance < 0) {
            System.out.printf("--> ");
        }
        System.out.printf("%s : $%.2f%n", name, balance);
    }
}
