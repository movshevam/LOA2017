/*
Exercise 6.9. Write a recursive method called power that takes a double x
and an integer n and that returns xn.
Hint: a recursive definition of this operation is xn = x·xn 1. Also, remember
that anything raised to the zeroeth power is 1.
Optional challenge: you can make this method more e cient, when n is even,
using x^n =  (x^n/2)^2.
*/
class ex6_9power{
  public static void main(String[] args) {
    System.out.println(power(2,4));

  }
  /* Recursive method, finds the value of x raised to a power.
    @param x - to be raised
    @param n - power
    @return result - x to n power.
  */
  public static double power(double x, int n){
    if(n == 0){ return 1;}
    if(n%2 == 0){
      double temp = power( x, n/2);
      return temp*temp;
    }
    double result = x * power(x, n-1);
    return result;
  }
}
