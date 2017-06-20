class ex7_5expansion{
  public static void main(String[] args) {
    System.out.println("infinite series expansion");
    part1.testPart1();
    part2.testPart2();
    part3.testPart3();
    part4.testPart4();
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
      sum+= Math.pow(x,i) / factorial(i); //adds value of ith term
      i++;
    }
    return sum;
  }

  /** Calculates the factorial of n.
     @param n - integer.
     @return factorial.
  */
  public static int factorial(int n){
    int i=0;
    int factorial = 1;  //value of factorial = 0!
    while(i < n){
      factorial *= n-i;
      i++;
    }
    return factorial;
  }

  /** Tests factorial and myexp by printing loops of 5 elements each.
  */
  public static void testPart1(){
    System.out.println("testing part1");
    // System.out.println("testing factorial:\nn\tn!");
    // for(int i=0; i<6;i++){
    //   System.out.println(i+"\t"+factorial(i));
    // }
    // System.out.println("testing myexp:\nn\tmyexp(2,n)");
    // for(int i=0; i<6;i++){
    //   System.out.println(i+"\t"+myexp(2,i));
    // }
    System.out.println("testing myexp:\nn\tmyexp(4.5,n)");
    for(int i=16; i<21;i++){
      System.out.println(i+"\t"+myexp(4.5,i));
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
    System.out.println("testing part2\nn\tmyexp(4.5,n)");
    for(int i=16; i<21; i++){
      System.out.println(i+"\t"+myexp(4.5,i));
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
    // check(2);
    // check(3);
    // check(-1);
    // check(0);
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
    System.out.format("%.3f%10.5f%16.5f%10.5f%n", x, Math.exp(x),part1.myexp(x,n),part2.myexp(x,n));
  }
  /** Tests check for various values of x and n.
  */
  public static void testPart4(){
    // check(2,13);
    // check(3,5);
    // check(-1,6);
    // check(0,6);
    check(4.5, 20);
  }
}
