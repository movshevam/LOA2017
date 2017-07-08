//parent class. Contains declaration of inside variables
//as well as 2 functions.
class Parent extends Person {
  int z;

  public void addition(int x, int y){
    z = x+y;
    System.out.println("The sum of the given numbers: "+z);
  }
  public void subtraction(int x, int y){
    z = x-y;
    System.out.println("The difference between the given numbers: "+z);
  }
//---------
  int num = 20;
  public void display(){
    System.out.println("This is parent display");
  }
//-------
  int age;
  Parent(int age){
    this.age = age;
  }
  public void getAge(){
    System.out.println("The value of variable \"age\" in parent class is:"+age);
  }
}
