/*
Exercise 12.6.
Write a method that takes an array of integers and an integer named target
as arguments, and that returns the first index where target appears in the
array, if it does, and -1 otherwise.

My interpretation: find the first location of a particular integer in an array.
Найти где впервые встречается нужное целов число в массиве.
*/
class ex12_6{
  public static void main(String[] args) {
    test(); //calls test method
  }
  /* Finds where a given integer first appears in an array.
    @param a - array of integers.
    @param target - integer to be found.
    @return index of target in array if its found.
            -1 if target does not exist within array.
  */
  public static int firstLocation(int[] a, int target){
    for(int i=0; i<a.length; i++){
      if(a[i] == target) return i;
    }
    return -1;
  }
  /* Test the firstLocation method using a custom array
  */
  public static void test(){
    int[] a = {1,3,2,3,44,5,66,4,4,32,9};
    int target = -4;
    int x = firstLocation(a, target);
    System.out.println("The first location of " + target + " is " + x);

  }
}
