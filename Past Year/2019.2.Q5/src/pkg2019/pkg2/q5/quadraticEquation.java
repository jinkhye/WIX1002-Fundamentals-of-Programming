package pkg2019.pkg2.q5;

public class quadraticEquation {
    
    private double a, b, c;
    
    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double geta() {
        return a;
    }
    
    public double getb() {
        return b;
    }
    
    public double getc() {
        return c;
    }
    
    public double Discriminant() {
        double discriminant = b*b - 4*a*c;
        return discriminant;
    }
    
    public double calcRoot1() {
        double r1 = (-b + Math.sqrt(Discriminant())) / (2 *a);
        return r1;
    }
    
    public double calcRoot2() {
        double r2 = (-b - Math.sqrt(Discriminant())) / (2 *a);
        return r2;
    }
}