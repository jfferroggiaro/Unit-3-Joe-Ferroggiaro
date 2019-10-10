import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean inputValid = false;
    int games = 0;
    int wins = 0;

    while(!inputValid){
      System.out.println("How Many Games Played?");
      if(input.hasNextInt()){
        if(input.nextInt() > 0){
          games = input.nextInt();
          inputValid = true;
        } else
          System.out.println("Games Input Must be Greater than Zero");
          inputValid = false;
      } else {
        System.out.println("Games Input Must be an Integer");
        inputValid = false;
      }
      System.out.println("How Many Wins?");
      if(input.hasNextInt()){
        if(input.nextInt() >= 0){
          if(input.nextInt() <= games){
            wins = input.nextInt();
            inputValid = true;
          } else {
            System.out.println("Games Won Must be Less or Equal to Games Played");
            inputValid = false;
          }
        } else {
          System.out.println("Games Input Must be Greater or Equal to Zero");
          inputValid = false;
        }
      } else {
        System.out.println("Wins Input Must be an Integer");
        inputValid = false;
      }
    }

    double winPerc = (double) wins/games;

    System.out.println("You Won " + (winPerc*100.0) + "% of Your Games");

  }
}
