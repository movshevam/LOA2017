import java.util.Scanner;
public class Battleships{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
      String[][] myBoard = createBoard();
      printBoard(myBoard);
      setShips(myBoard);
      printBoard(myBoard);

  }
  public static String[][] createBoard(){
    String[][] board = new String [10][10];//x25E1 is lower half of circle //x301C wave dash
    int c = 0x2B1C; // x25A0 is black square, x25A1 is white square // x2B1C is large white square
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        board[i][j] = Character.toString((char) c);
      }
    }
    return board;
  }
  public static void printBoard(String[][] board){
    System.out.println("  А Б В Г Д Е Ж З И К");
    for(int i=0; i<10; i++){ //i is row
      System.out.print(i +" ");
      for(int j=0; j <10; j++){ //j is column
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void setShips(String[][] board){
    System.out.println("Input location of fleet:");
    int shipNum = 4;
    for(int shipSize = 1; shipSize <=4; shipSize++){ //shipSize is 1, then 2 then 3 then 4
      for(int i=0; i< shipNum;i++){ //
        setNewPosition(board, shipSize);
      }
      shipNum--;
    }



  }
  public static void setNewPosition(String[][] board, int shipSize){
    String s ="";
    char alpha, num;
    System.out.print("Enter location of size"+shipSize+" ship: ");
    s = input.next();
    for(int n=1; n<=s.length();n+=2){
      alpha = s.charAt(n-1);
      num = s.charAt(n);
      //checkValidity(alpha, num);
      board[Character.getNumericValue(num)][convertAlpha(alpha)] = ""+shipSize;
    }
  }
  public static boolean checkValidity(String[][] board, char alpha, char num){
    String content = Character.toString((char) 0x2B1C);
    int row = Character.getNumericValue(num);
    int col = convertAlpha(alpha);
    if(row < 0 ) return false;
    if(col < 0 ) return false;
    //other variables:
    int top, bottom, left, right;
    int tr, tl, br, bl;

    return true;
  }
  public static int convertAlpha(char alpha){
    int columnValue = 0;
    switch(alpha){
      case 'А': case 'а': columnValue = 0; break;
      case 'Б': case 'б': columnValue = 1; break;
      case 'В': case 'в': columnValue = 2; break;
      case 'Г': case 'г': columnValue = 3; break;
      case 'Д': case 'д': columnValue = 4; break;
      case 'Е': case 'е': columnValue = 5; break;
      case 'Ж': case 'ж': columnValue = 6; break;
      case 'З': case 'з': columnValue = 7; break;
      case 'И': case 'и': columnValue = 8; break;
      case 'К': case 'к': columnValue = 9; break;
    }
    return columnValue;
  }
}
