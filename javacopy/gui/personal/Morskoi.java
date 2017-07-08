import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Morskoi extends JFrame{
  private JLabel title;
  private JButton start;
  private JLabel description;
  private int gameOn = 0;
  //---
  private JButton myButton;
  private JLabel myDesc;
  private JLabel[] myBoard;
  private int viewMine = 0;
  //---
  public Morskoi(){
    setLayout(new FlowLayout());
    //introduction
    title = new JLabel("Morskoi boi");
    add(title);
    start = new JButton("Start");
    add(start);
    description = new JLabel("");
    add(description);
    StartEvent e = new StartEvent();
    start.addActionListener(e);

    //MY BOARD
    myButton = new JButton("View my board");
    myDesc = new JLabel("");
    myBoard = new JLabel[11];
    myBoard[0] = new JLabel("   А Б В Г Д Е Ж З И К");
    for(int i=1; i<11; i++){
      myBoard[i] = new JLabel(i+" |_|_|_|_|_|_|_|_|_|_|");
    }
    ViewMyEvent myView = new ViewMyEvent();
    myButton.addActionListener(myView);


  }
  //start game and exit
  public class StartEvent implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(gameOn == 0){
        //
        add(myButton);
        add(myDesc);
        for(int i=0; i< 11; i++){
          add(myBoard[i]);
        }
        //
        start.setText("Exit");
        description.setText("next step is a work in progress");
        gameOn = 1;
      }
      else if( gameOn == 1){
        myButton.setVisible(false);
        myDesc.setText("");
        start.setText("Start");
        description.setText("");
        gameOn = 0;
      }
    }
  }
  //my button and etc
  public class ViewMyEvent implements ActionListener{
    public void actionPerformed(ActionEvent myView){
      if(viewMine == 0){
        myButton.setText("Hide my board");
        myDesc.setText("Your board should be here");
        viewMine = 1;
      }else if(viewMine == 1){
        myButton.setText("View my board");
        myDesc.setText("");
        for(int i=0; i< 11; i++){
          myBoard[i].setText("");
        }
        viewMine = 0;
      }
    }
  }
  //enemy button and etc.

  public class Board extends JPanel{
    // public static Dimension getPreferredSize(){
    //   return new Dimension(200,200);
    // }
    public Board(){
    }
    protected static void paintComponent(Graphics g){
      g.setColor(Color.BLACK);
      g.fillRect(0,0,200,200);
      g.setColor(Color.WHITE);
      g.fillOval(100,100,30,30);
    }
  }

  public static void main(String[] args){
    Morskoi screen = new Morskoi();
    screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    screen.setTitle("Morskoi boi");
    screen.add(new Board());
    screen.setSize(250,600);
    screen.setVisible(true);
  }
}
