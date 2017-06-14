// time: 2:58 - 3:26, 3:30-3:40 . Total: 28 + 10 = 38 minutes
class sqRoot{
  public static void main(String[] args){
    double a = 36.0;
    System.out.println("\nValue of sqRoot: " +squareRoot(a));
  }
  public static double squareRoot(double a){
    System.out.println("Value of a: " + a);
    double x0 = a/2;
    double x1 = ( x0 + a/x0 ) / 2;
    System.out.println("Value of x0: " + x0 + " Value of x1: " + x1);
    while(Math.abs(x0-x1) > 0.0001){
      x0 = x1;
      x1 = ( x0 + a/x0 ) / 2;
      System.out.println("Value of x0: " + x0 + " Value of x1: " + x1);
    }

    return x1;

    /*
    double x0 = a/2;
    double x1 = (x0 + a/x0)/2;
    while(Math.abs(x1 - x0) >= 0.0001){
      x1 = (x0 + a/x0)/2;
      x0 = x1;
    }
    return x1;
    */

  }
}
