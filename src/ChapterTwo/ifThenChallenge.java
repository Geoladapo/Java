package ChapterTwo;

public class ifThenChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true){
            finalScore =+ (levelCompleted * bonus);
            System.out.println("Your Final score was "+ finalScore);
        }

        System.out.println("******************************" +
                "\nCHALLENGE "+
                "\n******************************");

        boolean newGameOver = true;
        int newScore = 1000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if (newGameOver == true){
            newFinalScore =+ (newLevelCompleted * newBonus);
            System.out.println("Your Final score was "+ newFinalScore);
        }
    }
}
