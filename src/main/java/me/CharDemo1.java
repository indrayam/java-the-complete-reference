package me;

public class CharDemo1 {
    public static void main(String[] args) {
        char ch1;

        ch1 = 'X';
        System.out.printf("Value of x is %c (0x%x)%n", ch1, (int) ch1);
        ch1++;
        System.out.printf("Value of x is %c (0x%x)%n", ch1, (int) ch1);
    }
}
