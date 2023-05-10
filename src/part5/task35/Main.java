package part5.task35;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Job structure at the confectionery factory: ");
        System.out.println();
        Confectioner framework1 = new Confectioner("Nepevnaya","Confectioner",1800);
        System.out.println("1." + framework1.getName() + " is the " + framework1.getPosition() + " and her wage is "
                + framework1.payWage() + " " + "BYN");

        Taster framework2 = new Taster("Brunevskaya","Taster",1500);
        System.out.println("2." + framework2.getName() + " is the " + framework2.getPosition() + " and her wage is "
                +framework2.payWage() + " " + "BYN");

        Technologist framework3 = new Technologist("Konopelko","Technologist",2300.00);
        System.out.println("3." + framework3.getName() + " is the " + framework3.getPosition() + " and his wage is "
                + framework3.payWage()+ " " + "BYN");
    }
}
