public class WhileLoop{
  public static void main(String[] args){
    int count1 = 0;
    int count2 = 0;
    int totalCount = 0;
    while(count1 <= 10){
      count2 = 1;
      while(count2 <= 50){
        totalCount++;
        System.out.println("Here Again");
        count2++;
      }
      count1++;
    }
    System.out.println(totalCount);
  }
}
