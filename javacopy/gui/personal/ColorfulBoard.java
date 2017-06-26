import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorfulBoard extends Canvas{
  static Color orange = new Color(220,123,71);
  static int height = 500;
  static int width = 500;
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Canvas canvas = new ColorfulBoard();
    canvas.setSize(height,width);
    canvas.setBackground(orange);

    frame.getContentPane().add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
  public void paint(Graphics g){
    Color temp;
    g.setColor(Color.black);
    g.drawRect( 0 , 0 , height , width);
    g.drawRect( 49 , 49 , height-98, width-98);
    g.drawRect( 50, 50, height-100, width-100);
    //new height = 400, width = 400
    int x = 50;
    //----- top row
    //int r = row
    //int c = column
    for (int r=1;r <=8 ;r++ ) {
      for(int c=1; c <=8;c++){
        temp = new Color((r-1)*31,(9-c)*31, 115);
        g.setColor(temp);
        g.fillRect(r*50, c*50, x, x);
      }
    }
    //white Chess board:
    g.setColor(Color.white);
    // for(int j=50; j <=350; j+=100){
    //   for(int i=50; i<= 350; i+=100){
    //     g.fillRect( i , j, 50 , 50);
    //   }
    // }
    // for(int j=100; j <=450; j+=100){
    //   for(int i=100; i<= 450; i+=100){
    //     g.fillRect( i , j, 50 , 50);
    //   }
    // }
    // //colorful chess board:
    for(int j=50; j <=400; j+=100){
      for(int i=100; i<=400; i+=100){
        g.fillRect( i , j, 50 , 50);
      }
    }
    for(int j=100; j <=400; j+=100){
      for(int i=50; i<= 350; i+=100){
        g.fillRect( i , j, 50 , 50);
      }
    }


  }
}
