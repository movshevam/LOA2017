/*
Exercise 3.4. The purpose of this exercise is to take code from a previous
exercise and encapsulate it in a method that takes parameters. You should start
with a working solution to Exercise 2.2.
1. Write a method called printAmerican that takes the day, date, month and year
as parameters and that prints them in American format.
2. Test your method by invoking it from main and passing appropriate arguments.
The output should look something like this (except that the date might be
different):
     Saturday, July 16, 2011
3. Once you have debugged printAmerican, write another method called
printEuropean that prints the date in European format.

Use of encapsulation: encapsulate previously used methods
*/
class ex3_4printdate{
  public static void main(String[] args){
    printAmerican("Thursday", 1, "June", 2017);
    printEuropean("Thursday", 1, "June", 2017);
  }
  public static void printAmerican(String day, int date, String month, int year){
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
  public static void printEuropean(String day, int date, String month, int year){
    System.out.println(day + ", " + date + " " + month + ", " + year);
  }

}
