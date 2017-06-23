class HowClassCanBe{
  public static void main(String[] args) {
    NoVar.print();
    NoVar function = new NoVar();
    function.print();
    System.out.println(NoFun.a);
    NoFun x = new NoFun();    //can create object without constructor.
    System.out.println(x.a);
    OuterClass outer = new OuterClass();
    System.out.println(outer.out);
    System.out.println(outer.getIn());
    System.out.println(outer.getInOut());
    Empty empt = new Empty();


  }
}
class NoVar{
  public static void print(){
    System.out.println("birb");
  }
}
class NoFun{
  static int a = 6;     //can work only if static
}
class OuterClass{
  String out;
  public OuterClass(){
    this.out = "OuterClass";
  }

  public class InnerClass{
    String in;
    String out;
    public InnerClass(){
      this.out = "I am inside Out";
      this.in = "InnerClass";
    }

  }

  public String getIn(){
    InnerClass nested = new InnerClass();
    return nested.in;
  }
  public String getInOut(){
    InnerClass nested = new InnerClass();
    return nested.out;
  }
}
class Empty{}
