package part5.task33;

public class CoffeeMachine extends PowerSupply {
    String name;

    public CoffeeMachine(String name) {
        this.name = name;
    }

    @Override
    public void activeState() {
        System.out.println(this.name + " подключена.");
    }
}
