package me;

public class BuildingStrings {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World! ");
        sb.appendCodePoint(0x1F37A);
        System.out.printf("%s%n", sb.toString());
    }
}
