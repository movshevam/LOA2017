import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventsTut extends JFrame{
  private JLabel label;
  private JLabel label2;
  private JButton button;
  private JButton button2;
  private int x =0, y = 0; // 2 integers, initialize to zero

  public EventsTut(){
    setLayout(new FlowLayout());

    button = new JButton("Click for text");
    add(button);
    label = new JLabel("");
    add(label);

    button2 = new JButton("Click for more text");
    add(button2);
    label2 = new JLabel("");
    add(label2);

    Event e = new Event(); //declared new class,a dded button listener
    button.addActionListener(e); //listns for soemthing to be done

    Event2 ev = new Event2(); //if this is class Event, when you click a button, both changes will show up simultaneously
    button2.addActionListener(ev);
  }

  public class Event implements ActionListener {
    public void actionPerformed(ActionEvent e){
      if( x == 0){
        label.setText("Now you can see this text!");
        x = 1;
      }else if( x == 1){
        label.setText("");
        x = 0;
      }
    }
  }

  public class Event2 implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      if(y == 0){
        label2.setText("this is label 2s text");
        y = 1;
      }else if(y == 1){
        label2.setText("");
        y = 0;       
      }
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
