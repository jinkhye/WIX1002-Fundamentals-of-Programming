package pkg2016.pkg2.q6;

public class FinancialRecord {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public FinancialRecord() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public int getId() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public void setBalance (double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate (double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate () {
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }
    
    public void withdraw(double amount) {
        System.out.println("Previous balance: RM" + balance);
        balance -= amount;
        System.out.println("Current balance after withdrawal of RM " + amount + "is: RM" + balance);
    }
    
    public void deposit(double amount) {
        System.out.println("Previous balance: RM" + balance);
        balance += amount;
        System.out.println("Current balance after deposit of RM " + amount + "is: RM" + balance);
    }
    
    public void displayRecordInfo() {
        System.out.println("Financial record id is: " + id);
        System.out.println("Finanical record balance is: RM" + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
    }
}