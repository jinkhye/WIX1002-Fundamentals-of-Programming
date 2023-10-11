package pkg2017.pkg2.q5;

public class Staff {
    
    public String name;
    public String IC;
    
    public Staff(String name, String IC){
        this.name = name;
        this.IC = IC;
    }
    
    @Override
    public String toString() {
        return "Full Name: " + name +
                "\nIC: " + IC;
    }
}