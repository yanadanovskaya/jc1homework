package part6.task39;

import java.util.Scanner;

public class Garage extends Vehicle {

    public String standInGarage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vehicle in the garage: ");
        String str = scanner.nextLine();


        Scanner scanner1 = new Scanner(System.in);
        String model;

        System.out.println("Enter car model ");
        model = scanner1.next();

        try {
            if (!model.matches("^[a-zA-Z]+$")) {
                throw new Exception("It's wrong!");
            } else {
                System.out.println("It's correct");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        if (str.equals("Tesla")) {
            System.out.println("Car in the garage.");
        } else if (str.equals("Yamaha")) {
            System.out.println("Motorcycle in the garage.");
        } else {
            System.out.println("Vehicle not found. Please, try again.");
        }
        return str;
    }
}
