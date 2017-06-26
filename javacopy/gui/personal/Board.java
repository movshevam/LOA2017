import java.awt.GridLayout;
import java.awt.FontMetrics;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
class Board extends Canvas{
  static Color orange = new Color(220,123,71);
  static int height = 500;
  static int width = 500;
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Canvas canvas = new Board();
    canvas.setSize(height,width);
    canvas.setBackground(orange);
    frame.add(new BoardLabel());
    frame.getContentPane().add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
  public void paint(Graphics g){
    g.setColor(Color.black);
    g.drawRect( 0 , 0 , height , width);
    g.drawRect( 49 , 49 , height-98, width-98);
    g.drawRect( 50, 50, height-100, width-100);
    //new height = 400, width = 400
    for(int j=50; j <=350; j+=100){
      for(int i=50; i<= 350; i+=100){
        g.fillRect( i , j, 50 , 50);
      }
    }
    for(int j=100; j <=450; j+=100){
      for(int i=100; i<= 450; i+=100){
        g.fillRect( i , j, 50 , 50);
      }
    }

  }
}
class BoardLabel extends JPanel{
  public BoardLabel(){
    super(new GridLayout(10,10));
    JLabel alphalabel;
    alphalabel = new JLabel("A");
    alphalabel.setHorizontalTextPosition(JLabel.CENTER);
    add(alphalabel);
  }
}
