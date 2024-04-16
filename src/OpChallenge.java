public class OpChallenge {
    public static void main(String[] args){
        double value1 = 20.00;
        double value2 = 80.00;
        double double_result = (value1 + value2) * 100.00;
        System.out.println(double_result);
        double remainder_dob = double_result % 40.00;
        System.out.println(remainder_dob);
       boolean isNoRemainder = (remainder_dob == 0) ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
