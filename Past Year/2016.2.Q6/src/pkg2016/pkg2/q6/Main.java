package pkg2016.pkg2.q6;

public class Main {

    public static void main(String[] args) {
        FinancialRecord acc_a = new FinancialRecord(1234, 10000);
        System.out.println("The information about financial record A is as follows:");
        acc_a.setAnnualInterestRate(7.77);
        acc_a.displayRecordInfo();
        
        System.out.println("");
        
        FinancialRecord acc_b = new FinancialRecord(1001, 20000);
        System.out.println("The information about financial record B is as follows:");
        acc_b.setAnnualInterestRate(8);
        acc_b.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + acc_b.getMonthlyInterestRate());
        acc_b.deposit(1500);
        acc_b.withdraw(500);
    }
}