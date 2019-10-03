import java.util.Scanner;

public class DrinkingAge{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Age");
    int age = input.nextInt();
    if(age >= 21){
      System.out.println("You may drink in this country.");
    }else{
      System.out.println("You may not drink in this country.");
    }
  }
}
