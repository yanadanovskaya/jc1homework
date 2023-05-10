package part6.task38;

import java.util.Scanner;

public enum Month {
    DECEMBER(31, Season.WINTER),
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER),
    AUGUST(30, Season.SUMMER),
    SEPTEMBER(31, Season.AUTUMN),
    OCTOBER(30, Season.AUTUMN),
    NOVEMBER(31, Season.AUTUMN);


    int getCountOfDays;
    final Season season;

    Month(int getCountOfDays, Season season) {
        this.getCountOfDays = getCountOfDays;
        this.season = season;
    }

    int sumDaysOfMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season of the year.");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Number of days in Winter: ");
                return Month.DECEMBER.getCountOfDays + Month.JANUARY.getCountOfDays + Month.FEBRUARY.getCountOfDays;
            case 2:
                System.out.println("Number of days in Spring: ");
                return Month.MARCH.getCountOfDays + Month.APRIL.getCountOfDays + Month.MAY.getCountOfDays;
            case 3:
                System.out.println("Number of days in Summer: ");
                return Month.JUNE.getCountOfDays + Month.JULY.getCountOfDays + Month.AUGUST.getCountOfDays;
            case 4:
                System.out.println("Number of days in Autumn: ");
                return Month.SEPTEMBER.getCountOfDays + Month.OCTOBER.getCountOfDays + Month.NOVEMBER.getCountOfDays;
            default:
                System.out.println("Out of seasons");
                System.exit(0);
        }
        return sumDaysOfMonth();
    }
}
