package part2.task11;

public class Exercise11 {
    public static void main(String[] args) {
        int a=4,b=8,c=3,d=6,e=6,f=18;
        if ((e >= (a + c)) && (f >= b && f >= d))
        {
            System.out.println("Дома помещаются на участке");
        }
        else if ((e >= (a + d))&& (f >= b && f >= c))
        {
            System.out.println("Дома помещаются на участке");
        }
        else if ((e >= (b + c))&& (f >= a && f >= d))
        {
            System.out.println("Дома помещаются на участке");
        }
        else if ((e >= (b + d))&& (f >= a && f >= c))
        {
            System.out.println("Дома помещаются на участке");
        }
        else
            System.out.println("Дома не помещаются на участке");
    }
}




