/*Exercise 12.1.
Write a method called cloneArray that takes an array of integers as a parameter,
creates a new array that is the same size, copies the elements from the first
array into the new one, and then returns a reference to the new array.

What I think this is asking: Создайте копию множества(чтобы элементы второго
множества были такие же как у первого)
*/
class ex12_1{
  public static void main(String[] args) {
    test();
  }
  public static int[] cloneArray(int[] a){
    int[] b = new int[a.length];
    for(int i=0; i<a.length; i++){
      b[i] = a[i];
    }
    return b;
  }
  public static void test(){
    int[] a = {3,4,5,6,7,8};
    int[] b = cloneArray(a);
    System.out.println("a\tb");
    for(int i=0; i< b.length;i++){
      System.out.println(a[i] + "\t" + b[i]);
    }
  }
}
