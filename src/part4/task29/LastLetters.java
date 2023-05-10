package part4.task29;

import java.util.Scanner;

public class LastLetters {
    public void lastLettersOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text: ");
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        String[] words = str.split("\\s+");
        for (String word : words) {
            stringBuilder.append(word.toCharArray()[word.length() - 1]);
        }
        System.out.println(stringBuilder.toString());
    }
    public static void main(String[] args) {
        LastLetters lastLetters = new LastLetters();
        lastLetters.lastLettersOfWords();
    }
}
