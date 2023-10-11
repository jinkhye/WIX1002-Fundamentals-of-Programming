/*
Create a Dice game. The first dice game allows the player to roll two dices each time.
If both dice is equal, the player can roll again. The player score each time they roll the
dices. Player that reaches 100 points or more wins the game. The second dice game
allows the player to roll one dice each time. When the dice is 6, the player can roll
one more time. However, if the player rolls 6 again in second attempt, the player
won’t have any score. Player that reaches 100 point wins the game. If the player
scores more than 100, the last score is not counted and the player needs to roll again
in next turn. Create a Tester class to test the program. 
*/

public class DiceGame {
    
    public void start() {
        int totalScore1 = 0;
        int totalScore2 = 0;
        
        while (true) {
            totalScore1 = rollDice("Player 1", totalScore1);
            System.out.println("Player 1 score: " + totalScore1);
            if (totalScore1 >= 100) break;
            totalScore2 = rollDice("Player 2", totalScore2);
            System.out.println("Player 2 score: " + totalScore2);
            if (totalScore2 >= 100) break;
        }
        
        System.out.println((totalScore1 >= 100 ? "Player 1" : "Player 2") + " is the winner!");
        
    }
    
    protected int rollDice(String playerName, int totalScore) {
        return 0;
    }
    
}