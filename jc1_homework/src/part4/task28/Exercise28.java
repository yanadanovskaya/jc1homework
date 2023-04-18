package part4.task28;

import java.util.Scanner;

public class Exercise28 {
        public static void main(String[] args) {
            Words words = new Words();
            words.words();
        }
    }

    class Words {

        public void words() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter the text: ");
            String str = scanner.nextLine();
            int n = 0;
            if (str.length() != 0) {
                n++;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    n++;
                }
            }
            System.out.println("Количество слов: " + n );
        }
    }


