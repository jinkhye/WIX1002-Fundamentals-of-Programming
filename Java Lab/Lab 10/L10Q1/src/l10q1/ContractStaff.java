package l10q1;

public class ContractStaff extends Employee {

    public double sales;
    public ContractStaff(String name, double sales) {
        super(name, "Contract Staff");
        this.sales = sales;
    }
    
    @Override
    public double totalsalary() {
        double salary = 500 + sales / 2;
        return salary;
    }
}