import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame
{
    private JPanel MainPanel;
    private JButton button1Button;
    private JButton button2Button;
    private JButton button3Button;
    private JButton button4Button;
    private JButton exitButton;

    //constructor
  public MenuForm()
  {
        setContentPane(MainPanel);
        setTitle("hello");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (300,500);
        setLocationRelativeTo (null);
        setVisible (true);

      exitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              System.exit (0); //close app
          }


      });
      button1Button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e)
          {
           new Form1();
            //JOptionPane.showMessageDialog(null,"You chose button 1");
          }


      });
      button2Button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              new Form2();
              //JOptionPane.showMessageDialog(null,"You chose button 2");
          }


      });
      button3Button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              new Form3();
              //JOptionPane.showMessageDialog(null,"You chose button 3");
          }


      });
      button4Button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              new Form4();
              // JOptionPane.showMessageDialog(null,"You chose button 4");
          }
      });
  }
    public static void main(String[]args)
    {
    new MenuForm();
    }
}