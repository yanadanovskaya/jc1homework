package part5.task34;

public class BelagropromBank extends Card {
    private String bankName;
    private int cardId;
    private int password;
    private double balance;

    public BelagropromBank(String bankName, int cardId, int password, double balance) {
        this.bankName = bankName;
        this.cardId = cardId;
        this.password = password;
        this.balance = balance;

    }

    @Override
    protected void withdrawCash(int balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            System.out.println("Your balance after operation is " + this.balance + " RUB");

        }
    }
}
