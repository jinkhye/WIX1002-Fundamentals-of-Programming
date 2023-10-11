package l10q1;

public class TemporaryStaff extends Employee{

    public double hour;
    public TemporaryStaff(String name, double hour) {
        super(name, "Temporary Staff");
        this.hour = hour;
    }
    
    @Override
    public double totalsalary() {
        double salary = hour * 15;
        return salary;
    }
}