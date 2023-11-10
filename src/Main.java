
public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5.0);
        double radius = circle.getRadius();
        double area = Circle.calculateArea(radius);
        double circumference = Circle.calculateCircumference(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

    }
}