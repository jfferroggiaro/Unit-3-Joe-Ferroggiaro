import java.util.Scanner;

public class MinOfThree{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter First Integer");
    int num1 = input.nextInt();
    System.out.println("Enter Second Integer");
    int num2 = input.nextInt();
    System.out.println("Enter Third Integer");
    int num3 = input.nextInt();

    int min;

    if(num1 < num2){
      if(num1 < num3){
        min = num1;
      } else {
        min = num3;
      }
    } else if(num2 < num3){
      min = num2;
    } else {
      min = num3;
    }

    System.out.println("Min is " + min);
  }
}
