package part11.task64;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = 100,minValue = 1,maxValue = 1000;
        List<Integer> numbers = IntStream.rangeClosed(minValue, maxValue).boxed().limit(n).collect(Collectors.toList());
        boolean bool = numbers.stream().anyMatch(i -> i % 3 == 0 && i % 5 == 0);

        System.out.println(bool);
    }
}