package by.epam.training.dmitrylishko.task01.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Printer {
    public static final String DEFAULT_FIlE_NAME = "resources/output.txt";

    public void printToFile(String... messages) {
        printToFile(DEFAULT_FIlE_NAME, messages);
    }

    public void printToFile(String fileName, String... messages) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (String m : messages) {
                writer.write(m + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printToConsole(String message) {
        System.out.println(message);
    }
}
