package me;

public class StringArrayDemo {
    public static void main(String[] args) {
        String names[] = {"Anand", "Shannon", "Emma", "Zach"};
        int index = 0;
        for (String name : names) {
            System.out.printf("names[%d] = %s%n", index, name);
            index++;
        }
    }
}
