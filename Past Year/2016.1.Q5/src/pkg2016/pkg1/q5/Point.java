package pkg2016.pkg1.q5;

public class Point extends CreditCard {

    public Point (String name, String number) {
        super(name, number, "Point Reward");
    }
    
    public double payment(String day, double price) {
        if (day.equalsIgnoreCase("friday")) {
            return totalReward += Math.floor(price) * 2 / 100;
        }
        if (day.equalsIgnoreCase("saturday")) {
            return totalReward +=  Math.floor(price) * 3 / 100;
        }
        if (day.equalsIgnoreCase("sunday")) {
            return totalReward +=  Math.floor(price) * 4 / 100;
        }
        else {
            return totalReward +=  Math.floor(price) / 100;
        }    
    }
    
    public double getReward() {
        return totalReward;
    }
}