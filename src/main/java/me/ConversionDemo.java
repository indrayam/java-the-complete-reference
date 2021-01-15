package me;

public class ConversionDemo {
    public static void main(String[] args) {
        int a = 129;
        byte b = (byte) a;
        System.out.printf("%d = %s%n", a, Integer.toBinaryString(a));
        System.out.printf("%d = %s%n", b, Integer.toBinaryString(b));
    }
}
