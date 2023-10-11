
public class BurgerStall {
    private String id;
    private int burgers;
    public static int totalburgerssold;
    public BurgerStall(String id, int burgers){
        this.id = id;
        sold(burgers);
    }

    public String getId() {
        return id;
    }

    public int getBurgers() {
        return burgers;
    }

    public int getTotalburgerssold () {
        return totalburgerssold;
    }

    public void sold(int burgers) {
        this.burgers += burgers;
        totalburgerssold += burgers;
    }
}