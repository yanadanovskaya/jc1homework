package part2.task16;

public class Exercise16 {
    public static void main(String[] args) {
        boolean b = true;
        boolean second = false;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                if (second) {
                    System.out.println(P);
                    break;
                }
                second = true;
            }
            }
        }
    }