package method_challenge;

public class methodChallenge {
    public static void main(String[] args) {

        displayHighScorePosition("serhat",calculatePosition(950));
        displayHighScorePosition("mike",calculatePosition(1500));
        displayHighScorePosition("jack",calculatePosition(623));

    }

    public static void displayHighScorePosition(String playerName, int playerRank) {
        System.out.println(playerName + " managed to get into position: " + playerRank + " on the score list. ");
    }

    public static int calculatePosition(int score){

        int position = 4;
        if(score >= 1000){
            position = 1;
        } else if(score >= 500 && score < 1000) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        }
            return position;
    }
}
