package pkg2018.pkg1.q5;

public class Watermelon extends Fruit{
    
    public double weight;

    public Watermelon(String name, String type, double weight) {
        super(name,type);
        this.weight = weight;
    }
    
    @Override
    public double totalPrice() {
        if (type.equalsIgnoreCase("local")) {
            if (weight > 5) return weight * 1.65;
            else if (weight < 2) return weight * 2.25;
            else return weight * 1.95;
        }
        else {
            if (weight > 5) return weight * 3.15;
            else if (weight < 2) return weight * 3.75;
            else return weight * 3.45;
        }
    }
    public String toString() {
        return super.toString() + weight + "kg" + " = RM " + totalPrice(); 
    }
}