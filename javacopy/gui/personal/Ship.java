class Ship{
  public Coordinate start, end;
  public int shipSize;
  public String state;
  public static String[] statuses = {"OK","HIT","GONE","N/A"};
  private static Coordinate[] ShipCoordinates, closeWaters;

  public Ship(Coordinate start, Coordinate end, int shipSize, int statusNum){
    this.start = start;
    this.end = end;
    this.shipSize = shipSize;
    this.state = statuses[statusNum];
    setShipCoordinates();
    // setCloseWaters();
  }

  //METHODS:
  public void setShipCoordinates(){
    this.ShipCoordinates[0] = this.start;
    this.ShipCoordinates[this.shipSize-1] = this.end;
    //If ship is horizontal
    if(this.start.y == this.end.y){
      for(int i=1; i<this.shipSize-1; i++){
        this.ShipCoordinates[i] = new Coordinate(this.start.x+1, this.start.y);
      }
    }
    //if ship is vertical
    if(this.start.x == this.end.x){
      for(int i=1; i<this.shipSize-1;i++){
        this.ShipCoordinates[i] = new Coordinate(this.start.x, this.start.y+1);
      }
    }
  }
  // public void setCloseWaters(){
  //   closeWaters = new Coordinate[13];
  //   //vertical:
  //   if(this.start.x == this.end.x){
  //     // for(int i=0;i<this.shipSize+2;i++){
  //     //   closeWaters[i]=new Coordinate(this.start.x-1, this.start.y-1+i);
  //     // }
  //     // closeWaters[this.shipSize+2] = new Coordinate(this.start.x, this.start.y-1);
  //     // closeWaters[this.shipSize+3] = new Coordinate(this.start.x, this.start.y-1+this.shipSize+1);
  //     // for(int i=0; i <this.shipSize+2; i++){
  //     //   closeWaters[this.shipSize+4+i] = new Coordinate(this.start.x-1, this.start.y-1+i);
  //     // }
  //   }
  //   //horizontal:
  //   if(this.start.y == this.end.y){
  //
  //   }
  // }
  public static void printShip(Ship s){

    System.out.println("Ship of size"+s.shipSize+" located at coordinates");
    for(int i=0; i<s.ShipCoordinates.length; i++){
      System.out.print(ShipCoordinates[i].toString()+" ");
    }
    System.out.println("Ship status: "+s. state);
  }
  public static void main(String[] args){
    System.out.println("Ship class");
    Coordinate x = new Coordinate(1 , 8);
    Coordinate y = new Coordinate(4, 8);
    Ship poop = new Ship(x,y, 4, 0);
    printShip(poop);
  }
}

class Coordinate{
  public int x;
  public int y;
  public Coordinate(int col, int row){
    this.x = col;
    this.y = row;
  }
  public String toString(){
    return "("+this.x+", "+this.y+")";
  }
}
