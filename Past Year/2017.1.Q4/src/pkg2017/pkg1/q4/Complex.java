package pkg2017.pkg1.q4;

public class Complex {
    
    public double real;
    public double imaginary;
    
    public Complex() {
        real = 0;
        imaginary = 0;
    }
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex addComplexNum (Complex b) {
        double r = this.real + b.real;
        double i = this.imaginary + b.imaginary;
        Complex result = new Complex(r, i);
        return result;
    }
    
    public Complex subtractComplexNum (Complex b) {
        double r = this.real - b.real;
        double i = this.imaginary - b.imaginary;
        Complex result = new Complex(r, i);
        return result;
    }
    
    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}