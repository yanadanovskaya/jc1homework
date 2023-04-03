package part2.task7;

public class Exercise7 {
    static boolean result;

    static boolean EqualToSeven(boolean result) {
        int a = 567;
        {
            if (a % 10 == 7) {
                result = true;
            } else {
                result = false;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(EqualToSeven(result));
    }
}


