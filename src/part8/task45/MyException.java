package part8.task45;

import java.util.Scanner;

public class MyException {
    static final String STRING = "END";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер или завершите программу: ");
        String stringStr = scanner.nextLine();
        while (!STRING.equalsIgnoreCase(stringStr)) {
            Integer number = getNumber(stringStr);
            if (number != null) {
                analyseNumber(number);
            }
            stringStr = scanner.next();
        }
    }
    private static void analyseNumber(Integer number) {
        if (number % 2 == 0) {
            System.out.println("Введено чётное число");
        } else
            System.out.println("Введено нечётное число");
    }
    private static Integer getNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            System.out.println("Некорректный ввод.Попробуйте еще раз.");
            return null;
        }
    }
}
