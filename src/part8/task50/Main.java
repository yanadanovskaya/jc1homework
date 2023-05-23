package part8.task50;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt();

        try (final FileWriter writer = new FileWriter("C:/work/Main.txt", false)) {
            for (int i = 0; i < array.length; ++i) {
                final String s = Integer.toString(array[i]);
                writer.write(s);
                writer.write(System.lineSeparator());
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}