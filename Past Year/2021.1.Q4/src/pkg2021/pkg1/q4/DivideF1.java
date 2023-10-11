package pkg2021.pkg1.q4;

public class DivideF1 extends Eleven{

    public DivideF1(String filename) {
        super(filename);
    }
    
    @Override
    public String divide() {
        String result = "Divisibility Rule (Formula 1)\n";
        
        for (int i = 0; i < array.length; i++) {
            int print = array[i];
            int temp = array[i];
            result += temp + " : |x| = | ";
            int x = 0, y = 0;
            int even = 0, odd = 0;
            String left = "", right = "";
            while (temp > 0) {
                odd += temp % 10;
                left += temp % 10;
                temp /= 10;
                even += temp % 10;
                right += temp % 10;
                temp /= 10;
            }
            String resulttemp1 = "";
            for (int j = left.length()-1; j > -1; j--) {
                resulttemp1 += left.charAt(j) + " + ";
            }
            resulttemp1 = resulttemp1.substring(0, resulttemp1.length() - 3);
            result += "(" + resulttemp1 + ") - ";
            String resulttemp2 = "";
            int check = 0;
            for (int j = right.length()-2; j > -1; j--) {
                resulttemp2 += right.charAt(j + 1) + " + ";
                check += Integer.parseInt(right.substring(j, j + 1));
            }
            if (check == 0) {
                right = "0";
            }
            resulttemp2 = resulttemp2.substring(0, resulttemp2.length() - 3);
            result += "(" + resulttemp2 + ") | = ";
            
            int answer = odd - even;
            
            int abs = Math.abs(answer);
            result += abs + "\n";
            result += abs + " modulus 11 "; 
            if (abs % 11 == 0) {
                result += "= 0, " + print + " is divisible by 11\n\n";
            }
            else {
                result += "is not equal to 0, " + print + " is not divisible by 11\n\n";
            }
        }
        return result;
    }
    
}