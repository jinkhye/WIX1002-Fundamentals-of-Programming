package pkg2019.pkg2.q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer name  :");
        String name = input.nextLine();
        System.out.print("Enter customer id:");
        String id = input.nextLine();
        System.out.print("Enter quantity ordered :");
        int quantity = input.nextInt();
        System.out.print("Enter price per unit  :");
        double unitprice = input.nextDouble();
        System.out.println("");
        Order a = new Order(name, id, quantity, unitprice);
        ShippedOrder b = new ShippedOrder(name, "123", 10, 5);
        System.out.println(a);
        System.out.println("");
        System.out.println(b);
    }
}