public class WhileLoop{
  public static void main(String[] args){
    int num = 0;
    int dum = 8;
    while(num < 3){
      dum = 8;
      while(dum > 2){
        System.out.print(1+dum);
        dum -= 2;
      }
      num++;
    }
  }
}
