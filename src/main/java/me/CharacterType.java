package me;

public class CharacterType {

    public static void main(String[] args) {
        char c = '\u0041';
        System.out.printf("%c | %d | 0x%x%n", c, (int) c, (int) c);
        int num = 0x41;
        System.out.printf("%x | %<d%n", num);
        char[] s = Character.toChars(0x1F639);
        System.out.printf("%s%n", String.valueOf(s));
        System.out.println(String.valueOf(Character.toChars(0x1F639)));
        String s1 = "cat😹";
        System.out.println(s1);
    }
}
