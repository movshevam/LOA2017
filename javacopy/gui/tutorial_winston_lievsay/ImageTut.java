import java.awt.*;
import javax.swing.*;
public class ImageTut extends JFrame{
  private ImageIcon image1;
  private JLabel label1;
  private ImageIcon image2;
  private JLabel label2;

  ImageTut(){
    setLayout(new FlowLayout());

    image1 = new ImageIcon(getClass().getResource("bird.jpeg"));
    label1 = new JLabel(image1);
    add(label1);

    image2 = new ImageIcon(getClass().getResource("butterfly.jpeg"));
    label2 = new JLabel(image2);
    add(label2);
  }
  public static void main(String[] args){
    ImageTut gui = new ImageTut();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    //gui.setSize(400,400); //usually
    gui.pack(); //packs/shrinks window to fit only the images
    gui.setTitle("Pictures");
  }
}
