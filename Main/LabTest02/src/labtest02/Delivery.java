package labtest02;

public class Delivery {
    
    public String sender;
    public String recipient;
    public double weight;
    
    public Delivery(String sender, String recipient, double weight) {
       this.sender = sender; this.recipient = recipient; this.weight = weight;
    }
    
    public double totalCost () {
        double cost = 0;
        if (weight > 50) {
            cost += 5 * 2.8 + 15 * 5.2 + 30 * 7 + (weight - 50) * 8.6;
        }
        else if (weight > 20) {
            cost += 5 * 2.8 + 15 * 5.2 + (weight - 20) * 7;
        }
        else if (weight >5) {
            cost += 5 * 2.8 + (weight - 5) * 5.2;
        }
        else {
            cost += weight * 2.8;
        }
        return cost;
    }
    
    @Override
    public String toString() {
        return "From: " + sender +
                " To: " + recipient +
                "\nWeight of package: " + weight + " kg"+
                "\nShipping cost: RM" + totalCost() + "\n";
    }

}