package method_overloading;

public class methodOverloading {

    public void calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
    }

    public void calculateScore(int score){
        System.out.println("Unknown player scored " + score + " points");
    }

    public void calculateScore(){
        System.out.println("no any information");
    }

}
