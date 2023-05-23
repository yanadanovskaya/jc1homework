package part8.task52;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Дарья",
                "Яна",
                "Маша",
                "Катя",
                "Дана",
                "Алина",
                "Арина",
                "Полина",
                "Алиса",
                "Наташа"};
        String[] surnames = {
                "Невмержицкая",
                "Дановская",
                "Кочева",
                "Бруневская",
                "Непевная",
                "Игнатенко",
                "Дроздова",
                "Шумко",
                "Колтович",
                "Терешкович"};
        try {
            List<String> personList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Main person = new Main();
                person.setAge((int) (Math.random() * 60));
                person.setName(names[(int) (Math.random() * names.length)]);
                person.setSurname(surnames[(int) (Math.random() * names.length)]);
                personList.add(person.toString());
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/part8/task52/Main"));
            bufferedWriter.write(personList.toString());
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setSurname(String surname) {
    }

    private void setName(String name) {

    }

    private void setAge(int i) {

    }
}

