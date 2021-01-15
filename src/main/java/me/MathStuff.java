package me;

import static java.lang.Math.*;

public class MathStuff {
    public static void main(String[] args) {
        System.out.println("The square root of \u23F3 is " + sqrt(PI));
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx);
        int fx = (int) Math.round(x);
        System.out.println(fx);
        int num = 1;
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        int num1 = 2 * ++num;
        int num2 = 2 * num++;
        System.out.printf("%s = %d%n", "num", num);
        System.out.printf("%s = %d%n", "num2", num2);
        System.out.printf("%s = %d%n", "num2", num2);
    }
}
