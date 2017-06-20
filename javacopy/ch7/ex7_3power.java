/*
Exercise 7.3. In Exercise 6.9 we wrote a recursive version of power, which
takes a double x and an integer n and returns xn. Now write an iterative
method to perform the same calculation.
*/
class ex7_3power{
public static void main(String[] args){
  System.out.println("pow(4,3): "+power(4, 3));
}
public static double power(double x, int n){
  int i = 1;
  int result = 1;
  while( i <= n){
      result *= x;
      i++;
  }
  return result;
}
}
