package pkg2019.pkg2.q4;

public class Pizza {

    public String size;
    public int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping;
    
    public Pizza (String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public String getSize() {
        return size;
    }
    
    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    
    }
    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }
    
    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }
    
    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }
    
    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost() {
        double cost = 0;
        if (size.equalsIgnoreCase("small")) cost += 10;
        else if(size.equalsIgnoreCase("medium")) cost+= 12;
        else cost+=14;
        
        double toppings = numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping;
        cost += toppings * 2;
        return cost;
    }
    
    public void display() {
        System.out.println("The pizza size: " + size);
        System.out.println("Quantity of cheese topping: " + numOfCheeseTopping);
        System.out.println("Quantity of beef topping: " + numOfBeefTopping);
        System.out.println("Quantity of chicken topping: " + numOfChickenTopping);
        System.out.println("Cost: $" + computeCost());
    }
    
}