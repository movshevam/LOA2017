import java.util.Random;
class test12{
  public static void main(String[] args) {
    for(int i=0; i< 10; i +=5){ //I didn't know you can increment like this in for!
      System.out.print(i+"\n");
    }
    // for (; ; ) {
    //   ; //with or without this ;
    // } //will compile
    for (int i=0;i<10 ;i++ ) {
      double x = Math.random();
      System.out.println(x*100); //random percentages
    }
    System.out.println();
    int[] ra = new int[100];
    ra = randomArray(100);
    for(int i=0; i<ra.length;i++){
      System.out.println(ra[i]);
    }
    System.out.println();
    

  }
  public static int[] randomArray(int n){
    int[] a = new int[n];
    for (int i=0; i<a.length;i++ ) {
      a[i] = randomInt(90,100);
    }
    return a;
  }
  public static int randomInt(int low, int high){
    double randD = Math.random() * ((high-low) + 1);
    int randI = (int) randD + low;
    return randI;
    // Random rand = new Random();
    // int randNum = rand.nextInt((high - low) + 1) + low;
    // return randNum;

  }
}
