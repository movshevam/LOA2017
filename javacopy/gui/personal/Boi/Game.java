import java.util.Scanner;
class Game{
  private static Board myBoard;
  private static Board enemyBoard;
  private boolean myB = true;
  private boolean enB = true;

  public Game(){
    this.myBoard = new Board();
    this.enemyBoard = new Board();
  }
  //methods
  public static Board getMyBoard(){
    return myBoard;
  }
  public static Board getEnemyBoard(){
    return enemyBoard;
  }

  //print boards
  public static void showEnBoard(){
    System.out.println("EnemyBoard");
    getEnemyBoard().printBoard();
  }
  public static void showMyBoard(){
    System.out.println("MyBoard");
    getMyBoard().printBoard();
  }

  // public static void makeNavy(){ //make all your marines
  //   // myBoard.makeNavy(myBoard);
  // }
  public static void main(String[] args){
    Game game1 = new Game();
    showMyBoard();
    showEnBoard();
    // makeNavy();
    System.out.println("Press M to toggle the display of your board.");
    System.out.println("Press E to toggle the display of your board.");
    System.out.println("Press Q to quit program.");
    Scanner input = new Scanner(System.in);
    char control = 'G';
    do{
      control = input.next().toUpperCase().charAt(0);
      switch control{
        case 'M': showMyBoard(); break;
        case 'E': showEnBoard(); break;
      }
      
    }while(control!='Q');




  }
}
