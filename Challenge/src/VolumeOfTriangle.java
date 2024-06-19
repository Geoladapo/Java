import java.util.Scanner;

public class VolumeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area, volume;


        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        double length = input.nextDouble();

        area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
        System.out.println("The area is " + area);
        volume = area * length;

        System.out.println("the volume of the trinagular prism is " + volume);
    }
}
