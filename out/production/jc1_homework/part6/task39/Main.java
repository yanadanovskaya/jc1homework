package part6.task39;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Tesla"));
        vehicles.add(new Motorcycle("Yamaha"));

        Garage myGarage = new Garage();
        System.out.println(myGarage.standInGarage());
    }
}
