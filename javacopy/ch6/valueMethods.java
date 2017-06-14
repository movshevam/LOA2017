class valueMethods{
  public static void main(String[] args) {
    int poop = 2;
    int coop = 3;
    System.out.println("Value of foo1(poop, coop) = " +foo(poop, coop));
    System.out.println("Value of poop = "+poop+", value of coop = " + coop);
    String hen = "hen";
    String egg = "egg";
    System.out.println("Value of change(hen, egg) = " +change(hen, egg));
    System.out.println("Value of hen = "+hen+", value of egg = " + egg);
    // int[] ray = {1,2,3,4};
    // int[] bay = {5,6,7,8,9};
    // System.out.println("Value of array(ray, bay) = " +array(ray, bay));
    // System.out.println("Value of ray = "+ray+", value of bay = " + bay);

  }
  public static int foo(int a, int b){
    b = 1;
    a += 2;
    return a;
  }
  public static String change(String a, String b){
    a = "birb";
    b += "ism";
    return a;
  }

}
