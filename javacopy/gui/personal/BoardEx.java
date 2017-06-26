public class BoardEx extends JPanel{
  public static void main(String[] args) {
    JFrame window = new JFrame("VIP");
    BoardEx content = new BoardEx();
    window.setContentPane(content);
    window.setSize(400,400);
    window.setLocation(100,100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    content.requestFocusInWindow();
  }
  //--------------------------- end main
  private class Listener implements KeyListener, FocusListener{
    public void focusGained(FocusEvent evt){
      repaint();
    }
    public void focusLost(FocusEvent evt) {
      repaint();
    }
    public void keyTyped(KeyEvent evt){
      char ch = evt.getKeyChar();

    }
  }
  //-------------------------- end listener
  //Private instance variables:
  //size, color, location
  Color orange = new Color(220,123,71);


  //------------------------ end instance variable declaration
  public BoardEx(){

    setBackground(orange);
    Listener listener = new Listener();
    addKeyListener(listener);
    addFocusListener(listener);

  }
  //------------------------- end constructor
  public void paintComponent(Graphics g){
    super.paintComponent(g);


  }
} //end BoardEx
