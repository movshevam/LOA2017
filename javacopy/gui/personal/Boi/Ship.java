class Ship extends Tile{
  public int x, y;
  public String state;
  public int divis; //division #

  public Ship(int x, int y, int divis){
    super(x,y);
    this.state = "ok";
    this.divis = divis;
  }
  public void isHit(int x, int y){
    state = "hit";
  }
  public String checkStatus(){
    return state;
  }
}
