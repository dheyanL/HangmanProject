public class Game {
    private Player player1;
    private Player player2;
    private Secret secret;
    private int currentTurn;
    private boolean player1Turn = true;

    public Game(){
        secret = new Secret();
        player1 = new Player("A");
        player2 = new Player("B");
        currentTurn = 1;

    }
    public void play(String guess, int turn, String secret){
        String character = new String();
        while (!guess.equals(secret)){
        if (player1Turn){
            guess = player1.getGuess();
            if (guess.length() == 1){
                for(int i = 0; i<guess.length()-1; i++){
                    character = secret.substring(i, i+1);
                    if(guess.equals(character)){
                        System.out.println("The character "+ character +" is in position" + i);

                    }
                }
            }
            else if(guess.equals(secret)){
                break;
            }
            player1.addScore(1);
            switchTurn();
            
        }
        
        
        if (!player1Turn){
            guess = player2.getGuess();
            if (guess.length() == 1){
                for(int i = 0; i<guess.length()-1; i++){
                    character = secret.substring(i, i+1);
                    if(guess.equals(character)){
                        System.out.println("The character "+ character +" is in position" + i);

                    }
                }
            }
            else if(guess.equals(secret)){
                break;
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
