package part8.task49;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/part8/task49/"));
            StringBuilder res = new StringBuilder();
            String s = reader.readLine();
            while (s != null) {
                res.append(s);
                res.append("\n");
                s = reader.readLine();
            }
            Pattern p = Pattern.compile("[0-9]+");
            List<Integer> numbers = new ArrayList<>();
            Matcher matcher = p.matcher(res.toString());
            while (matcher.find()) {
                numbers.add(Integer.valueOf(matcher.group()));
            }
            System.out.println(numbers);
            int sum = 0;
            List<Integer> uniqueNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                sum += number;
                if (!uniqueNumbers.contains(number)) {
                    uniqueNumbers.add(number);
                }
            }
            System.out.println("Сумма: " + sum);
            System.out.println(uniqueNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

