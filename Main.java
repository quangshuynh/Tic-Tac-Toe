import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

//  All of our allocation of memory will go here
  ImageIcon x, o, blank;
  GridLayout grid, winGrid;
  JButton one, two, three, four, five, six, seven, eight, nine;
//   javax.swing.Timer timer;// = new Timer(3000, new ActionListener()
    public Main() {
      super("TicTacToe");
      setSize(600,600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container pane = getContentPane();
      x = new ImageIcon("x.png");
      o = new ImageIcon("o.png");
      blank = new ImageIcon("blank.png");
      one = new JButton(blank);
      two = new JButton(blank);
      three = new JButton(blank);
      four = new JButton(blank);
      five = new JButton(blank);
      six = new JButton(blank);
      seven = new JButton(blank);
      eight = new JButton(blank);
      nine = new JButton(blank);
      
      // addActionListener
      one.addActionListener(this);
      two.addActionListener(this);
      three.addActionListener(this);
      four.addActionListener(this);
      five.addActionListener(this);
      six.addActionListener(this);
      seven.addActionListener(this);
      eight.addActionListener(this);
      nine.addActionListener(this);

      // pane
      pane.add(one);
      pane.add(two);
      pane.add(three);
      pane.add(four);
      pane.add(five);
      pane.add(six);
      pane.add(seven);
      pane.add(eight);
      pane.add(nine);

      // command equals
      if(command.equals("one")) {
        one.setIcon(x);
      }
      if(command.equals("two")) {
        one.setIcon(x);
      }
      if(command.equals("three")) {
        one.setIcon(x);
      }
      if(command.equals("four")) {
        one.setIcon(x);
      }
      if(command.equals("five")) {
        one.setIcon(x);
      }
      if(command.equals("six")) {
        one.setIcon(x);
      }
      if(command.equals("seven")) {
        one.setIcon(x);
      }
      if(command.equals("eight")) {
        one.setIcon(x);
      }
      if(command.equals("nine")) {
        one.setIcon(x);
      }
      
      // timer = new Timer(3000, new ActionListener(this));
      grid = new GridLayout(3,3,5,5);
      winGrid = new GridLayout(4,1);
      pane.setLayout(grid);

      setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
      // code for actions
      String command = e.getActionCommand();
    }

public static void main(String[]args) {
  Main example = new Main();
}

}

