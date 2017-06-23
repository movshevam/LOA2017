/**Merge Sort divided array into halves and orders them within the parts*/
class MergeSort{
  public static void main(String[] args) {
    int[] nums = {55,30,6,12,5,81,29,3,60};

  }
  /** Find the largest among two values.
    @param a - first value
    @param b - second value
    @return the largest.
  */
  public static int findMaximum(int a, int b){
    if(a >= b) return a;
    if(a < b) return b;
  }
  public static int[] sortArray(int[] a){
    int len = end - start + 1;
    int leftEnd = start + len/2 -1;
    int rightStart = start + len/2;
    int[] left = makeArray(a, 0, leftEnd);
    int[] right = makeArray(a, rightStart, len);
  }
  public static int[] makeArray(int[] a, int start, int end){

  }
}
