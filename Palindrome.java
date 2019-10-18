import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a palindrome");

    String input = scan.lextLine();
    input = input.replaceAll("\\s", "");
    input = input.replaceAll(",", "");
    input = input.toLowerCase();
    String half = input.substring(0, ((int) input.length()/2);
    int count = 0;
    boolean isPalindrome = false;

    while(count < half.length())
      if(half.charAt(count) != input.charAt(input.length - count)){
        boolean isPalindrome = false;
      }

  }
}
