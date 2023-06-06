package part8.task49;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static part8.task49.Text.readNumbers;
import static part8.task49.Text.writeText;

public class Main {
    public static void main(String[] args) {
        String text = " 1, 2, 3, 4 fgrdghb gesdlg 2 3";
        String fileName = "numbersText.txt";
        writeText(text, fileName);
        List<Integer> num = readNumbers(fileName);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Числа в тексте: " + num);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Числа без повторений: " + new HashSet<>(num));
    }

}