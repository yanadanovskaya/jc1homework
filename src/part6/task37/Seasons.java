package part6.task37;

import java.util.Scanner;

public enum Seasons {
    WINTER(1),
    SPRING(2),
    SUMMER(3),
    AUTUMN(4);

    int number;
    String description;
    int countOfDays;


    Seasons(int number) {
        this.number = number;
    }

    Scanner scanner = new Scanner(System.in);

    public int getSeasons() {
        System.out.println("Введите число от 1 до 4");
        Scanner scanner = new Scanner(System.in);
        int numSeason = scanner.nextInt();

        switch (numSeason) {
            case 1:
                System.out.println("WINTER");
                break;
            case 2:
                System.out.println("SPRING");
                break;
            case 3:
                System.out.println("SUMMER");
                break;
            case 4:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Неверный номер! Пожалуйста, попробуйте еще раз.");
                System.exit(0);
        }
        return getSeasons();
    }
}
