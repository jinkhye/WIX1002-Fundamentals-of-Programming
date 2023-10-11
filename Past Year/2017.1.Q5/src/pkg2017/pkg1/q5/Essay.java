package pkg2017.pkg1.q5;

public class Essay extends GradedActivity{
    
    public int grammar, spelling, length, content;
    
    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        
        super.score = grammar + spelling + length + content;
    }
    
    
    public String toString() {
        String display = super.toString();
        return "Essay score: " +
                "\nGrammar: " + grammar +
                "\nSeplling: " + spelling +
                "\nLength: " + length +
                "\nContent: " + content + "\n\n" +
                display;
        
    }
}