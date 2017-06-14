/*
Exercise 12.5.
Write a method named areFactors that takes an integer n and an array of
integers, and that returns true if the numbers in the array are all factors of
n (which is to say that n is divisible by all of them). HINT: See Exercise 6.1.

My interpretation: Проверить что массив состоит из делителей n.
if n mod a[i] != 0 then false
*/
class ex12_5{
  public static void main(String[] args) {
    test(); // calls the test
  }
  /* Determines whether all elements are divisors of n.
    @param n - likely product of factors
    @param a - array of integers
    @return true if n is divisible by all elements of a
            false if n is not divisible an element of a
  */
  public static boolean areFactors(int n, int[] a){
    for(int i=0; i<a.length; i++){
      if(n % a[i] != 0) return false;
    }
    return true;
  }
  /* Tests the areFactors method with a custom array.

  */
  public static void test(){
    int[] a = {3,6,9, 12,81,72};
    int n = 648;
    boolean flag = areFactors(n, a);
    if(flag == true){
      System.out.println(n +" is divisible by all elements of array.");
    }
    else{
      System.out.println(n + " fails the test.");
    }
  }

}
