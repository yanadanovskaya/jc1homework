package part4.task32;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        long l1= System.currentTimeMillis();
        String str = " ";
        for (int i = 0; i < 1_000_000; i++) {
            str = str + "aaabbbccc";
        }
        System.out.println((System.currentTimeMillis() - l1));

        long l2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aaabbbccc".repeat(1_000_000));
        System.out.println((System.currentTimeMillis() - l2));
    }
}
