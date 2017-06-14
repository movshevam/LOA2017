class ex12_10{
  public static void main(String[] args) {
    //testIndex();
    //testSwap();
    testSort();
  }
  public static void testIndex(){
    int[] array = {0,1,2,3,4,5,6,7,8,9};
    int maxInt = indexOfMaxInRange(array, 0, array.length -1);
    System.out.println("index of max int in range: " + maxInt);
    System.out.println("max int in range: " + array[maxInt]);
  }
  public static void testSwap(){
    int[] array = {0,1,2,3,4,5,6,7,8,9};
    swapElement(array, 1,6);
    for(int i=0; i< array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
  public static void testSort(){
    int[] array = {0,1,2,3,4,5,6,7,8,9};
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + "  ");
    }
    System.out.println();
    selectionSort(array);
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + "  ");
    }
  }
  public static void selectionSort(int[] a){
    for(int j = 0; j< a.length; j++){
      int max = indexOfMaxInRange(a,  j,  a.length-1);
      swapElement(a, j, max);
    }

  }
  /* Finds the index of the maximum number within the given range in an array.
     Starts with setting the lowest index to max, finds anything bigger than it.
    @param a - array of ints
    @param lowIndex - lower bound of range
    @param highIndex - upper bound of range(inclusive)
    @return indexMax - index of maximum value
  */
  public static int indexOfMaxInRange(int[] a, int lowIndex, int highIndex){
    int max=a[lowIndex];
    int temp=0;
    int indexMax = lowIndex;
    // System.out.println("beginning max:" + max);
    for(int i = lowIndex+1; i<=highIndex; i++ ) {
      if(max < a[i]){
          max = a[i];
          indexMax = i;
        }
        //else, move on
    }
    return indexMax;

  }
  /* Swaps two elements within an array.
    @param a - array of integers
    @param first - index of first element
    @param second - index of second element
  */
  public static void swapElement(int[] a, int first, int second){
    int temp = a[first];
    a[first] = a[second];
    a[second] = temp;
  }
}
