package pkg2021.pkg1.q4;

public class DivideF2 extends Eleven{

    public DivideF2(String filename) {
        super(filename);
    }
    
    @Override
    public String divide() {
        String result = "Divisibility Rule (Formula 2)\n";
        
        for (int i = 0; i < array.length; i++) {
            int print = array[i];
            int number = array[i];
            result += print + " : ";
            while (number >= 99) {
                int digit = number % 10;
                int printnumber = number / 10;
                number /= 10;
                number -= digit;
                result += printnumber + " - " + digit + " * 1 = " + number + ", ";
            }
            int x = number;
            result += "x = " + x + "\n";
            if (x % 11 == 0) {
                result += x + " modulus 11 = 0, " + print + " is divisible by 11\n\n";
            }
            else {
                result += x + " modulus 11 is not equal to 0, " + print + " is not divisible by 11\n\n"; 
            }
        }
        
        return result;
    }
}