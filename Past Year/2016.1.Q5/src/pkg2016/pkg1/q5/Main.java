package pkg2016.pkg1.q5;

public class Main {

    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");
        
        String[] type = {"Grocery", "Other", "Fuel", "Utility", "Other"};
        String[] day = {"Saturday", "Friday", "Sunday", "Friday", "Tuesday"};
        double[] price = {124.8,64.6,95.4,100.0,220.0};
        
        for (int i = 0; i < type.length; i++) {
            r.payment(type[i], price[i]);
        }
        
        for (int i = 0; i < day.length; i++) {
            p.payment(day[i], price[i]);
        }
        
        System.out.println(r.toString());
        System.out.println(p.toString());
        
        if (r.getReward() > p.getReward()) {
            System.out.println("The best card is Cash Rebate Card");
        }
        else {
            System.out.println("The best card is Point Reward Card");
        }
    }
}