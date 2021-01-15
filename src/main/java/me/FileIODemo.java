package me;

import lombok.SneakyThrows;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIODemo {

    @SneakyThrows
    public static void main(String[] args) throws IOException {
        System.out.printf("Working in %s folder...%n", System.getProperty("user.dir"));
        String filename = "src/main/resources/test.txt";
        PrintWriter out = new PrintWriter(filename, StandardCharsets.UTF_8);
        out.printf("%s%n", "This is the first line");
        out.printf("%n");
        out.printf("%s%n", "This is another line.");
        out.flush();
        out.close();
        System.out.println("-".repeat(2));
        Scanner scanner = new Scanner(Path.of(filename), StandardCharsets.UTF_8);
        while (scanner.hasNextLine()) {
            System.out.printf("%s%n", scanner.nextLine());
        }
        System.out.println("-".repeat(2));
    }

}
