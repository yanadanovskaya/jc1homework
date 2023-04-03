package part2.task9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int money = 564;
        int x=money%10;
        if (x==0) {
            System.out.println(money + " рублей");
        }  if (x== 1) {
            System.out.println(money + " рубль");
        } if (5>x&&x>1) {
            System.out.println(money+ " рубля");
        } if (9>=x&&x>4) {
            System.out.println(money + " рублей");
        }
    }
}
