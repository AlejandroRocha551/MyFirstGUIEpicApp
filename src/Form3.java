import javax.swing.*;

public class Form3 extends JFrame
{

    private JPanel MainPanel;

    //constructor
    public Form3()
    {
        setContentPane(MainPanel);
        setTitle("hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 500);
        setLocation(500,450);
        setVisible(true);
    }
}
