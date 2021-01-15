package me;

import java.util.Date;
import java.util.Locale;

public class FormattedOutputDemo {
    public static void main(String[] args) {
        Locale indiaLocale = new Locale.Builder().setLanguage("HI").setRegion("356").build();
        Locale germanyLocale = new Locale.Builder().setLanguage("DE").setRegion("276").build();
        Locale franceLocale = new Locale.Builder().setLanguage("FR").setRegion("250").build();
        // Locale.setDefault(indiaLocale);
        // Locale.setDefault(Locale.Category.FORMAT, indiaLocale);
        // Locale.setDefault(germanyLocale);
        // Locale.setDefault(Locale.Category.FORMAT, germanyLocale);
        // Locale.setDefault(franceLocale);
        Locale.setDefault(Locale.Category.FORMAT, franceLocale);
        double x = 10000 / 3.0;
        System.out.println(x);
        System.out.printf("|%+0,10.2f|%n", x);
        double y = 183.92;
        System.out.printf("|%.2f|%n", y);
        System.out.printf("|%.2e|%n", y);
        String name = "Anand Sharma";
        System.out.printf("|%-20s|%n", name);
        System.out.printf("%1$s %2$tB %2$te, %2$tY%n", "Due date:", new Date());
        System.out.printf("%s %tB %<te, %<tY %<tZ%n", "Due date:", new Date());
    }
}
