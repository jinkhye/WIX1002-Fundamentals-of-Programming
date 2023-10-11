package pkg2019.pkg1.q5;

public class SpecialDelivery extends Delivery{

    boolean weekend, nighttime;
    
    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean nighttime) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    @Override
    public double totalCost() {
        double cost = super.totalCost();
        if (weekend) cost += 50;
        if (nighttime) cost = cost * 120/100;
        return cost;
    }
    
    public String toString() {
        String result = super.toString();
        if (weekend) result += "\nWeekend Delivery";
        if (nighttime) result+= "\nNight Time Delivery";
        return result;
    }
}