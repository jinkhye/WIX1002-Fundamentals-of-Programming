package pkg2018.pkg1.q5;

public class Apple extends Fruit {
    
    public int quantity;
    
    public Apple(String name, String type, int quantity) {
        super(name,type);
        this.quantity = quantity;
    }
    
    @Override
    public double totalPrice() {
        if (type.equalsIgnoreCase("green")) {
            return quantity * 1.2;
        }
        else {
            return quantity * 1.8;
        }
    }
    public String toString() {
        return super.toString() + quantity + " = RM " + totalPrice(); 
    }
}