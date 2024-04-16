package ControlFlow;

public class ForStatement {
    public static void main(String[] args){

        for (int counter = 1; counter <= 5; counter++){
            System.out.print(counter + "");
        }

        System.out.println();
        for (double rate = 7.5; rate <= 10; rate += 0.25){
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("$100.00  at  "+ rate + "% interest = $" + calculateInterest(100.0, rate));
        }
    }
    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
}
