package part3.task26;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(20,50,100);
        bankomat.addMoneyInBankomat();
        bankomat.printAmountMoney();
        bankomat.issueMoney();
        bankomat.printAmountMoney();

    }
}
