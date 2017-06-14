/*
Exercise 9.4. You might be sick of the factorial method by now, but we’re going
to do one more version.
1. Create a new program called Big.java and write an iterative version of
factorial.
2. Print a table of the integers from 0 to 30 along with their factorials. At
some point around 15, you will probably see that the answers are not right any
more. Why not?
3. BigIntegers are Java objects that can represent arbitrarily big in- tegers.
There is no upper bound except the limitations of mem- ory size and processing
speed. Read the documentation of BigIn- tegers at
http://download.oracle.com/javase/6/docs/api/java/ math/BigInteger.html.
4. To use BigIntegers, you have to add import java.math.BigInteger to the
beginning of your program.
5. There are several ways to create a BigInteger, but the one I recommend uses
valueOf. The following code converts an integer to a BigInteger:
int x = 17;
         BigInteger big = BigInteger.valueOf(x);
Type in this code and try it out. Try printing a BigInteger.
6. Because BigIntegers are not primitive types, the usual math operators don’t
work. Instead we have to use methods like add. To add two BigIntegers, invoke
add on one and pass the other as an argument. For example:
    BigInteger small = BigInteger.valueOf(17);
    BigInteger big = BigInteger.valueOf(1700000000);
    BigInteger total = small.add(big);
Try out some of the other methods, like multiply and pow.
7. Convert factorial so that it performs its calculation using BigIntegers and
returns a BigInteger as a result. You can leave the parameter alone—it will
still be an integer.
8. Try printing the table again with your modified factorial method. Is it
 correct up to 30? How high can you make it go? I calculated the factorial of
 all the numbers from 0 to 999, but my machine is pretty slow, so it took a
 while. The last number, 999!, has 2565 digits.
*/
import java.math.BigInteger;
class Big{
  public static void main(String[] args) {
    int x = 17;
    BigInteger small = BigInteger.valueOf(x);
    System.out.println(small);
    BigInteger big = BigInteger.valueOf(1700000000);
    System.out.println(big);
    BigInteger total = small.add(big);
    System.out.println(total);
    System.out.println(small.pow(17));
    BigInteger product = small.multiply(big);
    System.out.println(product);
    System.out.println(small.subtract(BigInteger.valueOf(7)) + "\n");
    for(int i=0; i<2017; i++){
      System.out.println(i+"   "+ factorial(i) + "\n");
    }
  }
  public static BigInteger factorial(int n){
    // int result = 1;
    BigInteger result = BigInteger.valueOf(1);
    BigInteger nval = BigInteger.valueOf(n);
    for(int i=n; i>1; i--){
      BigInteger ival = BigInteger.valueOf(i);
      result = result.multiply(ival);
    }
    return result;

  }
}
