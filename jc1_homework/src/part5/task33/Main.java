package part5.task33;

public class Main {
    public static void main(String[] args) {
        PowerSupply ps1 = new CoffeeMachine("Кофемашина");
        ps1.activeState();

        PowerSupply ps2 = new Microwave("Микроволновая печь");
        ps2.activeState();

        PowerSupply ps3 = new Mixer("Миксер");
        ps3.activeState();

    }
}
