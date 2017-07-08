import java.util.Exception;
class NotNumbers{
  public static void main(String[] args) throws Exception{
      int zero = 0;
      int neg1 = -1, pos1 = 1, num = 2;

      RationalTest(zero, zero); //NaN
      RationalTest(neg1, zero); //-∞
      RationalTest(pos1, zero); //+∞
      RationalTest(num, zero); //+∞
      RationalTest(num, num); //this is rational

  }
  public static void RationalTest(int num, int denum){
    Rational test = new Rational(num, denum);
    System.out.println("testing "+num+"/"+denum);
    test.printFraction();
    test.printDouble();
    Rational testInverse = test.inverse();
    System.out.println("testing "+denum+"/"+num);
    testInverse.printFraction();
    testInverse.printDouble();
    System.out.println();
  }
}
class Rational{
  int numerator;
  int denumerator;
  String status;
  //create Rational object with a status of rational or not.
  public Rational(int n, int d){
    numerator = n;
    denumerator = d;
    if(denumerator != 0){ status = "Rational";}
    else{
      if(numerator < 0){ status = "-Infinity"; }
      if(numerator == 0){ status = "NaN"; }
      if(numerator > 0){ status = "Infinity";}
    }
  }

  public Rational inverse(){
    return new Rational(denumerator, numerator);
  }
  public void printFraction(){
    if(denumerator == 0){
      System.out.println(status); return;
    }
    System.out.println(numerator+"/"+denumerator);
  }
  public double toDouble(){
    double result = (double) numerator / (double) denumerator;
    if(numerator == 0 && denumerator < 0){
      result = Math.abs(result);
    }
    return result;
  }
  public void printDouble(){
    System.out.println(toDouble());
  }
}
