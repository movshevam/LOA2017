/*
Exercise 2.2. 1. Create a new program named Date.java. Copy or type in something
like the “Hello, World” program and make sure you can compile and run it.
2. Following the example in Section 2.4, write a program that creates variables
named day, date, month and year. day will contain the day of the week and date
will contain the day of the month. What type is each variable? Assign values to
those variables that represent today’s date.
3. Print the value of each variable on a line by itself. This is an intermediate
step that is useful for checking that everything is working so far.
4. Modify the program so that it prints the date in standard American form:
Saturday, July 16, 2011.
5. Modify the program again so that the total output is:
     American format:
     Saturday, July 16, 2011
     European format:
     Saturday 16 July, 2011
The point of this exercise is to use string concatenation to display values with
different types (int and String), and to practice developing programs gradually
by adding a few statements at a time.
*/

/*This program prints out the date it was made on*/
class ex2_2date{
  public static void main(String[] args){
    System.out.println("This prints out the date the program was made.");
    String day, month; //declare String variables
    int date, year; //declare int variables to store date info in.
    day = "Tuesday";  //initialize day  (day of the week)
    date = 30;        //initialize date (day of the month)
    month = "May";    //initialize month(in words)
    year = 2017;      //initialize year
    //Print date in American format: "day, month date, year"
    System.out.println("American format:");
    System.out.print(day + ", "); //concatenate day value to a comma
    System.out.print(month + " ");
    System.out.print(date + ", ");
    System.out.println(year);
    //Print date in European format: "day date month, year"
    //Uses composition in the whole print statement
    System.out.println("European format:\n" + day + " " + date + " " + month
      + ", " + year);
  }
}
