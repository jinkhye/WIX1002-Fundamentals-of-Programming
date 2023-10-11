
public class Tester {

    public static void main(String[] args) {
        Game player1 = new Game("player1");
        Game player2 = new Game("player2");

        while (true) {
            if (player1.getScore() > 100 || player2.getScore() > 100) {
                break;
            }
            int roll = player1.rolldice();
            System.out.println(player1.getName() + " rolled: " + roll);
            System.out.println(player1.getName() + " score: " + player1.getScore());

            roll = player2.rolldice();
            System.out.println(player2.getName() + " rolled: " + roll);
            System.out.println(player2.getName() + " score: " + player2.getScore());

        }

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " has won with a score of " + player1.getScore());
            System.out.println(player2.getName() + " has lost with a score of " + player2.getScore());
        }
        else {
            System.out.println(player2.getName() + " has won with a score of " + player2.getScore());
            System.out.println(player1.getName() + " has lost with a score of " + player1.getScore());
        }
    }
}