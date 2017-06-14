import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
class Minnie extends Canvas{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Canvas canvas = new Minnie();
      canvas.setSize(600,400);
      Color darkgreen = new Color(55,128,113 );
      canvas.setBackground(darkgreen);
      frame.getContentPane().add(canvas);

      frame.pack();
      frame.setVisible(true);
  }
  // public void another(Graphics g){
  //
  //   // РАЗМЕР 400х400 пикселей!
  //   //потом 2 шарика:
  //
  //   g.fillOval(100,100,200,200);
  //   g.setColor(Color.white);
  //   g.drawRect(0,0,400,400);
  //   g.drawRect(50,50,300,300);
  //   g.drawRect(100,100,200,200);
  //   g.drawRect(150,150,100,100);
  //   Color light = new Color(238,211,212);
  //   g.setColor(light);
  //
  //   int row = 0;
  //   int d = 200;
  //   int A = d/2;
  //   int cnum; int x; int y;
  //   while( row < 4){
  //     int i=0;
  //     cnum = (int) Math.pow(2, (double) row);
  //     d = d/cnum;
  //     while(i<cnum){
  //       x = A/cnum + 4*i*A/cnum;
  //       y = A/cnum;
  //       g.fillOval(x,y,d,d);
  //       i++;
  //     }
  //     row++;
  //   }
  // }
  public void paint(Graphics g){
    int i =0;
    g.setColor(Color.white);
    // g.drawRect(0,0,400,400);
    // g.drawRect(50,50,300,300);
    // g.drawRect(100,100,200,200);
    // g.drawRect(150,150,100,100);
    Color light = new Color(238,211,212);
    // g.setColor(light);
    int d = 256 ; //diameter of big circle
    int x = 150;
    int y = 250;
    g.setColor(Color.black);
    int row = 0;
    int start  = 0;
    int coeff = start;
    int cnum = (int) Math.pow(2, (double) row);

    g.fillOval(x + coeff* d/2, y + start*d/2,d,d); //row 0 : main circle
    i = 0;
    row++;
    do{
      d /= 2; //with each row, diameter gets twice smaller.
      start = start*2 - 1; //then -4 with each row
      coeff = start; // then plus 4 with each circle
      cnum = (int) Math.pow(2,(double)row); //# of circles
      i = 0;
      while( i < cnum){
        g.fillOval( x + coeff*d/2, y + start*d/2 ,d,d); //upper rows
        coeff+=4;
        i++;
      }
      row++; //row number
    }while( d > 3);







  }

}
