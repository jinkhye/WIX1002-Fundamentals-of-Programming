package pkg2018.pkg2.q5;

public class Essay extends GradedActivity{

    public int grammar,spelling,length,content;
    
    public Essay (int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    @Override
    public String toString() {
        return "Essay score:" +
                "\nGrammar: " + grammar +
                "\nSpelling: " + spelling +
                "\nLength: " + length +
                "\nContent: " + content;
    }
}