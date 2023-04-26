package part5.task33;

public class Mixer extends PowerSupply {
    String name;

    public Mixer(String name) {
        this.name = name;
    }

    @Override
    public void activeState() {
        System.out.println(this.name + " подключен.");
    }
}
