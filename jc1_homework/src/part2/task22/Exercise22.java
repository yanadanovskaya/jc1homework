package part2.task22;

public class Exercise22 {
    public static void main(String[] args) {

        int arr[]=new int[10];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 10);
        for (int i: arr)
            System.out.println( i + " " );//TODO
    }

}