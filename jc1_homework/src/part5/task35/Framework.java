package part5.task35;

public class Framework {
    protected String name;
    protected String position;
    protected double wage;

    public Framework(String name, String position, double wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getWage() {
        return wage;
    }

    public double payWage() {
        return 0;
    }
}

