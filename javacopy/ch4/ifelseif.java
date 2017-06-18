/*Rules for using if, else if, else */
class ifelseif{
  public static void main(String[] args){
    int x = 5;
    int y = 8;

    if(x < y){
      System.out.println("1st if works");
    }
    if( 12 > y){
      System.out.println("2nd if works");
    }
    if(12 < x){
      System.out.println("3rd if works");
    }
    else if(2*x > y){
      System.out.println("1st else if works");
    }
    else if( x> y){
      System.out.println("2nd else if works");
    }
    // else if( 3+x == y){
    //   System.out.println("2nd else if works");
    // }

    else{
      System.out.println("else works");
    }
  }
}
/*
pattern for if blocks
if      |works|works|works|skip |skip
if      |works|skip |skip |skip |skip
else if |skip |works|skip |works|skip
else if |skip |skip |skip |skip |skip
else    |skip |skip |works|skip |works
*/
