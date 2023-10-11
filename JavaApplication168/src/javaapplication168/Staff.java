package javaapplication168;

public class Staff {

    public String name, IC;
    
    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }
    
    @Override
    public String toString() {
        return "Full Name: " + name +
                "\nIC: " + IC;
    }
    
}