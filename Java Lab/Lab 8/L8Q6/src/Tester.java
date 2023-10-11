
public class Tester {

    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("First", 1000);
        BurgerStall stall2 = new BurgerStall("Second", 200);
        BurgerStall stall3 = new BurgerStall("Third", 1234);
        printBurgerSold(stall1);
        printBurgerSold(stall2);
        printBurgerSold(stall3);
        System.out.println("Total Burger Sold: " + BurgerStall.totalburgerssold);
        System.out.println();

    }

    public static void printBurgerSold(BurgerStall stall) {
        System.out.printf("%s Stall Burger Sold: %d\n", stall.getId(), stall.getBurgers());
    }
}