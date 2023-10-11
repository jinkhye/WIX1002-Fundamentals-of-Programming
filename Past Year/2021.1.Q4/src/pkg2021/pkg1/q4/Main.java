package pkg2021.pkg1.q4;

public class Main {

    public static void main(String[] args) {
        DivideF1 a = new DivideF1("data.dat");
        display(a);
        DivideF2 b = new DivideF2("data.dat");
        display(b);
    }
    
    public static void display(Eleven el) {
        System.out.println(el.divide());
    }
}