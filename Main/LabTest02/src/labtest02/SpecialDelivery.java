package labtest02;

public class SpecialDelivery extends Delivery {
    
    public boolean weekend;
    public boolean nighttime;
    
    public SpecialDelivery (String sender, String recipient, double weight, boolean weekend, boolean nighttime) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    @Override
    public double totalCost () {
        double cost = super.totalCost();
        if (weekend) {
            cost += 50;
        }
        if (nighttime) {
            cost = cost * 120/100;
        }
        return cost;
    }  
    
    @Override
    public String toString() {
        String s = super.toString();
        
        if (weekend == true) {
            s += "Weekend Delivery";
        }
        if (nighttime == true) {
            s += "\nNight Time Delivery";
        }
        
        s += "\n";
        return s;        
    }
}