/*
Exercise 11.2. Write a class definition for Date, an object type that contains
three integers, year, month and day. This class should provide two constructors.
The first should take no parameters. The second should take parameters named
year, month and day, and use them to initialize the in- stance variables.
Write a main method that creates a new Date object named birthday. The new
object should contain your birthdate. You can use either constructor.
*/
class Date{
  int year, month, day;
  public Date(){
    this.year = 0;
    this.month = 0;
    this.day = 0;
  }
  public Date(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }
  public static void main(String[] args) {
    Date birthday = new Date(1997, 12, 17);
  }
}
