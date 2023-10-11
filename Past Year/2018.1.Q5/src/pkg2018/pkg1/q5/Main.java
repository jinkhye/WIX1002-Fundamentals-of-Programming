package pkg2018.pkg1.q5;

public class Main {

    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Red", 8);
        System.out.println(a);
        Apple b = new Apple("Apple", "Green", 11);
        System.out.println(b);
        Watermelon c = new Watermelon("Watermelon", "Local", 7.6);
        System.out.println(c);
        Watermelon d = new Watermelon("Watermelon", "Imported", 4);
        System.out.println(d);
        System.out.println("The cheapest item is");
        if (a.totalPrice() < b.totalPrice() && a.totalPrice() < c.totalPrice() && a.totalPrice() < d.totalPrice()) {
            System.out.println(a);
        }
        else if (b.totalPrice() < a.totalPrice() && b.totalPrice() < c.totalPrice() && b.totalPrice() < d.totalPrice()) {
            System.out.println(b);
        }
        else if (c.totalPrice() <  a.totalPrice() && c.totalPrice() < b.totalPrice() && c.totalPrice() < d.totalPrice()) {
            System.out.println(c);
        }
        else {
            System.out.println(d);
        }
        
    }
}