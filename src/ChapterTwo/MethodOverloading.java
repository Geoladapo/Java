package ChapterTwo;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is "+ newScore);
//        calculateScore("Tim", 5);

        calculateScore(75);
        calculateScore();
    }
    // RETURN PLAYER NAME AND SCORE
    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored "+ score + " points");
        return score * 1000;
    }

    // RETURN PLAYER SCORE ONLY
    public static int calculateScore(int score){

        System.out.println("Unnamed player scored " +  score + " points");
        return score * 1000;
    }

    // RETURN ZERO
    public static int calculateScore(){

        System.out.println("No player name, no player score");
        return 0;
    }
}
