
import java.util.Random;

/*
The second dice game allows the player to roll one dice each time. 
When the dice is 6, the player can roll one more time. 
However, if the player rolls 6 again in second attempt, the player
won’t have any score. Player that reaches 100 point wins the game. If the player
scores more than 100, the last score is not counted and the player needs to roll again
in next turn. Create a Tester class to test the program. 
*/

public class SecondDiceGame extends DiceGame {
    
    private Random random = new Random();
    
    @Override
    public int rollDice(String playerName, int totalScore) {
        
        int dice1 = random.nextInt(6) + 1;
        
        if (dice1 != 6) {
            if (totalScore + dice1 <= 100) {
                totalScore += dice1;
            }
            System.out.println(playerName + " rolled: " + dice1);
        }
        else {
            int dice2 = random.nextInt(6) + 1;
            if (dice2 != 6) {
                if (totalScore + dice1 <= 100) {
                    totalScore += dice1;
                    System.out.println(playerName + " rolled: " + dice1);
                }
                if (totalScore + dice2 <= 100) {
                    totalScore += dice2;
                    System.out.println(playerName + " rolled: " + dice2);
                }
            }
        }
        
        
        return totalScore;
    }
}