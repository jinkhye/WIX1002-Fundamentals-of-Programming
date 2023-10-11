package pkg2018.pkg1.q5;

public abstract class Fruit {
    public String name, type;
    
    public Fruit (String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    @Override
    public String toString() {
        return type + " " + name + " - ";
    }
}