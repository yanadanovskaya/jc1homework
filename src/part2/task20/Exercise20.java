package part2.task20;

public class Exercise20 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 10);
        for (int i: arr)
            System.out.println( i + " " );
        System.out.println(arr[0] + " " + arr[2] + " " + arr[4] + " " + arr[6] + " " + arr[8]);
    }
    }


