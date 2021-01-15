package me;

public class StringTypes {
    public static void main(String[] args) {
        // String s1 = "Java " + String.valueOf(Character.toChars(0x1D161));
        String s1 = "Java \ud834\udd61";
        System.out.printf("%s%n", s1);

        // Using Character Array to loop through the Supplementary character
        char[] cArray = Character.toChars(0x1D161);
        System.out.printf("cArray length = %d%n", cArray.length);
        for (char c : cArray) {
            System.out.printf("%c%n", c);
            System.out.printf("%d%n", (int) c);
            System.out.printf("0x%x%n", (int) c);
        }

        System.out.println("-".repeat(10));

        String s2 = "Java " + String.valueOf(cArray);
        System.out.printf("String (%s) Length = %d%n", s2, s2.length());
        for (int i = 0; i < s2.length(); i++) {
            System.out.printf("%c | ", s2.codePointAt(i));
            System.out.printf("%d | ", s2.codePointAt(i));
            System.out.printf("0x%x%n", s2.codePointAt(i));
            System.out.printf("%c | ", s2.charAt(i));
            System.out.printf("%d | ", (int) s2.charAt(i));
            System.out.printf("0x%x%n", (int) s2.charAt(i));
        }

        System.out.println("-".repeat(10));

        System.out.printf("String (%s) Code Points Count = %d%n", s2, s2.codePointCount(0, s2.length()));
        System.out.println("Code Points are...");
        s2.codePoints().forEach(System.out::println);

        System.out.println("-".repeat(10));

        char[] s2CharArray = s2.toCharArray();
        System.out.printf("s2CharArray length = %d%n", s2CharArray.length);
        for (char c : s2CharArray) {
            System.out.printf("%c | ", (int) c);
            System.out.printf("%d | ", (int) c);
            System.out.printf("0x%x%n", (int) c);
        }

    }
}
