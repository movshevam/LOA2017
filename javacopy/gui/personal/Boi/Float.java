import java.util.Scanner;
class Float{
  public Scanner input = new Scanner(System.in);
  public Division[] fleet;
  public int size;
  public int divSize;
  public String divID;
  public String state;

  public Float(int size){
    fleet = new Division[size];
    this.size = size;
  }
  //sets size of division
  public void setDivSize(){
    if(size == 1) divSize = 4;
    if(size == 2) divSize = 3;
    if(size == 3) divSize = 2;
    if(size == 4) divSize = 1;
  }
  //sets Division ID
  public void setDivId(){
    divID = size + "" divSize;
  }

  public String checkStatus(){
    int count = 0;
    String s = "";
    for(int i=0; i<size; i++){
      s += fleet[i].checkStatus()+" ";
    }
    if(s.indexOf("ok") >= 0){
      state = "ok";
      return state;
    }
    return s;
  }

  //checks if Float is full
  public boolean isFull(){
    for(int i=0; i< size; i++){
      if(fleet[i] == null){
        return false;
      }
    }
    return true;
  }

  //fill float with divisions
  public void fillFloat(){
    for(int i=0; i<size; i++){
      addDiv(new Division(divSize, divID)));
    }
    System.out.println("Float filled with divisions");
  }
  //add division
  public void addDiv(Division a){
    if(isFull()) return;
    else{
      if(a.size == divID){
        for(int i=0; i< size;i++){
          if(fleet[i] == null){
            fleet[i] = a;
            break;
          }
        }
      }
    }
  }

}
