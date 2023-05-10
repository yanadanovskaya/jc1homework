package part2.task8;

public class Exercise8 {
    public static void main(String[] args) {
        int a = 8, b = 6, r = 10;
        int c = (int) Math.sqrt(a * a + b * b);
        {
            if (r>=c) {
                System.out.println("Круг закрыл прямоугольник!");
            } else {
                System.out.println("Прямоугольник не закрыт.");
            }
        }
    }
}





