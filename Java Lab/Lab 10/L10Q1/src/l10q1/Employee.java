package l10q1;

public abstract class Employee {

    public String name, type;
    public double salary;
    
    public Employee (String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalsalary();
    
    @Override
    public String toString() {
        return "Employee name: " + name +
                "\nType: " + type +
                "\nTotal salary: " + totalsalary();
    }
    
}