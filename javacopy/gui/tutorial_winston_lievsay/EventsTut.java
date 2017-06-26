import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventsTut extends JFrame{
  private JLabel label;
  private JButton button;

  public EventsTut(){
    setLayout(new FlowLayout());

    button = new JButton("Click for text");
    add(button);
    label = new JLabel("");
    add(label);

    Event e = new Event();
    button.addActionListener(e); //listns for soemthing to be done
  }

  public class Event implements ActionListener {
    public void actionPerformed(ActionEvent e){
      label.setText("Now you can see this text!");
    }
  }

  public static void main(String[] args){
    EventsTut gui = new EventsTut();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setTitle("Events program");
    gui.setSize(300,100);
    gui.setVisible(true);
  }
}
