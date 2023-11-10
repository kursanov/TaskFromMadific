public class Circle {
    private double radius;
    private static double PI = 4.445456;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double getPI() {
        return PI;
    }

    public static double calculateArea(double radius) {
        return PI * (radius * radius);
    }

    public static double calculateCircumference(double radius) {
        return PI * 2 * radius;
    }
}




