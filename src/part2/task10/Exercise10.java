package part2.task10;

public class Exercise10 {
    public static void main(String[] args) {
        int year, month, day;
        year = 2004;
        month = 8;
        day = 21;
            if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                if (!(1 > day) && !(day > 30)) {
                    day++;
                    System.out.println(year + "." + month + "." + day);
                } else if (day == 31) {
                    day = 1;
                    month++;
                    System.out.println(year + "." + month + "." + day);
                }
            } else if (month == 2) {
                if (!(0 > year) && !(year > 2100))
                    if (year % 400 == 0) {
                        if (!(1 > day) && !(day > 28)) {
                            day++;
                            System.out.println(year + "." + month + "." + day);
                        } else if (day == 29) {
                            day = 1;
                            month++;
                            System.out.println(year + "." + month + "." + day);
                        }
                    }
                if (!(1 > day) && !(day > 28)) {
                    day++;
                    System.out.println(year + "." + month + "." + day);
                } else if (day == 29) {
                    day = 1;
                    month++;
                    System.out.println(year + "." + month + "." + day);
                }
            } else {
                if (!(1 > day) && !(day > 27)) {
                    day++;
                    System.out.println(year + "." + month + "." + day);
                } else if (day == 28) {
                    day = 1;
                    month++;
                    System.out.println(year + "." + month + "." + day);
                }
            }
            if (!(1 > day) && !(day > 29)) {
                day++;
                System.out.println(year + "." + month + "." + day);
            } else if (day == 30) {
                day = 1;
                month++;
                System.out.println(year + "." + month + "." + day);
            }
        if (month == 12) {
            if (!(1 > day) && !(day > 30)) {
                day++;
                System.out.println(year + "." + month + "." + day);
            } else if (day == 31) {
                day = 1;
                year++;
                month = 1;
                System.out.println(year + "." + month + "." + day);
            }
        }
    }
}
