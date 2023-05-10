package part2.task14;

public class Exercise14 {
    public static void main(String[] args) {
        int n = 1;
        int x = 25;
        do {
            x *= n;
            n++;
        } while (n <= 25);
        System.out.println(x);
    }
}
