package part2.task22;

import static java.lang.Math.*;

public class Exercise22 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (random() * 10);
        for (int i : arr)
            System.out.println(i + " ");
        int indexMax = 9;
        int indexMin = 0;
        int max = arr[0];
        int min = arr[0];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                indexMax = i;
                max = arr[i];
            } else if (arr[i] < min) {
                indexMin = i;
                min = arr[i];
            }
            x += arr[i];
        }
        int sum = 0;
        for (int i = Math.min(indexMin, indexMax)+1; i < Math.max(indexMin, indexMax); ++i)  {
            sum += arr[i];
        }
        System.out.println("Сумма элементов между максимальным и минимальным значениями: " + sum);

    }
}