import javax.swing.JFrame;
//tut1 can use methods from JFrame.
public class Tut1 extends JFrame{
  public static void main(String[] args) {
    Tut1 gui = new Tut1();
    //how to terminate window(hit close)
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(200,200);
    gui.setVisible(true);
    gui.setTitle("First GUI");
  }
}
