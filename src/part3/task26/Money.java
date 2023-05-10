package part3.task26;

public class Money {
    private int nominal;
    private int amountMoney;

    public Money() {
        this.nominal = 0;
        this.amountMoney = 0;
    }

    public Money(int nominal) {
        this.nominal = nominal;
        this.amountMoney = 0;
    }
    public Money(int nominal, int amount) {
        this.nominal = nominal;
        this.amountMoney = amount;
    }

    public void addMoney(int amount) {//amount
        System.out.print("Вы добавили" + " " + amount + " " + "денег номиналом" + " " + nominal);
        this.amountMoney += amount;
    }

    public void removeMoney(int amount) {
        System.out.print("Вы получили" + " "  + amount + " " + "денег номиналом" + " " + nominal);
        this.amountMoney -= amount;
    }

    public int calculateAmount() {
        int result = this.nominal*this.amountMoney;
        return result;
    }

    public void printAmount() {
        System.out.println(" Номинал " + this.nominal + " банкноты " + this.amountMoney);
        System.out.println("Общая сумма банкнот" + " " +  calculateAmount());
    }

    public int getNominal() {
        return nominal;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

}
