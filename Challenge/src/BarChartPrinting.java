import java.util.Scanner;


public class BarChartPrinting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < nums[i]; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

// You need to read in five integers, and then when you are done, do something with them.
// This means you need some way to store all five integers.
// The obvious solution is to store them in an array.
// Having done that you merely need to iterate over each number in the array to print the correct number of asterisks.