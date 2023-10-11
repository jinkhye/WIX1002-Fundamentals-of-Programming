package javaapplication168;

public class PartTimeStaff extends Staff {

    public int hours;
    
    public PartTimeStaff (String name, String IC, int hours) {
        super(name, IC);
        this.hours = hours;
    }
    
    public int getSalary() {
        return hours * 40;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        return result + 
                "\nNumber of working hours: " + hours +
                "\nSalary: RM " + getSalary();
    }
    
}