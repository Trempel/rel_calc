import javax.swing.JFrame;
public class JFrameApplication extends JFrame
{
    public JFrameApplication()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelApplication());
        setVisible(true);
    }
}