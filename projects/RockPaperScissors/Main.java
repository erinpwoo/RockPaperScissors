/**
 * Rock Paper Scissors Game - Girls Who Code TA Technical Project.
 * Github: @erinpwoo
 * 
 * Description: Randomizes rock paper scissors game with 2 players. Whichever player reaches 2/3 first, wins.
 */
import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        int playerOneWinCount = 0;
        int playerTwoWinCount= 0;
        
        System.out.println("Let's play rock, paper, scissors! First to win 2/3 games wins!");
        
        for (int i = 0; i < 3; i++)
        {
            Game round = new Game();
            System.out.println(round.playOneRound());
            
            if (round.getP1Move().equals("rock")) {
                if (round.getP2Move().equals("scissors")) {
                    System.out.println("Player one wins round.");
                    playerOneWinCount ++;
                }
                else if (round.getP2Move().equals("paper")){
                    System.out.println("Player two wins round.");
                    playerTwoWinCount++;
                }
                else if (round.getP2Move().equals("rock")){
                    System.out.println("Tie! Redo round.");
                    i--;
                }
            }
            else if (round.getP1Move().equals("paper")) {
                if (round.getP2Move().equals("scissors")) {
                    System.out.println("Player two wins round.");
                    playerTwoWinCount ++;
                }
                else if (round.getP2Move().equals("rock")){
                    System.out.println("Player one wins round.");
                    playerOneWinCount++;
                }
                else if (round.getP2Move().equals("paper")){
                    System.out.println("Tie! Redo round.");
                    i--;
                }
            }
            else {
                if (round.getP2Move().equals("rock")) {
                    System.out.println("Player two wins round.");
                    playerTwoWinCount ++;
                }
                else if (round.getP2Move().equals("paper")){
                    System.out.println("Player one wins round.");
                    playerOneWinCount++;
                }
                else if (round.getP2Move().equals("scissors")){
                    System.out.println("Tie! Redo round.");
                    i--;
                }
            }
            if(playerOneWinCount == 2) {
                System.out.print("Player 1 wins!");
                break;
            }
            if(playerTwoWinCount == 2) {
                System.out.print("Player 2 wins!");
                break;
            }
            System.out.println();
        }
    }
}
