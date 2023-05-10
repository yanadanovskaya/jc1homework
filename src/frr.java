import java.util.Scanner;

public class frr {
    public static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите целочисленное число: ");
            int myInt = scanner.nextInt();
            if (myInt % 10 == 1) {
                System.out.println(myInt + " рубль");
                myInt = scanner.nextInt();
            } else if (myInt % 10 == 2) {
                System.out.println(myInt + " рубля");
            } else if (myInt % 10 == 3) {
                System.out.println(myInt + " рубля");
            } else if (myInt % 10 == 4) {
                System.out.println(myInt + " рубля");
            } else if (myInt % 10 == 5) {
                System.out.println(myInt + "рублей");
            } else if (myInt % 10 == 6) {
                System.out.println(myInt + " рублей");
            } else if (myInt % 10 == 7) {
                System.out.println(myInt + " рублей");
            } else if (myInt % 10 == 8) {
                System.out.println(myInt + "рублей");
            } else if (myInt % 10 == 9) {
                System.out.println(myInt + "рублей");
            }
        }
    }
}
