package part5.task35;

public class Technologist extends Framework {
    double rate = 76.2;
    double ratePerMonth= rate*21;

    double revenuePerDay=410;
    double revenuePerMonth=(revenuePerDay/(100*0.12))*21;

    double fullMonthWage = ratePerMonth + revenuePerMonth ;

    public Technologist (String name, String position, double wage) {
        super(name, position, wage);
    }

    @Override
    public double payWage() {
        return fullMonthWage;
    }
}
