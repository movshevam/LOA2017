/*
Exercise 7.4. Section 6.8 presents a recursive method that computes the
factorial function. Write an iterative version of factorial.
*/
class ex7_4factorial{
  public static void main(String[] args){
    int n = -4;
    if(n < 0){
      System.out.println("Impossible to compute."); //DID NOT ADD THIS!!!
    }
    else{
      System.out.println( n + "! = " + factorial(n));
    }
  }
  public static int factorial(int n){
    int i = 0;
    int result = 1;
    while(i < n){
      result *= n-i; //n-0 * n-1 * n-2 * ... * 1
      i++;
    }
    return result;
  }
}
