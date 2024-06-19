import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Enter integers (end with 0): ");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        if (max != Integer.MIN_VALUE) {
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }
}
