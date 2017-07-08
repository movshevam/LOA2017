//Main class: tests out child class: it can use the
//two functions defined in the parent class. Also
//no need to re-declare integer z.
class Main{
  public static void main(String[] args){
    int a = 20, b = 10;
    Child demo = new Child(0);
    demo.addition(a,b);
    demo.subtraction(a,b);
    demo.multiplication(a,b);
    //testing the use of super keyword to
    //differentiate members with same name
    demo.testingSuper();

    //Use of super keyword to invoke parent class
    //constructor.
    Child kid = new Child(24);
    kid.getAge(); //invokes parent method since getAge() doesn't exist in Child

    //tests whether two classes have an IS-A relationship
    //(class is an instance of another )
    Person human = new Person();
    Parent dad = new Parent(0);
    Child anna = new Child(0);

    System.out.println(human instanceof Person);
    System.out.println(dad instanceof Person);
    System.out.println(anna instanceof Person);

  }
}
