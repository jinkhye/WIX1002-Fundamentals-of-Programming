
public class Tester {

    public static void main(String[] args) {
        FirstDiceGame test = new FirstDiceGame();
        SecondDiceGame test2 = new SecondDiceGame();
        System.out.println("First Dice Game: ");
        test.start();
        System.out.println("");
        System.out.println("Second Dice Game: ");
        test2.start();
    }
}