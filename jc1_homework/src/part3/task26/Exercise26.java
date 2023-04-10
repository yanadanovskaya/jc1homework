package part3.task26;

import java.util.Scanner;

public class Exercise26 {
    public class Bankomat {
        int money20;
        int money50;
        int money100;
        int sum;

        public void money20(int money) {
            this.money20 += money;
            sum += money20 * 20;
            return;
        }
        public void money50(int money) {
            this.money50 += money;
            this.sum += money50 * 50;
            return;
        }
        public void upValue100(int money) {
            this.money100 += money;
            this.sum += money100 * 100;
            return;
        }
        public Bankomat (int money20, int money50, int money100) {
            this.money20 = money20;
            this.money50 = money50;
            this.money100 = money100;
            this.sum = this.money20 * 20 + this.money50 * 50 + this.money100 * 100;
        }

    }
}


