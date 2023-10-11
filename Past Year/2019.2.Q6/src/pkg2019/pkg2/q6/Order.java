package pkg2019.pkg2.q6;

public class Order {
    
    public String customername, customerID;
    public int quantityordered;
    public double unitprice;
    
    public Order() {
        this.customername = "";
        this.customerID = "";
        this.quantityordered = 0;
        this.unitprice = 0;
    }
    
    public Order(String customername, String customerID, int quantityordered, double unitprice) {
        this.customername = customername;
        this.customerID = customerID;
        this.quantityordered = quantityordered;
        this.unitprice = unitprice;
    }
    
    public String getCustomername() {
        return customername;
    }
    
    public String getCustomerID() {
        return customerID;
    }
    
    public int getQuantityordered() {
        return quantityordered;
    }
    
    public double getUnitprice() {
        return unitprice;
    }
    
    public void setCustomername(String customername) {
        this.customername = customername;
    }
    
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public void setQuantityOrdered(int quantityordered) {
        this.quantityordered = quantityordered;
    }
    
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    
    public double computeTotalPrice() {
        double totalPrice = quantityordered * unitprice;
        return totalPrice;
    }
    
    public String toString() {
        return "Order record" +
                "\nCustomer Name : " + customername +
                "\nCustomer Id : " + customerID +
                "\nQuantity ordered: " + quantityordered +
                "\nUnit price : " + unitprice +
                "\nTotal Price : " + computeTotalPrice();
    }
}