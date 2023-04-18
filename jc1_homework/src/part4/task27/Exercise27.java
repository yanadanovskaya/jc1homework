package part4.task27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise27 {

    public static void main(String[] args) {
        int puncts = 0;
        Matcher m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text: ");
        String str = scanner.nextLine();
        Pattern punct = Pattern.compile("\\p{Punct}");
        String[] arrayText = str.split("\\s");


        for (String s : arrayText) {
            int count = 0;
            m = punct.matcher(s);
            while (m.find()) {
                ++count;
            }
            puncts += count;
        }
        System.out.println("Колличество знаков припинания: " + puncts);
    }
}
