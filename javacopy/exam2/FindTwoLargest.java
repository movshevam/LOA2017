import java.util.Scanner;
class FindTwoLargest{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This program finds the two largest integers in a list."
      +" Enter values, one per line, using a 0 to signal the end of the list.");
    int length = 20;
    int[] list = new int[length];
    list[0]=input.nextInt();
    list[1]=input.nextInt();
    int i=1;
    do{
      i++;
      list[i]=input.nextInt();
    }while(list[i] != 0); //checks whether input was zero.
  }
  // public static int[] addInput(Scanner input, int[] list){
  //   int[] newlist = new int[list.length*2];
  //   for(int i=0; i < list.length;i++){
  //     newlist[i] = list[i];
  //   }
  //   for(int i=list.length; i<newlist.length;i++){
  //     newlist[i] = input.nextInt();
  //   }
  // }
}
