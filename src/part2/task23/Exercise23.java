package part2.task23;
public class Exercise23 {

    public static void main(String[] args) {
        int[] elements = new int[10];
        int maxElement=elements[0];
        int indexForMaxElement = 0;
        int n=10;
        System.out.println("\n" + "Исходный массив : ");
        for(int i=0;i<10;i++){
            elements[i]=(int)(Math.random() * 10);
        }
        for (int i: elements)
            System.out.print(" " + i);
        for (int i=0;i<n/2;i++)
        {
            int j=elements[i];
            elements[i]=elements[n-1-i];
            elements[n-1-i]=j;
        }

        System.out.println("\n" + "Перевернутый массив : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(" " + elements[i]);
        }


    }
}

