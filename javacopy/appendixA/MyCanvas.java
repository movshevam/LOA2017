import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
class MyCanvas extends Canvas{
  public static void main(String[] args) {
    //make the frame
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //add the Canvas
    Canvas canvas = new MyCanvas();
    canvas.setSize(400,400);
    canvas.setBackground(Color.magenta);
    frame.getContentPane().add(canvas);

    //show the frame
    frame.pack();
    frame.setVisible(true);
  }
  public void paint(Graphics g){
    // draw a circle
    g.setColor(Color.red);
    g.fillOval(100,50,200,300);
    g.setColor(Color.yellow);
    g.fillOval(100,100,200,200);
  }
}
