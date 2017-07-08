class Board{
  public String[][] board;
  public  int row=10, col=10;
  public Fleet fleet1;
  public Fleet fleet2;
  public Fleet fleet3;
  public Fleet fleet4;


  //construct a board
  public Board(){
    this.board = new String[row][col];
    for(int r=0; r<row;r++){
      for(int c=0; c<col;c++){
        this.board[r][c] = "N ";
      }
    }
  }

  /** Print out a board
    @param b - the board to print.
  */
  public void printBoard(){
    for(int r=0; r<row; r++){
      System.out.print(r+" ");
      for(int c=0; c< col;c++){
        System.out.print(this.board[r][c]);
      }
      System.out.println();
    }
    System.out.println("  0 1 2 3 4 5 6 7 8 9\n");
  }

  /** Create fleets.
  */
  // public static void makeNavy(Board b){
  //   b.fleet1 = new Fleet(4);
  //   b.fleet1.makeShips(b.fleet1);
  //   b.fleet2 = new Fleet(3);
  //   b.fleet2.makeShips(b.fleet2);
  //   b.fleet3 = new Fleet(2);
  //   b.fleet3.makeShips(b.fleet3);
  //   b.fleet4 = new Fleet(1);
  //   b.fleet4.makeShips(b.fleet4);
  // }

  // public static void main(String[] args){
  //   Board battleship = new Board();
  //   printBoard(battleship);
  //
  // }
}
