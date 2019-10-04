import java.util.Scanner;

public class TempTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the temperature?");
    int temp = input.nextInt();
    if(temp < 45){
      System.out.println("cold");
    } else if(temp < 68){
      System.out.println("cool");
    } else if(temp < 84){
      System.out.println("ideal");
    } else {
      System.out.println("hot");
    }
  }
}
