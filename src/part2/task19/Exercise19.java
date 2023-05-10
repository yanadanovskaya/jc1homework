package part2.task19;

public class Exercise19 {
    public static void main(String[] args) {

      int arr[]=new int[10];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 10);
        for (int i: arr)
            System.out.println( i + " " );
        System.out.println("Последний элемент массива:" + arr[9]);
    }


}
