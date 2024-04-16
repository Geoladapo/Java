package ChapterTwo;

public class MOChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " +convertToCentimeter(5,8) + "cm.");
        System.out.println("68in = " + convertToCentimeter(68) + "cm.");
    }

    public static double convertToCentimeter(int inches){
        double cm = inches * 2.54;
        return cm;
    }
    public static double convertToCentimeter(int feet, int inches){
        int inch = (feet * 12) + inches;
       return convertToCentimeter(inch);
    }
}
