package part2.task9;

public class Exercise9 {
    public static void main(String[] args) {
        int money = 14;
        int x = money % 10;
        if (x == 0) {
            System.out.println(money + " рублей");
        }
        if (x == 1 && money<10|money>20) {
            System.out.println(money + " рубль");
        }else if(x==1 && money>10){
            System.out.println(money + " рублей");
        }
        if (x==2 &&  money<10|money>20) {
            System.out.println(money + " рубля");
        }else if(x==2 && money>10){
            System.out.println(money + " рублей");
        }
        if (x == 3 &&  money<10|money>20) {
            System.out.println(money + " рубля");
        }else if(x==3 && money>10){
            System.out.println(money + " рублей");
        }
        if (x == 4 &&  money<10|money>20) {
            System.out.println(money + " рубля");
        }else if(x==4 && money>10){
            System.out.println(money + " рублей");
        }

        if (x == 5) {
            System.out.println(money+ "рублей");
        }
        if (x == 6) {
            System.out.println(money + " рублей");
        }
        if (x == 7) {
            System.out.println(money + " рублей");
        }
        if (x == 8) {
            System.out.println(money + "рублей");
        }
        if (x == 9) {
            System.out.println(money + "рублей");
        }
    }
}
