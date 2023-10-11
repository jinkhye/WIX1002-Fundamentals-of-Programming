package pkg2016.pkg1.q5;

public class CreditCard {
    
    protected String name = "";
    protected String number = "";
    protected String type = "";
    protected double reward = 0;
    protected double totalReward = 0;
    
    public CreditCard(String name, String number, String type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }
    
    public double getReward() {
        return totalReward;
    }
    
    public void setReward(double reward) {
        this.totalReward = reward;
    }
    
    @Override
    public String toString() {
        return "Credit Card : " + name + " (" + number + ")" +
                "\nCard Type : " + type +
                "\nTotal Cash reward : " + totalReward;
    }
}