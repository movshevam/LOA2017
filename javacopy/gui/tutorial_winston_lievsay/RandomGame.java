import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomGame extends JFrame{
  int randomNum, guess;
  private JButton button;
  private JTextField textfield;
  private JLabel promptlabel;
  private JLabel resultlabel;
  private JLabel randomlabel;

  //constructor
  public RandomGame(){
    setLayout(new FlowLayout());

    promptlabel = new JLabel("Enter a random number 1-10");
    add(promptlabel);

    textfield = new JTextField(5);
    add(textfield);

    button = new JButton("Guess!");
    add(button);

    resultlabel = new JLabel("");
    add(resultlabel);

    randomlabel = new JLabel("");
    add(randomlabel);

    event e = new event();
    button.addActionListener(e);
  }

  //
  public class event implements ActionListener {
    public void actionPerformed (ActionEvent e){
      randomNum = (int) (Math.random() * 10 + 1);
      try{
          guess = (int) (Double.parseDouble(textfield.getText()));

          if(guess == randomNum){
            resultlabel.setText("You won the game!");
          }else if(guess != randomNum){
            resultlabel.setText("You lost the game!");
          }
          randomlabel.setText("The random number generated was " + randomNum);
      } catch(Exception ex){
        randomlabel.setText("Please enter numbers only");
      }

    }
  }


  public static void main(String[] args){
    RandomGame gui = new RandomGame();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.setSize(300,150);
    gui.setTitle("Random number generator game.");
  }
}
