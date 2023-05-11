package part7.task42;

import java.util.ArrayList;
import java.util.List;

public class MaxMark {
    int marks = 10;


    public void getMaxMark() {
        List<Integer> marksList = new ArrayList<>();

        for (int i = 0; i < marks; i++) {
            int j = (int) (Math.random() * 10 + 1);
            marksList.add(j);
        }
        System.out.println("List of marks: " + marksList);
        int max = marksList.get(0);
        for (Integer integer : marksList) {
            if (integer > max)
                max = integer;
        }
        System.out.println("Max mark at this list: " + max);
    }
}
