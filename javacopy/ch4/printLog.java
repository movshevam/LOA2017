class printLog{
  public static void main(String[] args){
    printLogarithm(-5.0);
    printLogarithm(5.0);

  }
  public static void printLogarithm(double x) {
    if (x <= 0.0) {
      System.out.println("Positive numbers only, please.");
      return;
    }
    double result = Math.log(x);
    System.out.println("The log of x is " + result);
  }
}
