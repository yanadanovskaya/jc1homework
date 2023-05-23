package part8.task48;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./jc1_homework/src/part8/task48/"));
            StringBuilder res = new StringBuilder();
            String s = reader.readLine();
            while (s != null) {
                res.append(s);
                s = reader.readLine();
            }
            Pattern n = Pattern.compile("[.,:;!?]");/*-*/
            Matcher matcher = n.matcher(res.toString());
            System.out.println("Количество знаков препинания: " + matcher.results().count());
            Pattern p = Pattern.compile("\\s*[A-Za-zА-Яа-я0-9'_-]+\\s*");
            Matcher matcher2 = p.matcher(res.toString());
            System.out.println("Количество слов: " + matcher2.results().count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

