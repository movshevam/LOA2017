/*
Exercise 7.5. One way to calculate e^x is to use the infinite series expansion
ex =1+x+x2/2!+x3/3!+x4/4!+...
If the loop variable is named i, then the ith term is xi/i!.
1. Write a method called myexp that adds up the first n terms of this series.
You can use the factorial method from Section 6.8 or your iterative version
from the previous exercise.
2. You can make this method much more e cient if you realize that in each
iteration the numerator of the term is the same as its predecessor multiplied
by x and the denominator is the same as its predecessor multiplied by i. Use
this observation to eliminate the use of Math.pow and factorial, and check
that you still get the same result.
3. Write a method called check that takes a single parameter, x, and that
prints the values of x, Math.exp(x) and myexp(x) for various values of x.
The output should look something like:
1.0 2.708333333333333 2.718281828459045
HINT: you can use the String "\t" to print a tab character between
columns of a table.
4. Vary the number of terms in the series (the second argument that check
sends to myexp) and see the e↵ect on the accuracy of the result. Adjust this
value until the estimated value agrees with the “correct” answer when x is 1.
5. Write a loop in main that invokes check with the values 0.1, 1.0, 10.0,
and 100.0. How does the accuracy of the result vary as x varies? Compare
the number of digits of agreement rather than the difference between the actual
and estimated values.
6. Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and
-100.0. Comment on the accuracy.
*/
import java.math.BigInteger;
import java.math.BigDecimal;
class ex7_5expansion{
  public static void main(String[] args) {
    System.out.println("infinite series expansion");
    // part1.testPart1();
    // part2.testPart2();
    // part3.testPart3();
    // part4.testPart4();
    part5.checkLoop();
    part6.checkLoop();
  }


}
/** Part1: Pattern in power and denominator: increment by 1.
    myexp(double x, int n) = Calculates values of first n terms, takes sum.
    Uses iterations with factorials.
        e^x = 1 + x + (x^2)/2! + (x^3)/3! +...
            = (x^0)/0! + (x^1)/1! + (x^2)/2! + (x^3)/3! +...
        Starting with i=0, we increment by 1 after solving (x^i)/i!
    factorial(n) = Calculates factorial of n iteratively.
*/
class part1{
  /** Calculates the sum of first n terms of an infinite series expansion of e^x.
     @param x - power e is raised to
     @param n - number of first terms.
     @return sum of first n terms.
  */
  public static double myexp(double x, int n){
    int i=0;
    double sum = 0;
    while(i<n){
      BigInteger temp = factorial(i);   //factorial value can get too big for an int
      sum+= Math.pow(x,i) / temp.doubleValue(); //adds value of ith term
      i++;                 //temp.doubleValue()= converts BigInteger to double
    }
    return sum;
  }
  /** Calculates the factorial of n using BigInteger.
     @param n - integer.
     @return factorial.
  */
  public static BigInteger factorial(int n){
    int i=0;
    BigInteger factorial = BigInteger.valueOf(1);  //value of factorial = 0!
    while(i < n){
      BigInteger temp = BigInteger.valueOf(n-i); //value of n-i
      factorial = factorial.multiply(temp);
      i++;
    }
    return factorial;
  }
  /** Tests factorial and myexp by printing loops of 5 elements each.
  */
  public static void testPart1(){
    System.out.println("testing part1");
    // System.out.println("testing factorial:\nn\tn!");
    // for(int i=16; i<21;i++){
    //   System.out.println(i+"\t"+factorial(i));
    // }
    // System.out.println("testing myexp:\nn\tmyexp(2,n)");
    // for(int i=0; i<6;i++){
    //   System.out.println(i+"\t"+myexp(2,i));
    // }
    System.out.println("testing myexp:\nn\tmyexp(1,n)");
    for(int i=16; i<17;i++){
      System.out.println(i+"\t"+myexp(1,i));
    }
  }
}
/** Part2: Pattern between values of terms: next is previous times x/i.
    methods within:
    myexp(double x, int n):
    e^x = 1 + x + (x^2)/2! + (x^3)/3! +...
    term 1: 1
    term 2: 1*x/1
    term 3: x*x/2
    term 4: ((x^2)/2) * x/3
    term value depends on the previous value.
    Return sum of first n terms.
    testPart2() :prints out value of myexp for x = 2 for size 0 to 5.
*/
class part2{
  /** Calculate the first n terms of ISE of e^x by multiplyng by x/i.
    @param x - power e is raised to
    @param n - number of terms
  */
  public static double myexp(double x, int n){
    int i = 0;
    double term = 0;
    double sum = 0;
    double factor = 1;
    while(i < n){
      /** If n is 1, then i=0.
          To avoid computational confusion, it's separate.*/
      if(i == 0){
        term++; //term = 1;
      }
      else{
        factor = (x/i); //fixed error if i =0 ^
        term *= factor; // 1*x/1 = 1x, x*x/2 = (x^2)/2, etc.
      }
      sum += term; //add term value to sum regardless of i.
      i++; //move on to next term.
    }
    return sum;
  }
  /** Test myexp by printing a loop of 5 elements
  */
  public static void testPart2(){
    // System.out.println("testing part2\nn\tmyexp(2,n)");
    // for(int i=0; i<6; i++){
    //   System.out.println(i+"\t"+myexp(2,i));
    // }
    System.out.println("testing part2\nn\tmyexp(1,n)");
    for(int i=16; i<21; i++){
      System.out.println(i+"\t"+myexp(1,i));
    }
  }
}
/** Part3: Checking and testing with various values of x, n is set to 5.
check(double x) compares values of part1 and part2 and e^x for
various values of x and n=5.
*/
class part3{
  /** Prints value of e^x and the two myexp functions(first 5 terms).
    @param x - the value e is raised to.
  */
  public static void check(double x){
    System.out.println("testing part3");
    System.out.format("%s%18s%10s%10s%n", "x","Math.exp(x)","part1","part2");
    System.out.format("%.3f%10.5f%16.5f%10.5f%n%n", x, Math.exp(x),part1.myexp(x,5),part2.myexp(x,5));
  }
  /** Tests check for various values of x.
  */
  public static void testPart3(){
    check(2);
    check(3);
    check(-1);
    check(0);
    check(4.5);
  }
}
/** Part4: Checking and testing with various values x and n.
  check(double x, int n) compares values of part1 and part2 and e^x
  for various values of x and n.
  testPart4() tests check for various values
*/
class part4{
  /** Prints value of e^x and the two myexp functions with a given amount of terms.
    @param x - the value e is raised to.
    @param n - number of terms of infinite series expansion that are used.
  */
  public static void check(double x, int n){
    System.out.println("testing part4 for n= "+n);
    System.out.format("%s%18s%10s%10s%n", "x","Math.exp(x)","part1","part2");
    System.out.format("%.3f|%10.5f|%16.5f|%10.5f%n", x, Math.exp(x),part1.myexp(x,n),part2.myexp(x,n));
  }
  /** Tests check for various values of x and n.
  */
  public static void testPart4(){
    // check(2,13);
    // check(3,5);
    check(-1,6);
    check(0,6);
    check(4.5, 20);
  }
}
/** Part5: Checks exp with values 0.1, 1.0, 10.0, 100.0 in a loop.
*/
class part5{
  public static void checkLoop(){
    double i=0.1;
    while(i< 101){
      System.out.println(i);
      part4.check(i, 20);
      i*=10;
    }
  }
}
/** Part6: Checks exp with values -0.1, -1.0, -10.0, -100.0 in a loop.
*/
class part6{
  public static void checkLoop(){
    double i=-0.1;
    while(i> -101){
      //System.out.println(i);
      part4.check(i, 20);
      i*=10;
    }
  }
}
