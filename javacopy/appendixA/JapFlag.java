import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
class JapFlag extends Canvas{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new JapFlag();
    canvas.setSize(600,400);
    canvas.setBackground(Color.white);
    frame.getContentPane().add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
  public void paint(Graphics g){
    g.setColor(Color.red);
    g.fillOval(200,100,200,200);
  }
}
