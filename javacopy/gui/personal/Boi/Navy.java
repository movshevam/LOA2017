class Navy{
  public Float[] fleets;
  public String state;

  public Navy(){
    this.fleets = new Float[4];
    fleets[0] = new Float(1);
    fleets[1] = new Float(2);
    fleets[2] = new Float(3);
    fleets[3] = new Float(4);
  }

  public void fillNavy(){
    for(int i=0; i<4; i++){
      fleets[i].fillFloat();
    }
  }
  public void checkStatus(){
    for(int i=0; i<4; i++){
      if(fleets[i].equalsTo("ok")){
        state = "ok";
      }
    }
  }
}
