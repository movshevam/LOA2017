//Child class. Contains a new function: multiplication.
class Child extends Parent{
    public void multiplication(int x, int y){
      z = x*y;  //no need to declare zs again!
      System.out.println("The product of the given numbers: "+z);
    }
    //----
    int num = 10;
    public void display(){
      System.out.println("This is child display");
    }
    public void testingSuper(){
      Child kid = new Child(0);

      kid.display(); //invoke display method of Child class
      display(); //same thing?
      super.display(); //invoke display of parent class

      System.out.println("Value of variable \"num\" in Child class: "+kid.num);
      System.out.println("Value of variable \"num\" in Child class: "+num);
      System.out.println("Value of variable \"num\" in Parent class: "+super.num);
    }
    //--------
    Child(int age){
      super(age);
    }
}
