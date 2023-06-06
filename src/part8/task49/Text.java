package part8.task49;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    static void writeText(String text, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static List<Integer> readNumbers(String fileName) {
        Pattern pattern = Pattern.compile("\\d+\\b");
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            List<Integer> num = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String match = matcher.group();
                    int number = Integer.parseInt(match);
                    num.add(number);
                }
            }
            return num;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
