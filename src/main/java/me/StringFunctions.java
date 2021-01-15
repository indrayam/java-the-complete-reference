package me;

public class StringFunctions {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello.substring(0,3));
        String all = String.join("/", "Male", "Female");
        System.out.println(all);
        System.out.printf("%s (isLetter: %b)%n",
                String.valueOf(Character.toChars(0x2F81A)),
                Character.isLetter(0x2F81A));
        String name = "Bora ".repeat(2);
        String strippedName = name.strip();
        String trimmedName = name.trim();
        System.out.printf("|%s|%n", name);
        System.out.printf("|%s|%n", strippedName);
        System.out.printf("|%s|%n", trimmedName);
        String help = hello.substring(0, 3) + "p!";
        System.out.println(help);
        System.out.println(help.contentEquals(new StringBuilder("Help!")));
        // String isNull = "";
        // String isNull = null;
        String isNull = "EarTh";
        if (isNull != null && !isNull.isEmpty()) {
            System.out.println(isNull.toUpperCase());
        } else {
            System.out.println("isNull is either null or empty.");
        }
        String uniString = "Java \ud834\udd61";
        System.out.printf("uniString.length() == %d%n", uniString.length());
        System.out.printf("uniString.codePointCount() == %d%n", uniString.codePointCount(0, uniString.length()));
        char cpChar = uniString.charAt(5);
        int supChar = uniString.codePointAt(5);
        System.out.printf("cpChar == |%c|%n", cpChar);
        System.out.printf("cpChar == |%c|%n", supChar);
        int index = uniString.offsetByCodePoints(0, 5);
        System.out.println(index);
        int finalUni = uniString.codePointAt(index);
        System.out.printf("%c%n", finalUni);
        String beerMug = String.format("Drink up %s",String.valueOf(Character.toChars(0x1F37A)));
        System.out.println(beerMug);
        for (int i = 0; i < beerMug.length(); i++) {
            int cp = beerMug.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp)) {
                System.out.printf("%c", beerMug.codePointAt(i));
                i++;
            } else {
                System.out.printf("%c", beerMug.codePointAt(i));
            }
        }
        System.out.println();
        int idx = beerMug.indexOf(0x1f37A);
        System.out.printf("Index of the Beer Mug Supplementary Character = %d%n", idx);
        
    }
}
