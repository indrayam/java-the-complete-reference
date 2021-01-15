package me;

class Factorial {
    int factorial(int n) {
        System.out.printf("Called with n = %d%n", n);
        int result;

        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
public class FactorialDemo {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.printf("...Factorial of 3 is %d%n", factorial.factorial(3));
        System.out.printf("...Factorial of 4 is %d%n", factorial.factorial(4));
        System.out.printf("...Factorial of 5 is %d%n", factorial.factorial(5));
    }
}
