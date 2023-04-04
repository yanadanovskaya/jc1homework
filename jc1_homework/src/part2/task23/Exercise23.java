package part2.task23;

public class Exercise23 {

    public static void main(String[] args) {

        int arr[]=new int[10];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 10);
        for (int i: arr)
            System.out.println(i + " ");
            System.out.println("   " + arr[9] + " " + arr[8] + " " + arr[7]+ " " + arr[6]+ " " + arr[5]+ " " + arr[4]+ " " + arr[3]+ " " + arr[2]+ " " + arr[1]);


    }
}
