/*String operators: Concatenation of strings*/
class str_operators{
  public static void main(String[] args){
    String bob = "spider";
    //String cob = bob - 1; this can not work!
    String print = bob + "ism"; //this is ok
    System.out.println(print);
    //composition/ ability to compose:
    System.out.println(bob + "ism");
    String word2 = "hello\"";
    System.out.println(word2);
    //left side of assignment is always the variable name
/*EXTRA:
String + int = String*/
    int number = 451;
    String result = print + number;
    System.out.println(result);
  }
}
