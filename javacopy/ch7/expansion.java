class expansion{
public static void main(String[] args){
    System.out.println("first 5 terms of e^4 expansion1 = "+ myexp1(4, 5));
    System.out.println("first 5 terms of e^4 expansion2 = "+ myexp2(4, 5));
    System.out.println("first 5 terms of e^4 expansion: " + oneterm(4,0)
      + " + " + oneterm(4,1) + " + " + oneterm(4,2) + " + " + oneterm(4,3)
      + " + " + oneterm(4,4));
    int i = 0; double sum = 0;
    while(i<5){
      sum += oneterm(4,i);
      i++;
    }
    System.out.println("Sum: " + sum);
    check(4.0);
    checkDouble(4.0, 3);
}
//check with printing
public static void checkDouble(double x, int n){
  System.out.println( x +"\t" + Math.exp(x) + "\t" + myexp1(x,n));
}
//check with printing
public static void check(double x){
  System.out.println( x +"\t" + Math.exp(x) + "\t" + myexp(x));
}
//one parameter using patterns
public static double myexp(double x){
  double sum = 1;
  int i = 1; // term #
  double term = 1;
  double factor = x/i;
  while(Math.abs(sum - Math.exp(x)) > 0.01){
    factor = x/i;
    term*= factor;
    sum += term;
    i++;
  }
  return sum;
}
//One parameter using factorials .. doesn't work?
public static double myexpF(double x){
  double sum = 1;
  int i = 1; // term #
  while(Math.abs(sum - Math.exp(x)) > 0.01){
    sum += oneterm(x,i);
    i++;
  }
  return sum;
}
/* Calculates the value of an nth term by invoking factorial function.
  @param x - the power e is raised to.
  @param n - the number of the term.
  @return oneterm - value of nth term.
*/
public static double oneterm(double x, int n){
  double oneterm = (Math.pow(x,n) / factorial(n));
  return oneterm;
}
/* Calculates the sum of first n terms of an infinite series expansion of e^x.
  @param x - power e is raised to
  @param n - number of first terms.
  @return sum of first n terms.
*/
public static double myexp1(double x, int n){
  int i =0;
  double result = 0; //initial sum
  while(i < n){      //loop though first n terms
    result += oneterm(x,i); //add value of each term to sum.
    i++;
  }
  return result; //return sum
}
//calculate n first terms using patterns
public static double myexp2(double x, int n){
  // myexp = x^n / n! + ...
  int i =1;
  double term = 1;
  double sum = 1;
  double factor = 1;
  while(i<n){
    factor = (x / i);                             //result += 1 * x / 1
    term *= factor;    //result *= result * x / 1
    sum += term;
    i++;
  }
  return sum;
}
//factorial of n
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
