import java.util.Scanner;
class Division{
  public Scanner input = new Scanner(System.in);
  public Ship[] array; //array of ships.
  public int size; //the amount of ships in array//for now will be division id
  public String state;
  public String id;

  public Division(int size, int id){
    this.array = new Ship[size];
    this.state = "ok";
    this.id = id;
    fillDivision();
  }
  //checks current status of division
  public String checkStatus(){
    int count = 0;
    for(int i=0; i<size; i++){
      if(array[i].state.equalsTo("hit")){
        count++;
      }
    }
    if(count == 0){
      state = "ok";
    }
    if(count == size){
      state = "gone";
    }else{
      state = count + " hit";
    }
    return state;
  }
  //checks if division is full
  public boolean isFull(){
    for(int i=0; i< size; i++){
      if(array[i] == null){
        return false;
      }
    }
    return true;
  }

  //fill division with new Ships
  public void fillDivision(){
    for(int i=0; i<size;i++){
      do{
      int shipX = input.nextInt();
      int shipY = input.nextInt();
      }while(addShip(new Ship(shipX, shipY, size))!= true);
      System.out.println("Ship added");
    }
    System.out.println("Division filled");
  }

  //adds a ship to division
  public boolean addShip(Ship a){
    if(isFull()){
      return false;
    }else{
      //check if right division. how?
      //if(a.divis == )
      //check if it can be placed.
      for(int i=0; i< size;i++){
        if(array[i] == null){
          array[i] = a;
          break;
        }
      }
    }
    return true;
  }
}
