/** IDEA: Introduction to inheritance.
*/
import java.util.Scanner;
class Inheritance{
  public static void main(String[] args) {
    System.out.println("Inheritance class");
    MFunction abra = new MFunction(); //create MFunction object
    //get input from keyboard
    Scanner input = new Scanner(System.in);
    String str = input.next();
    if(CheckInputIsAnInteger.isInt(str)){
      Shape s = new Shape(Integer.parseInt(str));
      abra.function(s);
    }else{
      Shape s = new Shape(str);
      abra.function(s);

    }

  }
}
class SecretF{
  //use like: SecretFObject.function(n)
  public void function(int n){
    System.out.println((int)Math.pow(n,2));
  }
}
class MFunction extends SecretF{
  //use like: MFunctionObject.function(shapeObject)
  public void function(Shape o){
    if(o.str == null){
      super.function(o.num);
    }else{
      System.out.println("Square");
    }
  }
}
class Shape{
  String str;
  int num;
  Shape(int n){
    num = n;
  }
  Shape(String s){
    str = s;
  }
}
