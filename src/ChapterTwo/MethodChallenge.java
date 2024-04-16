package ChapterTwo;

    public class MethodChallenge {
        public static void main(String[] args) {
            displayHighScorePosition("Tim", 1500);
        }
        public static void displayHighScorePosition(String playerName, int highScorePosition){
            System.out.println(playerName +" managed to get position "+ highScorePosition(1500) + " with the score of "+ highScorePosition);
        }
        public static int highScorePosition(int playerScore) {
            if (playerScore >= 1000)
                return 1;
            if (playerScore >= 500 && playerScore < 1000)
                return 2;
            if (playerScore >= 100 && playerScore < 500)
                return 3;
            return 4;
        }
    }
