package part8.task46;

import static part8.task46.Exception.divide;

public class Main {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!!");
        }
    }
}
class Exception {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
