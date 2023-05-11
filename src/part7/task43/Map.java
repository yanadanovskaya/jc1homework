package part7.task43;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public void countOfRepeatWord() {
        System.out.println("Please. enter the text.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] words = " ".split(text);
        HashMap<String, Integer> keyValue = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (keyValue.containsKey(words[i])) {
                int count = keyValue.get(words[i]);
                keyValue.put(words[i], count + 1);
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println("Количество повторений слова в тексте равно " + keyValue);
    }
}
