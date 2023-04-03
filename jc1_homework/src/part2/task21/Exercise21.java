package part2.task21;

public class Exercise21 {
    public static void main(String[] args) {
        int[] elements = new int[10];
        int maxElement=elements[0];
        for(int i=0;i<10;i++){
            elements[i]=(int)(Math.random() * 10);
        }
        for (int i: elements)
            System.out.println( i + " " );
        for(int i=0;i<elements.length;i++){
            if(maxElement<elements[i]){
                maxElement=elements[i];
            }
        }
        System.out.println("Максимальный элемент= " + maxElement);
    }
}


