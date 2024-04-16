/*****
 * Your challenge is to create four new variables
 * A byte variable
 * A Short variable,
 * An int variable
 *
 * Lastly, create a variable of type long. Make it equal to 50,000 plus 10 times the sum of
 * the values of the first 3 variables (in other words, use the variable names in your
 * expression to calculate the sum).
 */
public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte numberInByte = 100;
        short numberInShort = 342;
        int numberInInt = 30000;

        long totalOfAllVar = 50000L + 10 * (numberInInt + numberInByte + numberInShort);
        System.out.println(totalOfAllVar);
    }
}
