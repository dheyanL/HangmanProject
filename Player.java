import java.util.Scanner;
public class Player {


    public static Scanner inputScanner = new Scanner(System.in);
    
    private String name;
    private int score = 0;
    public Player(String name){
        this.name = name;
        setName();
        this.name = name;

    }
    private void setName(){
        System.out.println("Enter your name " + getName());
        name = inputScanner.nextLine();
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
        System.out.println("Guess");
        return inputScanner.nextLine();
    }
 

}
