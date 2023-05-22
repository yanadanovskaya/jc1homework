package part7.task40;

import java.util.ArrayList;
import java.util.List;

public class Marks {
    int quantity = 10;
    int negative = 4;


    public void enterData() {
        List<Integer> marksList = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            int j = (int) (Math.random() * 10 + 1);
            marksList.add(j);
        }

        System.out.println("List of marks: " + marksList);

        List<Integer> negativeMarks = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            int n = marksList.get(i);
            if (n <= negative) {
                negativeMarks.add(n);
            }
        }

        System.out.println("List of negative marks: " + negativeMarks);
        marksList.removeAll(negativeMarks);
        System.out.println("List of positive marks: " + marksList);
    }
}
