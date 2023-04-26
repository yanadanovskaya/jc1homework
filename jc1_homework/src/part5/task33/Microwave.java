package part5.task33;

public class Microwave extends PowerSupply {
    String name;

    public Microwave(String name) {
        this.name = name;
    }

    @Override
    public void activeState() {
        System.out.println(this.name + " подключена.");
    }
}
