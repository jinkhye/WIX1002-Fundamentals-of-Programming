
public class CloudPackage extends Cloud{

    public int core, memory;
    public double price;
    
    public CloudPackage(String cloudpackage, int core, int memory, double price) {
        super(cloudpackage, 0);
        this.core = core;
        this.memory = memory;
        this.price = price;
    }
    
    public boolean check(Job a) {
        if (memory >= a.memory) return true;
        else return false;
    }
    
    public double totalCost(Job a) {
        double cost = (a.getTask()/core) * price;
        super.totalcost = cost;
        return cost;
    }
}