package pkg2016.pkg1.q5;

public class Rebate extends CreditCard {

    public Rebate (String name, String number) {
        super(name, number, "Cash Rebate");
    }
    
    public double payment(String item, double price){
        if (item.equalsIgnoreCase("fuel")) {
            return totalReward += price * 0.08;
        }
        if (item.equalsIgnoreCase("utility")) {
            return totalReward += price * 0.05;
        }
        if (item.equalsIgnoreCase("grocery")) {
            return totalReward += price * 0.02;
        }
        else {
            return totalReward += price *0.002;
        }
    }
    
    public double getReward() {
        return totalReward;
    }
}