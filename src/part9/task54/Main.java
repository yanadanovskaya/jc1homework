package part9.task54;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Generator generator = new Generator(10);
                int max = generator.getMax();
                System.out.println(Thread.currentThread().getName() + " Max: " + max);
            }).start();
        }
    }
}
    class Generator {
    private final int[] arr;
    public Generator(int size) {
        arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    public int getMax() {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }
}
