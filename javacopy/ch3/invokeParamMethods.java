/*Invoking methods with parameters*/
class invokeParamMethods{
  public static void main(String[] args){
    zool(11, "cactus", "Sun street");
  }
  //this is a method
  public static void zool(int a, String petname, String street){
    System.out.println(a + " " + petname + " " + street);
  }
}
