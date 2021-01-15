package me;

public class BitwiseStuff {
    public static void main(String[] args) {
        int m = 23;
        System.out.printf("m = %s%n", Integer.toBinaryString(m));
        int n = 22;
        System.out.printf("n = %s%n", Integer.toBinaryString(n));
        int andResult = m & n;
        System.out.printf("andResult = %d%n", andResult);
        System.out.printf("andResult = %s%n", Integer.toBinaryString(andResult));
        int orResult = m | n;
        System.out.printf("orResult = %d%n", orResult);
        System.out.printf("orResult = %s%n", Integer.toBinaryString(orResult));
        int xorResult = m ^ n;
        System.out.printf("xorResult = %d%n", xorResult);
        System.out.printf("xorResult = %s%n", Integer.toBinaryString(xorResult));
        int notResult1 = ~m;
        int notResult2 = ~n;
        System.out.printf("notResult for m = %d%n", notResult1);
        System.out.printf("notResult for m = %s%n", Integer.toBinaryString(notResult1));
        System.out.printf("notResult for n = %d%n", notResult2);
        System.out.printf("notResult for n = %s%n", Integer.toBinaryString(notResult2));
    }
}
