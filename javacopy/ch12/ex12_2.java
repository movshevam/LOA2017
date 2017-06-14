/*
Exercise 12.2. Write a method called randomDouble that takes two dobles, low
and high, and that returns a random double x so that low <= x < high.
*/
//import java.util.Random;
class ex12_2{
  public static void main(String[] args) {
    test();
  }
  public static double randomDouble(double low, double high){
    double x = Math.random() * ((high - low)) + low;
    //random is between 0.0 and 1.0
    //high - low = range of where numbers can go:
    return x;
  }
  public static double[] randomArray(int n, double low, double high){
    double[] a = new double[n];
    for(int i =0; i< a.length; i++){
      a[i] = randomDouble(low, high);
    }
    return a;
  }
  public static void test() {
    double[] a = new double[10];
    a = randomArray(10, 14,15);
    for(int i =0; i< a.length; i++){
      System.out.println(a[i]);
    }
  }
}
