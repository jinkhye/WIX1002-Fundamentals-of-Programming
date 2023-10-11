package pkg2019.pkg1.q5;

public class Main {

    public static void main(String[] args) {
        Delivery a = new Delivery("Ali", "Ahmad", 4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah", 63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        System.out.println(a);
        System.out.println("");
        System.out.println(b);
        System.out.println("");
        System.out.println(c);
        System.out.println("");
        System.out.println(d);
        System.out.println("");
        double total = a.totalCost() + b.totalCost() + c.totalCost() + d.totalCost();
        System.out.println("The total shipping cost is RM " + total);
    }
}