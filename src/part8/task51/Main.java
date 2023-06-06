package part8.task51;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String string = "documentCase1"+"documentCase2" + "documentCase3";
        File dir = new File(string);
        dir.mkdir();
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            String fileName = "file" + i + ".txt";
            File file = new File(dir, fileName);
            try (FileWriter writer = new FileWriter(file)) {
                for (int j = 0; j < 10; j++) {
                    int num = rand.nextInt(100);
                    writer.write(num + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File[] files = dir.listFiles();
        if (files != null) {
            File allNumbersFile = new File(dir, "union.txt");
            try (FileWriter writer = new FileWriter(allNumbersFile)) {
                for (File file : files) {
                    if (file.isFile() && !file.getName().equals("union.txt")) {
                        List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
                        for (String line : lines) {
                            writer.write(line + "\n");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            File fileListFile = new File(dir, "fileCase.txt");
            try (FileWriter writer = new FileWriter(fileListFile)) {
                for (File file : files) {
                    if (file.isFile()) {
                        writer.write(file.getName() + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
    }