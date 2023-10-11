
public class Game {
    private String name;
    private int score;
    public Game(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    public int rolldice() {
        int roll = (int)(Math.random() * 6 + 1);
        score += roll;
        return roll;
    }
}