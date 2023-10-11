
public class Cloud {

    public String cloudpackage;
    public double totalcost;
    
    public Cloud(String cloudpackage, double totalcost) {
        this.cloudpackage = cloudpackage;
        this.totalcost = totalcost;
    }
    
    public double getTotalcost() {
        return totalcost;
    }
    
    @Override
    public String toString() {
        return "Cloud Package : " + cloudpackage + "  Total Cost= " + totalcost;
    }
}