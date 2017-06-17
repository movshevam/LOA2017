/*
Exercise 4.3. The first verse of the song “99 Bottles of Beer” is:
99 bottles of beer on the wall, 99 bottles of beer, ya’ take one
down, ya’ pass it around, 98 bottles of beer on the wall.
Subsequent verses are identical except that the number of bottles gets smaller
by one in each verse, until the last verse:
No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’
 can’t pass it around, ’cause there are no more bottles of beer on the wall!
And then the song(finally) ends.
Write a program that prints the entire lyrics of “99 Bottles of Beer.” Your
program should include a recursive method that does the hard part, but you might
want to write additional methods to separate the major functions of the program.
As you develop your code, test it with a small number of verses, like “3 Bottles
of Beer.”
The purpose of this exercise is to take a problem and break it into smaller
problems, and to solve the smaller problems by writing simple methods.
*/
class ex4_3Bottles{
  public static void main(String[] args){
    int n = 4; //can be set to 99
    printLine(n);
  }
  public static void printLine(int n){
    if(n >= 0){
      if(n == 0){ //last verse is different
        System.out.println("No bottles of beer on the wall, no bottles of beer,"
        + " ya’ can’t take one down, ya’ can’t pass it around, ’cause there are"
        + " no more bottles of beer on the wall!");
      }
      else{
        System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer, ya' take "
        + "one down, ya pass it arounf," + (n-1) + " bottles of beer on the wall.");
        n--;
        printLine(n);
      }
    } //giant if
  }
}
