import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }
}