/*Checks whether input is made up solely of digits with no other extra
characters. This is useful to check if input is an intger or not.
If it's an integer, prints out "intger input". If not, "non-integer input".
Works by:
1) converting input string into an array of characters
2) create array of integers ASCIIArr that contain respective ASCII values of
characters from charArray. Subtract 48 from each, since digits go from 48-57.
3) create empty string "processed" and add contents of ASCIIArr to it.
4) compare input string to processed string. If characters at identical index
don't match, input string did not depict an integer.
*/
//check that input shows an integer, no other characters
import java.util.Scanner;
class CheckInputIsAnInteger{
  public static Scanner input = new Scanner(System.in);
  public static boolean isInt(String dog){
    //convert input into character array and print
    char[] charArray = dog.toCharArray();
    // for(int i=0; i<charArray.length; i++){
    //   System.out.print(charArray[i]+" ");
    // }
    // System.out.println();

    //turn charArray into arrayOfASCII - 48 (to track digits)
    int[] ASCIIArr = new int[charArray.length];
    for(int i=0; i<charArray.length;i++){
      ASCIIArr[i] = (int) charArray[i] - 48;
    }
    // //print out values of ASCIIArr
    // for(int i=0; i<ASCIIArr.length; i++){
    //   System.out.print(ASCIIArr[i]+" ");
    // }
    // System.out.println();

    //add values of ASCIIArr to an empty string and print it.
    String processed = "";
    for(int i=0; i<ASCIIArr.length; i++){
      processed+= ASCIIArr[i];
    }
    // System.out.println(processed);
    // System.out.println();

    //check if new string is the same as original input string.
    for(int i=0; i<processed.length();i++){
      if(dog.charAt(i) != processed.charAt(i)){
        // System.out.print("Non-");
        // break;
        return false;
      }
    }
    // System.out.println("integer input");
    return true;
  }
  public static void main(String[] args){
    String dog = input.next(); //get next word  //.nextLine() get whole line
    System.out.println("you wrote: "+dog);
    // toInt(dog);




  }
}
