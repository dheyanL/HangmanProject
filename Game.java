import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static Scanner inputScanner = new Scanner(System.in);
    
    private Player player1;
    private Player player2;
    private Secret secret;
    private int currentTurn;
    private boolean player1Turn = true;
    public boolean gameWon = false;
    public static int winningPlayer;
    public ArrayList<String> picked = new ArrayList<String>();
    public Game(){
        secret = new Secret();
        player1 = new Player("A");
        player2 = new Player("B");
        currentTurn = 1;

    }
    public void play(){
        
        String secret;
        int turn = 0;
        String guess = new String("");
        String character = new String();
        System.out.println("What is the secret word?");
        secret = inputScanner.nextLine();
        while (!(guess.equals(secret))){
        if (player1Turn){
            guess = player1.getGuess();
            
            if (guess.length() == 1){
                for(int i = 0; i<picked.size(); i++){
                    if (guess.equals(picked.get(i))){
                        System.out.println("Already Picked!");
                        guess = player1.getGuess();
                        break;
                    }
                    else{ picked.add(guess);}
                }
                for(int i = 0; i<secret.length(); i++){
                    character = secret.substring(i, i+1);
                    if(guess.equals(character)){
                        System.out.println("The character "+ character +" is in position " + i);

                    }
                }
            }
          
            else if(guess.equals(secret)){
                gameWon=true;
                winningPlayer=1;
                System.out.println("Player "+ player1.getName() +" Wins!");
                break;
                
            }
            else{
                System.out.println("Invalid guess!");
            }
            
            
            player1.addScore(1);
            switchTurn();
            
        }
        
        
        if (!player1Turn){
            guess = player2.getGuess();
            if (guess.length() == 1){
                for(int i = 0; i<secret.length(); i++){
                    character = secret.substring(i, i+1);
                    if(guess.equals(character)){
                        System.out.println("The character "+ character +" is in position " + i);

                    }
                }
            }
            else if(guess.equals(secret)){
                gameWon=true;
                winningPlayer=2;
                System.out.println("Player "+ player1.getName() +" Wins!");
                break;
            }
            else{
                System.out.println("Invalid guess!");
            }
            player2.addScore(1);
            switchTurn();
            

        } 
    
    }
        
    }
    private void switchTurn(){
        player1Turn = !player1Turn;
    }
   /*   private Player getCurrentPlayer(){
        return this.Player();
    } */
}
