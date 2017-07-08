class Ex11_3Rational{
  int num, denum;
  //Default constructor
  public Ex11_3Rational(){
    this.num = 0;
    this.denum = 1;
  }
  //constructor
  public Ex11_3Rational(int num, int denum){
    if(denum == 0){
      System.out.println("Error, denominator is zero");
      return;
    }else{
      this.num = num;
      this.denum = denum;
    }
  }
  /** Prints a rational number.
    @param r - a rational number
  */
  public static void printRational(Ex11_3Rational r){
    System.out.println(r.num + "/" + r.denum);
  }
  /** Negates a rational number.
    @param r - the rational number
  */
  public static void negate(Ex11_3Rational r){
    r.num *= -1;  //multiplies numerator by -1 (sign is usually on the top)
    //if numerator and denominator now are both negative, take absolute value
    //of both.
    if(r.num < 0 && r.denum <0 ){
      int tempN = Math.abs(r.num);
      int tempD = Math.abs(r.denum);
      r.num = tempN;
      r.denum = tempD;
    }
  }
  /** Inverts a rational number so that numerator and denominator switch places.
    @param r - a rational number.
  */
  public static void invert(Ex11_3Rational r){
    // if(r.num == 0 && r.denum==0){
    //   System.out.println("NaN");
    // }
    // else if(r.num == 0 && r.denum > 0){
    //   System.out.println("Infinity");
    // }
    // else if(r.num == 0 && r.denum < 0){
    //   System.out.println("Negative Infinity");
    // }
    // else{
      int temp = r.num; //create a temporary storing space for numerator.
      r.num = r.denum; //set numerator to denominator
      r.denum = temp; //set denominator to original value of numerator;
    // }
  }
  /** Convert a rational number to decimal represenation.
    @param r - rational number.
    @return decimal represenation of numerator divided by denominator
  */
  public static double toDouble(Ex11_3Rational r){
    return (double) r.num/ (double) r.denum;
    //will return NaN if 0 divided by 0.
    //will return Infinity is 1 is deivided by 0.
    //will return negative Infinity is -1 is deivided by 0.

  }
  /** Reduce a rational number to simplest form using Euclid's algorithm.
    @param n - rational number
    @return a simplified rational number.
  */
  public static Ex11_3Rational reduce (Ex11_3Rational n){
    Ex11_3Rational result = new Ex11_3Rational(); //create an empty rational number object.
    int a = n.num;
    int b = n.denum;
    int r = a%b;
    int temp;
    if(r == 0){
      result.num = a/b;
      result.denum = 1;
      return result;
    }
    do{
      r = a%b; //a mod b = r
      temp = b;
      a = temp; //b becomes a
      b = r;    //r becomes b
                //repeat
    }while(b != 0);
    int gcd = a;
    result.num = n.num / gcd;
    result.denum = n.denum / gcd;
    return result;

  }
  /** Add two rational numbers together
    @param a - one rational number
    @param b - another rational number
    @return their sum in simplest form
  */
  public static Ex11_3Rational add(Ex11_3Rational a, Ex11_3Rational b){
    Ex11_3Rational sum = new Ex11_3Rational();
    sum.num = (a.num * b.denum) + (b.num * a.denum);
    sum.denum = a.denum * b. denum;
    return reduce(sum);
  }



  public static void main(String[] args) {
    try{
      //this prints NaN:
      Ex11_3Rational n1 = new Ex11_3Rational(0, 0);
      System.out.println(toDouble(n1));
      negate(n1);
      printRational(n1);
      // //this prints Infinity:
      // Ex11_3Rational n2 = new Ex11_3Rational(1, 0);
      // System.out.println(toDouble(n2));
      // //this prints negative infinity:
      // Ex11_3Rational n3 = new Ex11_3Rational(-1, 0);
      // System.out.println(toDouble(n3)+"\n");
      //
      // //work with simple fraction -2/7
      // Ex11_3Rational n4 = new Ex11_3Rational(-2, 7);
      // printRational(n4);
      // invert(n4); // take the inverse: 7/-2
      // printRational(n4);
      // System.out.println(toDouble(n4)); //print value of 7/-2
      // negate(n4); // 7/2
      // printRational(n4);
      // System.out.println(toDouble(n4)+"\n"); //print value of 7/2
      //
      // //work with 24/6 which can be reduced:
      // Ex11_3Rational a = new Ex11_3Rational(24,6);
      // printRational(a);
      // System.out.println(toDouble(a));
      // Ex11_3Rational b = reduce(a);   //reduced version of a
      // printRational(b);
      // System.out.println(toDouble(b));
      // //sum of a and b:
      // Ex11_3Rational c = add(a, b);   //sum of a and b
      // printRational(c);
      // System.out.println(toDouble(c)+"\n");
      //
      // //work with simple fraction 25/3
      // Ex11_3Rational d = new Ex11_3Rational(25,3);
      // printRational(d);
      // Ex11_3Rational e = new Ex11_3Rational(-3,25);
      // printRational(e);
      // //sum of d and e
      // Ex11_3Rational f = add(d,e);
      // printRational(f);
      // System.out.println(toDouble(f));
    }
    catch(Exception e){
      System.out.println("found a mistake");
    }


  }
}
