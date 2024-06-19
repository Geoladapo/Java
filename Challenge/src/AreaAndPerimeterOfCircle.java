public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 6.5;

        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("Perimeter of a circle: " + perimeter);
        System.out.println("Area of a circle: " + area);
    }
}
