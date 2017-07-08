//Fleet of size n,
//Board will have an array of Fleet:
//Fleet fleet = {{fleet size 4},{fleet size 3},
//{fleet size 2},{fleet size 1}};
class Fleet{ //флот
  public  int size;
  public  String[] ships; //will be Ship[] ships

  //construct a fleet of given size
  public Fleet(int size){
    this.size = size;
    this.ships = new String[size];
  }

  /** Make Ships
  */
  // public static void makeShips(Fleet f){
  //   for(int i=0; i<f.size; i++){
  //     f.ships[i] = ""+f.size;
  //   }
  // }

  // public static void main (String[] args){
  //   Fleet f = new Fleet(4);
  // }

}
