package pack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] balances = new Balance[3];

        balances[0] = new Balance("K. J. Fielding", 123.23);
        balances[1] = new Balance("Will Tell", 157.02);
        balances[2] = new Balance("K. J. Fielding", -12.23);

        for (int i = 0; i < 3; i++) {
            balances[i].show();
        }
    }
}
