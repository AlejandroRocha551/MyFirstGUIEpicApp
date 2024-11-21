import javax.swing.*;

public class Form2 extends JFrame
{

    private JPanel MainPanel;

    //constructor
    public Form2()
    {
        setContentPane(MainPanel);
        setTitle("hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 500);
        setLocation(300,400);
        setVisible(true);
    }
}
