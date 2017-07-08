/*
Exercise 7.3. In Exercise 6.9 we wrote a recursive version of power, which
takes a double x and an integer n and returns xn. Now write an iterative
method to perform the same calculation.
*/
class ex7_3power{
  public static void main(String[] args){
    System.out.println("pow(2,3): "+power(2, 3));
    System.out.println("pow(2,-3): "+power(2, -3));
  }
  public static double power(double x, int n){
    double result = 1;
    int i= 1;
    if(n == 0) return result;
    int val = (int) Math.abs(n);
    while(i <= val){
      result *= x;
      i++;
    }
    if(n < 0){
      return 1/ result;
    }
    return result;
  }
}
