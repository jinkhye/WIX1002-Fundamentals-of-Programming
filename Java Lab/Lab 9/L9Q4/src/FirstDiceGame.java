
import java.util.Random;

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

public class FirstDiceGame extends DiceGame {
    
    private Random random = new Random();
    
    @Override
    public int rollDice(String playerName, int totalScore) {
        
        int dice1;
        int dice2;
        
        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            System.out.println(playerName + " Dice 1: " + dice1 + " Dice 2: " + dice2);
            totalScore += dice1 + dice2;
            if (totalScore >= 100) break;
        } while (dice1 == dice2);
        return totalScore;
    }
}