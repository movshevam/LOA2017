import java.math.BigInteger;
class ex9_5encrypt{
  public static void main(String[] args) {
    // int eleven = 11;
    // System.out.println(ABC(2225,2) + "\n");
    // System.out.println(pow(2225,2));
    BigInteger check = BigInteger.valueOf(55);
    BigInteger mate = BigInteger.valueOf(13);
    BigInteger result = alter(check, mate);
    System.out.println(result + "\n" + check + "\n" + mate);
    //after class type function, values of check and mate do not change

  }
  public static BigInteger alter(BigInteger x, BigInteger y){
    y = y.multiply(BigInteger.valueOf(5));
    x = x.add(BigInteger.valueOf(1));
    return x;
  }
  public static BigInteger pow(int x, int n) {
    if(n==0) return BigInteger.valueOf(1);

    //int t = pow(x, n/2);
    BigInteger xval = BigInteger.valueOf(x);
    BigInteger nval = BigInteger.valueOf(n/2);
    BigInteger tval = xval.pow(n/2);
    // BigInteger t2 = xval.pow(n/2);
    if(n%2 == 0){
      BigInteger result = tval.multiply(tval);
      return result;
    }
    else{
      BigInteger temp = tval.multiply(tval);
      return temp.multiply(xval);
    }

  }
  public static int ABC(int a, int b){
    if (b == 0) return 1;
    // find x to the n/2 recursively
    double bb = b;
    bb /= 2;
    double t2 = Math.pow(a, bb);
    // if n is even, the result is t squared
    // if n is odd, the result is t squared times x
    int t = (int) t2;
    if (b%2 == 0) {
      return t*t;
    } else {
      return t*t*a;
    }
  }
}
