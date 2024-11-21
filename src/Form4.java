import javax.swing.*;

public class Form4 extends JFrame
{

    private JPanel MainPanel;

    //constructor
    public Form4()
    {
        setContentPane(MainPanel);
        setTitle("hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 500);
        setLocation(-300,-500);
        setVisible(true);
    }
}