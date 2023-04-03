package part2.task15;

public class Exercise15 {
    public static void main(String[] args) {
        int n= 7_893_823_44;
        int sum=0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
    }
}
