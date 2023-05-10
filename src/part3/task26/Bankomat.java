package part3.task26;

import java.util.Scanner;

public class Bankomat {
    private Money nominal20;
    private Money nominal50;
    private Money nominal100;
    private Scanner scanner = new Scanner(System.in);

    public Bankomat(int nominal_20, int nominal_50, int nominal_100) {
        this.nominal20 = new Money(nominal_20);
        this.nominal50 = new Money(nominal_50);
        this.nominal100 = new Money(nominal_100);
    }

    public void addMoneyInBankomat() {
        System.out.println("Добавьте деньги в Банкомат: ");
        System.out.print("Введите количество первого номинала: " + " " + nominal20.getNominal() + " ");
        nominal20.addMoney(scanner.nextInt());

        System.out.println(" ");
        System.out.print("Введите количество второго номинала: :" + " " + nominal50.getNominal() + " ");
        nominal50.addMoney(scanner.nextInt());

        System.out.println(" ");
        System.out.print("Введите количество третьго номинала: :" + " " + nominal100.getNominal() + " ");
        nominal100.addMoney(scanner.nextInt());
    }

    public void printAmountMoney() {
        System.out.println(" ");
        System.out.println("Банкомат имеет:");
        nominal20.printAmount();
        nominal50.printAmount();
        nominal100.printAmount();
    }

    public boolean issueMoney() {
        System.out.print("Введите количество денег, которое хотели бы получить (20, 50, 100): ");
        int money = scanner.nextInt();
        if (CheckingForValidInput(money)) {
            return getMoney(money);
        } else {
            System.out.print("Ошибка! ");
            return false;
        }
    }

    private boolean getMoney(int money) {
        if (money <= nominal100.calculateAmount() && money % nominal100.getNominal() == 0) {
            nominal100.removeMoney(money / nominal100.getNominal());
            return true;
        } else if (money <= nominal50.calculateAmount() && money % nominal50.getNominal() == 0) {
            nominal50.removeMoney(money / nominal50.getNominal());
            return true;
        } else if (money <= nominal20.calculateAmount() && money % nominal20.getNominal() == 0) {
            nominal20.removeMoney(money / nominal20.getNominal());
            return true;
        } else {
            System.out.println("Ошибка! ");
            return false;
        }

    }

    private boolean CheckingForValidInput(int money) {
        int allMoney = nominal20.calculateAmount() +
                nominal50.calculateAmount() +
                nominal100.calculateAmount();
        if (money > allMoney) {
            System.out.println("Введено денег больше, чем имеется на банковском счете");
            return false;
        } else if (money <= 0) {
            System.out.println("Некорректный ввод ");
            return false;
        } else {
            if (money % nominal20.getNominal() == 0 ||
                    money % nominal50.getNominal() == 0 ||
                    money % nominal50.getNominal() == 0) {
                return true;
            } else {
                System.out.println("Некорректный ввод! Введите сумму кратную 20, 50, 100");
                return false;
            }
        }
    }
}
