
import java.util.Random;
public class Game
{
    // instance variables
    private String[] objectsArray;
    private String playerOneMove;
    private String playerTwoMove;
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        String playerOneMove = new String("");
        String playerTwoMove = new String("");
        
    }

    public String playOneRound()
    {
        String[] objectsArray = new String[]{"rock", "paper", "scissors"};
        int rnd = new Random().nextInt(objectsArray.length);
        int rnd2 = new Random().nextInt(objectsArray.length);
        playerOneMove = objectsArray[rnd];
        playerTwoMove = objectsArray[rnd2];
        
        return "Player 1 move: "+playerOneMove+"\nPlayer 2 move: "+playerTwoMove;
    }
    
    public String getP1Move() {
        return playerOneMove;
    }
    public String getP2Move() {
        return playerTwoMove;
    }
}
