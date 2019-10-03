import java.util.Scanner;

public class AgeTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Age");
    int age = input.nextInt();
    if(age < 17){
      System.out.println("You may not drink or drive.");
    } else if(age < 21){
      System.out.println("You may drive, but not drink.");
    } else {
      System.out.println("You may drink and drive, but not at the same time.");
    }
  }
}
