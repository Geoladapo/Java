package ChapterTwo;

public class Main {
    public static void main(String[] args) {
        // convert miles to Kilometers
        int miles = 100;
        double kilometers = (miles * 1.609344);
        System.out.println(kilometers);

        int highScore = 50;
        if(highScore > 25) {
            highScore = 1000 + highScore;  // add bonus point
            System.out.println(highScore);
        }

        int health = 1000;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
