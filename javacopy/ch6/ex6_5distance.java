/*
Exercise 6.5. The distance between two points (x1, y1) and (x2, y2) is
            _____________________
Distance = √(x2-x1)^2 + (y2-y1)^2
Write a method named distance that takes four doubles as parameters—x1, y1, x2
and y2—and that prints the distance between the points.
You should assume that there is a method named sumSquares that calculates and
returns the sum of the squares of its arguments. For example:
double x = sumSquares(3.0, 4.0); would assign the value 25.0 to x.
The point of this exercise is to write a new method that uses an existing one.
You should write only one method: distance. You should not write sumSquares or
main and you should not invoke distance.

My modification: added main and sumSquares to check if method works
*/
class ex6_5distance{
  public static void main(String[] args){
    distance(0.1, 0.1, 0.0, 5.0);
  }
  public static void distance(double x1, double y1, double x2, double y2){
    double a = x2 - x1; //∆ in x coordinates
    double b = y2 - y1;// ∆ in y coordinates
    double sumsq = sumSquares(a, b); //
    double answer = Math.sqrt(sumsq);
    System.out.println(answer);

  }
  /* Calculates the sum of squares of the two parameters.
    @param a - double value
    @param b - double value
    @return asq + bsq - sum of square of a
  */
  public static double sumSquares(double a, double b){
    double asq = Math.pow(a,2); //square of a
    double bsq = Math.pow(b,2); //square of b
    return asq + bsq;
  }
}
