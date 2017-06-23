/** Checking functions performed on an array.
*/
class ArrayExperimentation{
  public static void main(String[] args) {
    int[] nums = {10,13,15,27,38, 41, 42, 55};    printArray(nums);
    //insert 40 into previous array:
    int[] morenums = InsertValue(40, nums);       printArray(morenums);
    //move values forward from previous array:
    int[] movedF = moveValuesForward(morenums);   printArray(movedF);
    //move back:
    int[] movedB = moveValuesBackward(morenums);  printArray(movedB);
    printArray(moveValuesBackward(movedB));

    int[] array = {10,13,15,27,38, 41, 42, 55};
    mystery(array);
    printArray(array);

    int[] small = {0,1};
    int[] large = {0,0,0,0,1,0,0,0,0,0,1,0};
    System.out.println(hasMirrorTwice(large, small));


  }
  public static void printArray(int[] array){
    for(int i=0; i< array.length; i++){
      System.out.print(array[i]+"\t");
    }
    System.out.println();
  }
  /** Insert value into an assumed sorted array.
    @param value - value to be inserted
    @param array - sorted array
    @return value and elements of array in a new array.
  */
  public static int[] InsertValue(int value, int[] array){
    int result[] = new int[array.length +1 ];
    int pos = 0;
    for(int i=0; i<array.length; i++){
      if( value > array[i]){
        pos = i+1;
      }
    }
    for(int i=0; i<pos; i++){
      result[i] = array[i];
    }
    result[pos] = value;
    for(int i=pos+1; i<result.length; i++){
      result[i] = array[i-1];
    }
    return result;
  }
  /** Shifts values in an array 1 to the right.
    @param array - given array
    @return the array
  */
  public static int[] moveValuesForward(int[] array){
    int val = array[array.length-1]; //55
    for(int i=array.length-1; i>0;i--){
      array[i] = array[i-1];    //this works without temp!!!!
    }
    array[0] = val;
    return array;
  }
  /** Shifts values in an array 1 to the left.
    @param array - the given array
    @return the array.
  */
  public static int[] moveValuesBackward(int[] array){
    int val = array[0];
    for(int i=1; i<array.length; i++){
      array[i-1] = array[i];
    }
    array[array.length-1] = val;
    return array;
  }
  /** Fill first value with last, the rest with the original value of first.
  */
  public static void mystery(int[] array){
    int tmp = array[array.length -1];
    for(int i=1; i <array.length;i++){
      array[i] = array[i-1];  //this makes every value after a[0] equal to it.
    }
          //loop below would actually shift by 1 to the right!
    // for(int i=array.length-1; i > 0; i--){
    //   array[i] = array[i-1];  //this actually works!
    // }
    array[0] =tmp;
  }

  public static boolean hasMirrorTwice(int[] large, int[] small){
    //reverse the small array
    for(int i=0; i<small.length/2; i++){
      int temp = small[i];
      small[i] = small[small.length-1-i];
      small[small.length-1-i] = temp;
    }
    if(large.length <= small.length){
      return false;
    } //end if

    int sIndex = 0;
    int instance = 0;
    for(int i=0; i< large.length; i++){
      if(large[i] == small[sIndex]){
        sIndex++;
      }
      else{
        sIndex=0;
      }
      if(sIndex == small.length){
        instance++;
        sIndex = 0;
      }
    }
    if (instance < 2){
      return false;
    }
    return true;
  } //end hasMirrorTwice
}
