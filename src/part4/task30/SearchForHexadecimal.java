package part4.task30;

import java.io.StringWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForHexadecimal {
    public void searchNumbers() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");

        SearchForHexadecimal searchNumbers = new SearchForHexadecimal();
        searchNumbers.searchNumbers();
    }
}

