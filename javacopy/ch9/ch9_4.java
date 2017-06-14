import java.awt.Point;
class ch9_4{
  public static void main(String[] args) {
    Point blank;
    blank = new Point(3,4);
    //printPoint(blank);
    // System.out.println(blank);
    Point hen = new Point(1,2);
    System.out.println("Values of points before:\n" + blank + "\n" + hen);
    System.out.println("\n"+changePoint(blank, hen)+"\n");
    System.out.println("Values of points after:\n" + blank + "\n" + hen);
    Point LOL = new Point(0,0);
    LOL = null;
    System.out.println(LOL);
    System.gc(); //
  }
  public static void printPoint(Point p){
    System.out.println("(" + p.x + ", " + p.y + ")");
  }
  public static Point changePoint(Point p, Point d){
    p = new Point(5,6);
    d = new Point(7,8);
    return p;

  }
}
