import java.util.Scanner;
public class Player {

    public static Scanner inputScanner = new Scanner(System.in);
    
    private String name;
    private int score = 0;
    public Player(String name){
        setName();
        this.name = name;

    }
    private void setName(){
        name= inputScanner.nextLine();
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void addScore(int amount){
        score+= amount;
    }
    public String getGuess(){
        
        return inputScanner.nextLine();
    }
 

}
