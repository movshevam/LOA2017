class ex12_3{
  public static void main(String[] args) {
    test();
  }
  public static int randomInt(int low, int high) {
    int x = (int)( Math.random() * (high-low)) + low;
    return x;
  }
  public static int[] randomArray(int n, int low, int high){
    int[] a = new int[n];
    for(int i=0; i< a.length; i++){
      a[i] = randomInt(low, high);
    }
    return a;
  }
  public static void test(){
    int[] a = new int[10];
    a = randomArray(10, 5,12);
    for(int i=0; i< a.length;i++){
      System.out.println(a[i]);
    }
  }
}
