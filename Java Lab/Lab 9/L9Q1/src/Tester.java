
public class Tester {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(10);
        Circle circle = new Circle(10);
        
        rectangle.display();
        System.out.println("");
        square.display();
        System.out.println("");
        circle.display();

    }
}