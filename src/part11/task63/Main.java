package part11.task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            List<Person> people = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                String name = "Name " + random.nextInt(100);
                String surname = "Surname " + random.nextInt(100);
                int age = 15 + random.nextInt(16);
                people.add(new Person(name, surname, age));
            }

            List<String> surname = people.stream().filter(p -> p.age < 21).peek(System.out::println)
                    .sorted(Comparator.comparing((Person p) -> p.surname).thenComparing(p -> p.name))
                    .limit(4).map(p -> p.surname).collect(Collectors.toList());
            System.out.println(surname);
        }
    }

class Person {
    String name,surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + " " + name + " " + ", " + surname + " " +
                ",age " + age + '}';
    }
}
