package part4.task31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
        Pattern pattern=Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.start() +" "+ matcher.end());

        }



    }
}
