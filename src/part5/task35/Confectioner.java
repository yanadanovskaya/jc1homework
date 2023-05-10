package part5.task35;

public class Confectioner extends Framework {
        int workDays = 21;
        double revenuePerDay=410;
        double revenuePerMonth=(revenuePerDay/(100*0.05))*21;

public Confectioner(String name, String position, double wage) {
        super(name, position, wage);
        }

@Override
public double payWage() {
        return revenuePerMonth;
        }
}
