import javax.swing.*;

public class JFrameApplication extends JFrame {
    public JFrameApplication()
    {
        setBounds(100,100,300,450);
        setTitle("Calc for demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanelApplication panel = new JPanelApplication();
        setVisible(true);
    }
}
