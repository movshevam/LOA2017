class ex7_5expansion{
  public static void main(String[] args) {
    System.out.println("infinite series expansion");
    System.out.println(myexp( 2.0 , 2));
  }

  /** Calculates the sum of first n terms of an infinite series expansion of e^x.
     @param x - power e is raised to
     @param n - number of first terms.
     @return sum of first n terms.
  */
  public static double myexp(double x, int n){
    int i=0;
    double sum = 0;
    while(i<n){
      if(i==0){sum+=1;}
      else{
        sum+= Math.pow(x,n) / factorial(i); //adds value of ith term
      }
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

}
