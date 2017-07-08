/*Exercise 7.2. Let’s say you are given a number, a, and you want to find its
square root. One way to do that is to start with a very rough guess about the
answer, x0, and then improve the guess using the following formula:
x1 = (x0 + a/x0)/2
For example, if we want to find the square root of 9, and we start with x0 = 6,
then x1 = (6 + 9/6)/2 = 15/4 = 3.75, which is closer. We can repeat the
procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and
x3 = 3.00091. So that is converging very quickly on the right answer(which is 3).
Write a method called squareRoot that takes a double as a parameter and that
returns an approximation of the square root of the parameter, using this
technique. You may not use Math.sqrt. As your initial guess, you should use
a/2. Your method should iterate until it gets two consecutive estimates that
differ by less than 0.0001; in other words, until the absolute value of
xn-x(n-1) is less than 0.0001. You can use Math.abs to calculate the absolute
value.
*/
// time: 2:58 - 3:26, 3:30-3:40 . Total: 28 + 10 = 38 minutes
class ex7_2sqRoot{
  public static void main(String[] args){
    double a = 2;
    System.out.println("\nValue of sqRoot: " +squareRoot(a));
    System.out.println(Math.pow(squareRoot(a),2));
  }
  public static double squareRoot(double a){
    System.out.println("Value of a: " + a);
    double x0 = a/2;
    double temp = 0;
    double x1 = ( x0 + a/x0 ) / 2; //approximation function
    System.out.println("Value of x0: " + x0 + " Value of x1: " + x1);
    while(Math.abs(x0-x1) > 0.0001){ //while two consecutice
      temp = x1; //works without this?
      x0 = temp; //works without this? like so: x0 = x1;
      x1 = ( x0 + a/x0 ) / 2;
      System.out.println("Value of x0: " + x0 + " Value of x1: " + x1);
    }

    return x1;


    // double x0 = a/2;
    // double x1 = (x0 + a/x0)/2;
    // while(Math.abs(x1 - x0) >= 0.0001){
    //   x1 = (x0 + a/x0)/2;    <-ERROR
    //   x0 = x1;               <-ERROR
    // }
    // return x1;
    //

  }
}
