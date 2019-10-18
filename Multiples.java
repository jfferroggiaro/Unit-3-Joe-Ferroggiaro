import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the base number");
    int input = scan.nextInt();
    System.out.println("Enter the maximum");
    int max = scan.nextInt();
    int count = 0;

    for(int i = 1; i*input <= max; i++){
      count++;
      if(count % 5 == 0)
        System.out.print("\n");
      System.out.print(i*input + ", ");
    }
  }
}
