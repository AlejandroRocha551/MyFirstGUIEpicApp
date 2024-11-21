import javax.swing.*;

public class Form1 extends JFrame
{

    private JPanel MainPanel;

    //constructor
    public Form1()
    {
        setContentPane(MainPanel);
        setTitle("hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 500);
        setLocation(150,300);
        setVisible(true);
    }
}
