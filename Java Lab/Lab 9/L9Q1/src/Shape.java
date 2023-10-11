/*
Define a class Shape. The class has a name, perimeter and area. The class has the
accessor method and mutator for perimeter and area. Besides, the class also has a
display method to display the name of the shape, perimeter and area in two decimal
points. Derived a class name Rectangle from Shape. The class has the extra side
length variables. The class has a method to accept input for both side length and a
method to compute the perimeter and area. Derived another class name Square from
Shape. The class has the extra side length variable. The class has a method to accept
input for side length and a method to compute the perimeter and area. Derived
another class name Circle from Shape. The class has the extra diameter variable.
The class has a method to accept input for diameter and a method to compute the
perimeter and area. Create a Tester class to test the program.
*/

public class Shape {

    private String name;
    private double perimeter;
    private double area;
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public void display() {
        System.out.println("Name of the shape: " + name);
        System.out.printf("Perimeter of the shape: %.2f%n", perimeter);
        System.out.printf("Area of the shape: %.2f%n", area);
    }
}

class Rectangle extends Shape {
    
    private double height;
    private double length;
        
    public Rectangle(double height, double length) {
        super.setName("Rectangle");
        this.height = height;
        this.length = length;
        super.setPerimeter(getPerimeter(height, length));
        super.setArea(getArea(height, length));
    }
    
    public double getPerimeter(double height, double length) {
        double perimeter = height * 2 + length * 2;
        return perimeter;
    }
    
    public double getArea(double height, double length) {
        double area = height * length;
        return area;
    }
}

class Square extends Shape {
    
    private double length;
        
    public Square(double length) {
        super.setName("Square");
        this.length = length;
        super.setPerimeter(getPerimeter(length));
        super.setArea(getArea(length));
    }
    
    public double getPerimeter(double length) {
        double perimeter = length * 4;
        return perimeter;
    }
    
    public double getArea(double length) {
        double area = length * length;
        return area;
    }
}
/*
Derived another class name Circle from Shape. The class has the extra diameter variable.
The class has a method to accept input for diameter and a method to compute the
perimeter and area. Create a Tester class to test the program.
*/

class Circle extends Shape {
    
    private double diameter;
        
    public Circle(double diameter) {
        super.setName("Circle");
        this.diameter = diameter;
        super.setPerimeter(getPerimeter(diameter));
        super.setArea(getArea(diameter));
    }
    
    public double getPerimeter(double diameter) {
        double perimeter = Math.PI * diameter;
        return perimeter;
    }
    
    public double getArea(double diameter) {
        double area = Math.PI * Math.pow((diameter / 2), 2);
        return area;
    }
}