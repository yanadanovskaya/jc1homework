package part8.task44;

import java.util.Scanner;

public class NullPointerException {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите делимое и делитель: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b != 0) {
                System.out.println("Верно");
            } else {
                try {
                    int c = a / b;
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!!");
                }
            }
        }
    }


