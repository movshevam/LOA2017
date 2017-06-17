/*
Exercise 4.5. Fermat’s Last Theorem says that there are no integers a, b, and c
such that
an + bn = cn except in the case when n = 2.
Write a method named checkFermat that takes four integers as parameters— a, b, c
and n — and that checks to see if Fermat’s theorem holds. If n is greater than 2
and it turns out to be true that an +bn = cn, the program should print “Holy
smokes, Fermat was wrong!” Otherwise the program should print “No, that doesn’t
work.” You should assume that there is a method named raiseToPow that takes two
integers as arguments and that raises the first argument to the power of the
second. For example:
int x = raiseToPow(2, 3);
would assign the value 8 to x, because 2^3 = 8.
*/
class ex4_5fermat{
  public static void main(String[] args) {
    checkFermat(3,4,5,2);
  }
  public static void checkFermat(int a, int b, int c, int n){
      double sum = Math.pow(a,n)+Math.pow(b,n);
      double square = Math.pow(c,n);
      if(sum == square && n!= 2){
        System.out.println("Holy smokes, Fermat was wrong!");
      }
      else{
        System.out.println("No, that doesn’t work.");
      }
  }
}
