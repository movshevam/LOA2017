/** This class contains the Merge Sort algorithm. There are two methods:
  1) mergeSort with parameter of an array of integers returns a sorted array
    (elements are sorted by value in incresing order).
  2) merge with parameters of two arrays (of same or different size) returns
     a sorted array containing all elements of the two given arrays.

mergeSort ALGORITHM:
1) You have an array to sort. It is given to you as a parameter.
2) If your array has length 1 or 0, you return the array. There is nothing
to sort when there is only one element in array of none.
3) If the array length is greater than 1, create two new arrays to hold
the halves of the original array. Fill in the arrays(use a for loop)
4) Use recursion! mergeSort each half of the original array.
(REMEMBER! Recursion calls up this very method again. Base cases prevent
infinite recursion. Here, the base case appears when array length is 0 or 1).
5) Now that your arrays are sorted, merge the two together via merge
method. (REMEMBER! This part appears in recursion step! Imagine you just
returned two arrays each of size 1. After this step, you return the new
array(size 2 now) and will have to do this again with the other half)
6) Return the new array. This is either the end of the recursicve loop
or end of the iteration.

merge ALGORITHM:
1) You have two arrays to merge together so that the values in the new
array appear in order of increasing value.
2) Create a new array so that it has enough space to hold all elements of
each given array. (The array is not initialized, elements equal to zero)
3) Compare the first element of each array. Find the smallest and input
it into the fist free spot the new array(LEFTMOST SPOT).
4) Now you move up an index in the array you took the element from, and
find the next smallest between the first and second array.
5) Continue steps 3 and 4 until you ran out of elements in either array.
Then, fill in the rest of the new array with the remaining elements of
the leftover array.
*/

class MergeSort{

  /** Recursive method: divides array into halves, then invokes merge.
    @param a - array to be sorted
    @return sorted array (from small to large).
  */
  public static int[] mergeSort(int[] a){
    //Base case for recursive method: if array is size 1: {_} or empty {}
    if(a.length <= 1){  //if array is of size 1 or 0, return array
      return a;
    }

    //Create two halves for the array
    int[] a1 = new int[a.length/2];         //divide into two equal or
    int[] a2 = new int[a.length-a1.length]; //unequal halves

    //Fill in the arrays with the halves' respective elements
    for(int i=0; i<a1.length;i++){    //filling in half 1 : a1
      a1[i] = a[i];
    }
    for(int i=a1.length; i<a.length;i++){ //filling in half 2 : a2
      a2[i-a1.length] = a[i];
    }

    //Input above arrays(both halves) into this function again to split them
    // even more and then sort according to merge method or refer to base case.
    int[] merged_a1 = mergeSort(a1);    //if you return this instead of merged
                                        //array, you get the leftmost element
                                        //of the array.
    int[] merged_a2 = mergeSort(a2);    //this is the rightmost element


    //Invoke the merge method on the sorted arrays (Refer to next method)
    //It returns a merged sorted array.
    int[] merged = merge( merged_a1 , merged_a2 );

    //Return the sorted array.
    return merged;
  }


  /** Merges two sorted arrays into one so that the result is also sorted.
    @param a1 - one sorted array of integers
    @param a2 - another sorted array of integers
    @return a sorted array of integers made up of a1 and a2.
  */
  public static int[] merge(int[] a1, int[] a2){
    //Create a new array to fit all elements of a1 and a2
    //This is not yet initialized: all elements are set to zero.
    int[] merged = new int[a1.length+a2.length];

    //These are indices of the two arrays. These are needed to compare
    //the smallest elements of each array. Since we are looping through
    //the MERGED array, we need to keep track as to which element of a1
    //or a2 we are comparing.
    int i=0;  //index of a1 ( starting index of first array)
    int j=0;  //index of a2 ( starting index of second array)

    //Loop through MERGED array to and input necessary values from
    //arrays a1 and a2( the smallest element)
    for(int k=0; k < merged.length; k++){

      //When either array runs out of elements to add:
      //If all elements of a2 have been sorted, add elements from a1:
      if( j == a2.length){
        merged[k] = a1[i];
        i++;  //increment a1 index so that the next element can be added
              //at the next index of MERGED
      }
      //If all elements of a1 have been sorted, add elements from a2:
      else if( i == a1.length){
        merged[k] = a2[j];
        j++;  //increment a2 index so that the next element can be added
              //at the next index of MERGED
      }

      //If smallest element of a2 is smaller than a1's,
      //add a2's element to MERGED, move up index of a2.
      else if(a2[j] < a1[i]){
        // System.out.println("a2 small");
        merged[k] = a2[j];
        j++;
      }
      //If smallest element of a1 is smaller than a2's,
      //add a1's element to MERGED, move up index of a1.
      else if(a1[i] < a2[j]){
        // System.out.println("a1 small");
        merged[k] = a1[i];
        i++;
      }
    }

    //after all values have been sorted, return the merged array:
    return merged;
  }

  /** Testing.
  */
  public static void main(String[] args) {
    //TESTING MERGESORT METHOD
    int[] array = {9,8,7,6,5,4,3,2,1};
    int[] sorted = mergeSort(array);
    for(int i=0; i< sorted.length; i++){
      System.out.print(sorted[i]+" ");
    }

    System.out.println();
    int[] test = {22,33,44,66,55,0,11,35,77,99,60};

    int[] mergeSortTest = mergeSort(test);
    for(int i=0; i< mergeSortTest.length;i++){
      System.out.print(mergeSortTest[i] + " ");
    }

    System.out.println();
    //TESTING MERGE METHOD
    int[] test3 = {0,22,33,44,55,66};
    int[] test4 = {11,35,60,77,99};

    int[] mergeTests = merge(test3, test4);
    for(int i=0; i< mergeTests.length; i++){
      System.out.print(mergeTests[i]+" ");
    }
  }
}
