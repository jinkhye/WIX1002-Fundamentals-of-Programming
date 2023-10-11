package l10q1;

public class PermanentEmployee extends Employee{
    
    public String category;
    public PermanentEmployee(String name, String category) {
        super(name, "Permanent Employe");
        this.category = category;
    }
    
    @Override
    public double totalsalary() {
        double salary = 0;
        switch(category) {
            case "A" -> salary = 4000;
            case "B" -> salary = 3000;
            case "C" -> salary = 2000;
            default -> salary = 0;
        }
        return salary;
    }
}