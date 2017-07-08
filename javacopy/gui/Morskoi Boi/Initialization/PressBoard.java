import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PressBoard extends Frame implements MouseListener{
  Color bkg = new Color(71,93,132);
  Label l;
  public PressBoard(){
    l = new Label();
    l.setBounds(20,20,100,20);
    add(l);

    addMouseListener(this);

    setSize(400,400);
    setLayout(null);
    setBackground(bkg);
    setVisible(true);
  }
  public void mouseClicked(MouseEvent e){
    l.setText("Mouse Clicked");
  }
  public void mousePressed(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.BLACK);
    g.fillRect(e.getX()-15, e.getY()-15, 30,30);
  }
  public void mouseEntered(MouseEvent e) {
      l.setText("Mouse Entered");
  }
  public void mouseExited(MouseEvent e) {
      l.setText("Mouse Exited");
  }
  public void mouseReleased(MouseEvent e) {
      l.setText("Mouse Released");
  }
  public static void main(String[] args){
    new PressBoard();
  }
}
