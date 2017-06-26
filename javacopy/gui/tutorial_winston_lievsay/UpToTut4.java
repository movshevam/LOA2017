import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UpToTut4 extends JFrame{
  //instance variabkes
  private ImageIcon img1;
  private ImageIcon img2;
  private JLabel label1;
  private JLabel label2;
  private JButton button;
  private JTextField text;

  //constructor
  public UpToTut4(){
    setLayout(new FlowLayout());

    img1 = new ImageIcon(getClass().getResource("bird.jpeg"));
    label1 = new JLabel(img1);
    add(label1);

    // // this is impossible:
    // img2 = new ImageIcon(getClass().getResource("bird.jpeg"));
    // add(img2);

    label2 = new JLabel("There should be only one image.");
    add(label2);

    text = new JTextField(10);
    add(text);

    button = new JButton("Click me");
    add(button);

    Event e = new Event();
    button.addActionListener(e);

  }
  //nested classes if any
  public class Event implements ActionListener {
    public void actionPerformed(ActionEvent e){
      text.setText("Hi!");
    }
  }

  //methods
  public static void main(String[] args){
    UpToTut4 gui = new UpToTut4();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setTitle("Contents of tut1-4");
    gui.pack();
    gui.setVisible(true);
  }
}
