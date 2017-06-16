/*INTRODUCTION TO INTEGER DIVISION!*/
/*Exercise 2.3. 1. Create a new program called Time.java. From now on, I won’t
remind you to start with a small, working program, but you should.
2. Following the example in Section 2.6, create variables named hour, minute and
second, and assign them values that are roughly the current time. Use a 24-hour
clock, so that at 2pm the value of hour is 14.
3. Make the program calculate and print the number of seconds since midnight.
4. Make the program calculate and print the number of seconds remaining in the day.
5. Make the program calculate and print the percentage of the day that has passed.
6. Change the values of hour, minute and second to reflect the current time
(I assume that some time has elapsed), and check to make sure that the program
works correctly with different values.
The point of this exercise is to use some of the arithmetic operations, and to
start thinking about compound entities like the time of day that that are
represented with multiple values. Also, you might run into problems computing
percentages with ints, which is the motivation for floating point numbers in the
next chapter.
HINT: you may want to use additional variables to hold values temporarily during
the computation. Variables like this, that are used in a computation but never
printed, are sometimes called intermediate or temporary variables.
*/
/*This program prints out the approximate time it was made. Introduction to
composition and concatenation.*/
class ex2_3time{
  public static void main(String[] args){
    System.out.println("This prints out the approximate time this was made.");
    int hour, minute, second;  //declare integer variables
    hour = 22;  minute = 48;  second = 13;  //set values to variables
    hour = 23; minute = 43; second = 30; //round 2 of testing with different values
    /*Prints out number of seconds elapsed since midnight:*/
    System.out.println("Number of seconds since midnight: ");
    int num_sec = hour * 60 * 60 + minute * 60 + second; //composition
/*variables used in a computation but never printed are intermediate or temporary
variables. num_sec is not intermediate. Intermediate variables:
    int secInHour = hour*60*60;
    int secInMin = minute*60;
Intermediate variables make it easier to read long computation code.
which will be used like so:
    int num_sec = secInHour + secInMin + second;
*/
    System.out.println(num_sec);
    /*Computes and prints number of seconds remaining in the day:*/
    System.out.println("Number of seconds remaining in the day: ");
    int tot_sec = 24*60*60;
    System.out.println(tot_sec - num_sec);  //use of composition
    /* Prints percentage of the day that has passed: Uses fraction of seconds*100*/
    System.out.println("Percentage of day that has passed: ");
    System.out.println( (num_sec*100/tot_sec)); //use of composition
/* IMPORTANT:
Do not compute fractions with integers. Integer division rounds down.Percentage
calculated for the first minute since midnight will return 0 because the time
passed is very small.Percentage works with integer division on very large numbers. */

  }
}
