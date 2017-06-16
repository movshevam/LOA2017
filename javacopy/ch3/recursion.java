/*INTRO TO RECURSION.
Use recursion to print out a statement*/
class recursion{
  public static void main(String[] args){
    int n = 4;
    foo(n);
  }
  public static void foo(int n){
    while(n!=3){
      //Call a function:
      System.out.println("I am printing out " + n);
      foo(n);
    }
  }
}
