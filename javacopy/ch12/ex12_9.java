/*
Exercise 12.9
1. Write a method called maxInRange that takes an array of integers and a range
of indices (lowIndex and highIndex), and that finds the maximum value in the
array, considering only the elements between lowIndex and highIndex, including
both ends.
This method should be recursive. If the length of the range is 1, that is, if
lowIndex == highIndex, we know immediately that the sole element in the range
 must be the maximum. So that’s the base case.
If there is more than one element in the range, we can break the array into two
pieces, find the maximum in each of the pieces, and then find the maximum of the
maxima.
2. Methods like maxInRange can be awkward to use. To find the largest element in
an array, we have to provide a range that includes the entire array.
double max = maxInRange(array, 0, a.length-1);
Write a method called max that takes an array as a parameter and that uses
maxInRange to find and return the largest value. Methods like max are sometimes
called wrapper methods because they provide a layer of abstraction around an
awkward method and make it easier to use. The method that actually performs the
computation is called the helper method.
3. Write a recursive version of find using the wrapper-helper pattern. find
should take an array of integers and a target integer. It should return the
index of the first location where the target integer appears in the array, or
-1 if it does not appear.
*/

class ex12_9{
  public static void main(String[] args) {
    int[] a = {0,3,1,9,5,3,7,6,4,2};
    int lastIndex = a.length -1;
    int maxVal = maxInRange(a, 0, lastIndex);
    System.out.println("The max in this range is: "+maxVal);
    System.out.println("The max value in the array is: " + max(a));
    int target = 5;
    int targetIndex = findTarget(a, target);
    System.out.println(target + " has index " + targetIndex);
  }
  /** Calculates the maximum value wihtin the whole array.
     This is a wrapper method! maxInRange is a helper method!
    @param a - array of ints
  */
  public static int max(int[] a){
    int max = maxInRange(a, 0, a.length - 1);
    return max;
  }
  /** Calculates the maximum value within a given section of an array.
    @param a - array of integers
    @param lowIndex - lower bound of sub array
    @param highIndex - upper bound of sub array(inclusive)
    @return max - maximum number within array
  */
  public static int maxInRange(int[] a, int lowIndex, int highIndex){
    int length = highIndex - lowIndex + 1;
    // System.out.println("length" + length);
    int max = a[lowIndex];
    // System.out.println("maxOrig: " + max);
    int max1, max2;
    if(length == 1){
      // System.out.println("Length is 1");
      max = a[lowIndex];
      // System.out.println("Lastmax: " + max);
      return max;
    }
    if(length%2 == 0 && length > 0){
      // System.out.println("Length is even");
      if(length == 2){
        // System.out.println("Length is 2");
        if(a[lowIndex] > a[highIndex]){
          max = a[lowIndex];
          // System.out.println("Length 2 max: " + max);
        }
        else{
          max = a[highIndex];
          // System.out.println("Length 2 max: " + max);
        }
        return max;
      }
      else{
        max1 = maxInRange(a, lowIndex, lowIndex + length/2 - 1);
        max2 = maxInRange(a, lowIndex + length/2 , highIndex);
        if(max1 > max2){ //
          max = max1;
          // System.out.println("max1: " + max);
        }
        else{
          max = max2;
          // System.out.println("max2: " + max);
        }
      }

    }
    if(length%2 == 1 && length > 0){
      max1 = maxInRange(a, lowIndex, lowIndex + (length-1)/2);
      max2 = maxInRange(a, lowIndex+(length+1)/2, highIndex);
      if(max1 > max2){
        max = max1;
        // System.out.println("max1: " + max);
      }
      else{
        max = max2;
        // System.out.println("max2: " + max);
      }
      return max;
    }

      return max;


  }
  /** Finds the index of a number within the array.
    @param a - array of integers
    @param target - integer to be found
    @return index of integer if found
            -1 if not found
  */
  public static int find(int[] a, int target){
    for(int i =0; i< a.length; i++){
      if(a[i] == target){
        return i;
      }
    }
    return -1;
  }
  /** Wrapper method for finding index of a number
    @param a - array where to find number
    @param target - number to find
    @return index of target
  */
  public static int findTarget(int[] a, int target){
    int targetIndex = find(a, target);
    return targetIndex;
  }
}
