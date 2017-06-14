import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
class Mickey extends Canvas{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Canvas canvas = new Mickey();
      canvas.setSize(400,400);
      Color darkgreen = new Color(55,128,113 );
      canvas.setBackground(darkgreen);
      frame.getContentPane().add(canvas);

      frame.pack();
      frame.setVisible(true);
  }
  public void paint(Graphics g){

    g.fillOval(100,100,200,200);
    g.setColor(Color.white);
    g.drawRect(0,0,400,400);
    g.drawRect(50,50,300,300);
    g.drawRect(100,100,200,200);
    g.drawRect(150,150,100,100);
    Color light = new Color(238,211,212);
    g.setColor(light);
    ears(g, 100, 200); //first ears
    // g.setColor(Color.red);
    //ears(g, 50, 100); //second ears
    //miniCircles(g, 150, 100, 100);
    // g.setColor(light);
    //ears(g, 25, 50);
    // g.setColor(Color.red);
    //ears(g, 12, 25);
  }
  /*
    (x,y) = java coordinates of parent circle
    int d = diameter of circle
  */
  public void miniCircles(Graphics g, int x, int y, int d){
    g.setColor(Color.red);
    g.fillOval(x/2, y/2, d/2, d/2);
    g.fillOval(5*(x/2), y/2, d/2, d/2);
  }
  /*
    int n = original x and y value for coordinate of a centralized circle
    int d = diameter of circle
  */
  public void ears(Graphics g, int n, int d){
    int i = n/2;
    int j = (2*n) + (n/2);
    g.fillOval(i , i , d/2 , d/2);
    g.fillOval(j , i , d/2 , d/2);
    // g.fillOval(j , j , d/2 , d/2);
    // g.fillOval(i , j , d/2 , d/2);
    // g.fillOval(n,5*n,100,100);
    // g.fillOval(5*n,5*n,100,100);
  }
}
