package part5.task35;

public class Taster extends Framework {
    int hour = 8;
    double fullDayWage = hour * 8.93;
    double fullMonthWage = fullDayWage*21;

    public Taster (String name, String position, double wage) {
        super(name, position, wage);
    }

    @Override
    public double payWage() {
        return fullMonthWage;
    }
}
