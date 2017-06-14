class Rational{
  int num, denum;
  public Rational(){
    this.num = 0;
    this.denum = 1;
  }
  public Rational(int num, int denum){
    this.num = num;
    this.denum = denum;
  }
  public static void printRational(Rational r){
    System.out.println(r.num + "/" + r.denum);
  }
  public static void negate(Rational r){
    r.num *= -1;
    if(r.num < 0 && r.denum <0 ){
      int tempN = Math.abs(r.num);
      int tempD = Math.abs(r.denum);
      r.num = tempN;
      r.denum = tempD;
    }
  }
  public static void invert(Rational r){
    int temp = r.num;
    r.num = r.denum;
    r.denum = temp;
  }
  public static double toDouble(Rational r){
    if( r.denum == 0){
      return 0;
    }
    return (double) r.num/ (double) r.denum;
  }
  public static Rational reduce (Rational n){
    Rational result = new Rational();
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
  public static Rational add(Rational a, Rational b){
    Rational sum = new Rational();
    sum.num = (a.num * b.denum) + (b.num * a.denum);
    sum.denum = a.denum * b. denum;
    return reduce(sum);
  }
  public static void main(String[] args) {
    Rational number = new Rational(-2, 7);
    printRational(number);
    invert(number); // take the inverse: 7/-2
    printRational(number);
    System.out.println(toDouble(number)); //print value of 7/-2
    negate(number); // 7/2
    printRational(number);
    System.out.println(toDouble(number)); //print value of 7/2

    Rational zero = new Rational(0,0);
    negate(zero);
    printRational(zero);

    Rational a = new Rational(24,6);
    printRational(a);
    System.out.println(toDouble(a));

    Rational b = reduce(a);   //reduced version of a
    printRational(b);
    System.out.println(toDouble(b));

    Rational c = add(a, b);   //sum of a and b
    printRational(c);
    System.out.println(toDouble(c));

    Rational d = new Rational(25,3);
    printRational(d);
    Rational e = new Rational(-3,25);
    printRational(e);
    Rational f = add(d,e);
    printRational(f);
    System.out.println(toDouble(f));






  }
}
