package l8q3;

public class WeightCalculator {
    private int age;
    private double height;

    private double recommendedweight;
    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        this.recommendedweight = recommendedweight();
    }

    public double recommendedweight() {
        return (height - 100 + age / 10) * 0.9;
    }

    public void displayAll() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended Weight: " + recommendedweight);
    }
}