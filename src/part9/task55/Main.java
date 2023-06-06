package part9.task55;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Generator ("file" + i + ".txt")).start();
        }
    }
}
class Generator implements Runnable {
    private final String fileName;
    public Generator(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : arr) {
            stringBuilder.append(num).append(" ");
        }
        try {
            Files.write(Paths.get(fileName), stringBuilder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
