import java.util.Random;
public class Generator{
  public static void main(String[] args) {
      Random rand = new Random();
      int a = 6011;
      b = 6;
      System.out.println(b);
      System.out.print(a);
      for(int j =0; j<3;j++){
        System.out.print("-");
        for(int i=0;i<4;i++){
          newRandomInt(rand);
        }
      }
      System.out.println();
  }
  public static void newRandomInt(Random r){
    int temp = r.nextInt(10);
    System.out.print(temp);
  }

}
