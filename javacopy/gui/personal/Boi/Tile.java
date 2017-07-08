class Tile{
  public int x, y;
  public String status = "free";

  public  Tile(int x, int y){
    this.x = x;
    this.y = y;
  }
  public isHit(){
    if(status.equalsTo("free")== false){
      // Ship.isHit(x,y);
    }
    else{
      this.status = "miss";
    }
  }
}
