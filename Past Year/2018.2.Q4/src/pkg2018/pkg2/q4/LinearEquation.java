package pkg2018.pkg2.q4;

public class LinearEquation {

    private int a,b,c,d,e,f;
    
    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean isSolvable() {
        return (a * d - b * c != 0);
    }
    
    public int computeX() {
        int x = (e*d - b*f) / (a*d - b*c);
        return x;
    }
    
    public int computeY() {
        int y = (a*f - e*c) / (a*d - b*c);
        return y;
    }
    
    @Override
    public String toString() {
        String result = "The equation :" +
                "\n" + a + "x" + " + " + b + "y = " + e +
                "\n" + c + "x" + " + " + d + "y = " + f;
        if (isSolvable()) {
            result += "\n\nx = " + computeX() + " ; y = " + computeY();
        }
        
        return result;
    }
}