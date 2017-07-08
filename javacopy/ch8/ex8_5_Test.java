/*
  The point of this exercise is to explore Java types and fill in some of the
  details that aren’t covered in the chapter.
1. Create a new program named Test.java and write a main method that contains
expressions that combine various types using the + operator. For example, what
happens when you “add” a String and a char? Does it perform addition or
concatenation? What is the type of the result? (How can you determine the type
of the result?)

2. Make a bigger copy of the following table and fill it in. At the intersection
of each pair of types, you should indicate whether it is legal to use the +
operator with these types, what operation is performed (addition or
concatenation), and what the type of the result is.

________|______boolean____|______char______|_____int_______|____String_____|
boolean |illegal          |illegal         |illegal        |concat. String |
char    |illegal          |addition, int   |addition, int  |concat. String |
int     |illegal          |addition, int   |addition, int  |concat. String |
String  |concat. String   |concat.  String |concat. String |concat. String |

3.Think about some of the choices the designers of Java made when they filled
in this table. How many of the entries seem unavoidable, as if there were no
other choice? How many seem like arbitrary choices from several equally
reasonable possibilities? How many seem problematic?
  unavoidable: all types concatenated with String
  arbitrary: char and int addition
  problematic: char added with char

4. Here’s a puzzler: normally, the statement x++ is exactly equivalent to
x=x+1. But if x is a char, it’s not! In that case,x++is legal, but x = x + 1
causes an error. Try it out and see what the error message is, then see if
you can figure out what is going on.
 char + int = int , not a char.

*/
class ex8_5_Test{
  public static void main(String[] args) {
    String s1 = "apple";
    String s2 = "sin";
    char c1 = 'a';
    char c2 = '&';
    int i1 = 12;
    int i2 = -9;
    boolean b1 = true;
    boolean b2 = false;
    String result = i1 + s2;

    //System.out.println(s1 + s2);
    //System.out.println(c1 + c2);
    //System.out.println(i1 + i2);
    System.out.println(i1 + s2);
    System.out.println(result);
    int x = 1;
    x++;
    x = x + 1;
    System.out.println(x);
    char y = 'a';
    y++;
    x = y + 1;
    //char + int ≠ char
    System.out.println(y);
    System.out.println(x);



  }


}
