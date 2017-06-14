class Factorial{
  public static void main(String[] args){
    int n = 5;
    System.out.println( n + "! = " + factorial(n));
  }
  public static int factorial(int n){
    int i = 0;
    int result = 1;
    while(i < n){
      result *= n-i;
      i++;
    }
    return result;
  }
}
