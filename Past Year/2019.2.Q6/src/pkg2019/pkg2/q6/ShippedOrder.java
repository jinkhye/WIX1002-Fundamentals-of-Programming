package pkg2019.pkg2.q6;

public class ShippedOrder extends Order {
    
    public ShippedOrder(String customername, String customerID, int quantityordered, double unitprice) {
        super(customername, customerID, quantityordered, unitprice);
    }
    
    @Override
    public double computeTotalPrice() {
        double totalPrice = super.computeTotalPrice();
        totalPrice += 4;
        return totalPrice;
    }
    
    public String toString() {
        String result = super.toString();
        return "Shipped\n" + result;
    }
}