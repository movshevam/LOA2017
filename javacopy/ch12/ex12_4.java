/*
Exercise 12.4.
Encapsulate the code in Section 12.10 in a method called makeHist that takes
an array of scores and returns a histogram of the values in the array.
*/
class ex12_4{
  public static void main(String[] args) {
    test(); //call for test function
  }
  /* Creates a histogram showing the distribution of scores.
    @param scores - array of scores.
    @return counts - array showing the frequency of each score.
  */
  public static int[] makeHist(int[] scores) {
    int[] counts = new int[100];
    for(int i=0; i < scores.length; i++){
      int index = scores[i];
      counts[index]++;
    }
    return counts;
  }
  /* Create a random array of scores to test with.
    @param n - size of array (number of scores)
    @return a - random array of scores
  */
  public static int[] randomArray(int n){
    int[] a = new int[n];
    for(int i=0;i<a.length;i++){
      a[i] = (int) (Math.random() *100);
    }
    return a;
  }
  /* Print out score and frequency side by side.
  */
  public static void test(){
    int[] scores = new int[100];
    scores = randomArray(100);
    System.out.println("scores:");
    for(int i=0; i< scores.length; i++){
      System.out.println(scores[i]);
    }
    int[] counts = makeHist(scores);
    System.out.println("histogram of values:");
    for(int i=0; i< counts.length; i++){
      System.out.println(i + ":\t"+counts[i]);
    }
  }
}
