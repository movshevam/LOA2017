public class SortingArraysManyWays{
  public static void main(String[] args) {
    int[] array = {0,2,5,7,3,1,6};
    printArray(array);
    Bubble.BubbleSort(array);
    printArray(array);


  }
  public static void printArray(int[] a){
    for(int i=0; i< a.length; i++){
      System.out.print(a[i]+"\t");
    }
    System.out.println();
  }
}

// class Merge{
//   public static void main(String[] args) {
//     int[] a = {2,0,7,3,6,1,5,4};
//     int len = a.length;
//   }
//   public static void MergeSort(int[] a){
//     int len = a.length;
//   }
//   public static int findMaxInRange(int[] a, int start, int end){
//     //find biggest between start to end inclusive
//     int max = a[start];
//     int len = end - start + 1;
//     int max1, max2;
//     if(len == 1){
//       max = a[start];
//     }
//     if(len%2 == 0 && len > 0){
//       if(len == 2){
//         if(a[start] > a[end]){ max = a[start];}
//         else{ max = a[end];}
//       }
//       else{
//         max1 = findMaxInRange(a, start, start+length/2 - 1);
//         max2 = findMaxInRange(a, start+length/2, end);
//         if(max1>max2){
//           max = max1;
//         }
//         else{
//           max = max2;
//         }
//       }
//     }
//     if(len%2 == 1 && len > 0){
//       max1 = findMaxInRange(a, start, start +(length-1)/2);
//       max2 = findMaxInRange(a, start + (length+1)/2, end);
//       if(max1>max2){
//         max = max1;
//       }
//       else{
//         max = max2;
//       }
//     }
//
//     return max;
//   }
// }

class Bubble{
  public static void BubbleSort(int[] a){
    boolean shouldBeSorted = true;
    while(shouldBeSorted){
      shouldBeSorted = sweep(a);
    }
  }
  public static boolean sweep(int[] a){
    int temp = 0;
    int other = 0;
    boolean sweep = false;
    for(int i=0; i< a.length - 1; i++){
      if(a[i] > a[i+1]){
        temp = a[i];
        other = a[i+1];
        a[i] = other;
        a[i+1] = temp;
        sweep = true;
      }
    }
    return sweep;
  }
}
