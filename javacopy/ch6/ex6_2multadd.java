/*
WARNING: USE OF BASIC LOG RULES:
log(ab) = log(a) + log(b)
log(a/b) = log(a) - log(b)
log(a^b) = b* log(a)
Exercise 6.2. Many computations can be expressed concisely using the “multadd”
operation, which takes three operands and computes a*b + c. Some processors even
provide a hardware implementation of this operation for floating-point numbers.
1. Create a new program called Multadd.java.
2. Writeamethodcalledmultaddthattakesthreedoublesasparameters
and that returns their multadditionization.
3. Write a main method that tests multadd by invoking it with a few
simple parameters, like 1.0, 2.0, 3.0.
4. Also in main, use multadd to compute the following values:
sin (pi/4) + (cos(pi/4))/2
log10 + log20
5. Write a method called yikes that takes a double as a parameter and
that uses multadd to calculate
         _______
xe^-x + √1-e^-x
HINT: the Math method for raising e to a power is Math.exp.
In the last part, you get a chance to write a method that invokes a method you
wrote. Whenever you do that, it is a good idea to test the first method carefully
before you start working on the second. Otherwise, you might find yourself debugging
two methods at the same time, which can be difficult.
One of the purposes of this exercise is to practice pattern-matching: the ability
to recognize a specific problem as an instance of a general category of problems.
*/
class ex6_2multadd{
  public static void main(String[] args){
    //Write a main method that tests multadd:
    double answer1 = multadd(1.0, 2.0, 3.0);
    System.out.println(answer1);

    //a = cos(pi/4), b = 1/2, c = sin(pi/4)
    double sin = Math.sin(degtorad(45)); //Math.sin functions work with radians
    //degtorad = covert degrees to radians
    double cos = Math.cos(degtorad(45));
    double answer2 = multadd(cos, 1/2, sin);
    System.out.println(answer2);

    //log10 + log 20 = log 10 + log(10*2)
    //log 10 + log10 + log2 = 2*(log10) + log2
    //a = 2, b = log10, c = log2
    //also: Math.log is base e.
    //log10 base 10 = log10 base e / log10 base e
    double ten = Math.log(10)/Math.log(10);
    //log2 base 10 = log2 base e / log10 base e
    double two = Math.log(2)/Math.log(10);
    double answer3 = multadd(2, ten, two);
    System.out.println(answer3);

  }
  /* Multadd operation.
    @param a - first value
    @param b - second value
    @param c - third value
    @return a*b+c
  */
  public static double multadd(double a, double b, double c){
    return a*b + c;
  }
  /* Calculates value of xe^-x + √1-e^-x.
    @param x - value of x
    @return answer
  */
  public static double yikes(double x){
    double ee = Math.exp(-x);
    double square = Math.sqrt(1 - ee);
    double answer = multadd(x, ee, square);
    return answer;
  }
  /* Convert degrees to radians. Helper method.
    @param deg - degrees
    @return radians
  */
  public static double degtorad(double deg){
    return deg * Math.PI / 180;
  }
}
