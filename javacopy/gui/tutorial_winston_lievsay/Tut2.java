import javax.swing.*; //tut2 can use methods from swing classes
import java.awt.*;

public class Tut2 extends JFrame{
  //instance variables
  private JLabel label;
  private JButton button;
  private JTextField textfield;

  //constructor for class
  public Tut2(){
    setLayout(new FlowLayout()); //layout to how put stuff on screen

    label = new JLabel("I am a label");
    add(label);

    textfield = new JTextField(15); //size or you can put stirng into it when it loads
    add(textfield);

    button = new JButton("Click me!");
    add(button);
  }
  //methods
  public static void main(String[] args) {
    Tut2 gui = new Tut2();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(200,125);
    gui.setVisible(true);
  }
}
