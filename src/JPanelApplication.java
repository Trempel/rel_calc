import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApplication extends JPanel{
    JTextField inp = null;
    int res = 0;
    int res1 = 0;
    String op = "";

    public JPanelApplication ()
    {
        setLayout(null);
        final TextField txt1 = new TextField();
        txt1.setBounds(10,10,250,25);

        JButton b0 = new JButton("0");
        b0.setBounds(10,260,75,40);

        JButton b1 = new JButton("1");
        b1.setBounds(10,180,50,40);

        JButton b2 = new JButton("2");
        b2.setBounds(50,180,50,40);

        JButton b3 = new JButton("3");
        b3.setBounds(100,180,50,40);

        JButton b4 = new JButton("4");
        b4.setBounds(10,100,50,40);

        JButton b5 = new JButton("5");
        b5.setBounds(50,100,50,40);

        JButton b6 = new JButton("6");
        b6.setBounds(100,100,50,40);

        JButton b7 = new JButton("7");
        b7.setBounds(10,30,50,40);

        JButton b8 = new JButton("8");
        b8.setBounds(50,30,50,40);

        JButton b9 = new JButton("9");
        b9.setBounds(100,30,50,40);

        JButton bRes = new JButton("=");
        bRes.setBounds(75,260,65,40);
        Font bFont = new Font("serif", Font.BOLD,22);
        bRes.setFont(bFont);

        JButton bPlus = new JButton("+");
        bPlus.setBounds(160,30,60,40);
        bPlus.setFont(bFont);

        JButton bMinus = new JButton("-");
        bMinus.setBounds(160,100,60,40);
        bMinus.setFont(bFont);

        JButton bMult = new JButton("*");
        bMult.setBounds(160,180,60,40);
        bMult.setFont(bFont);

        JButton bDiv = new JButton("/");
        bDiv.setBounds(160,2600,60,40);
        bDiv.setFont(bFont);

        add(txt1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bRes);
        add(bPlus);
        add(bMinus);
        add(bMult);
        add(bDiv);
try {
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 1);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 2);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 3);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });
    b4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 4);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 5);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 6);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 7);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 8);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 9);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    b0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            txt1.setText(txt1.getText() + 0);
            if (res == 0) {
                res = Integer.valueOf(txt1.getText());
            } else {
                res1 = Integer.valueOf(txt1.getText());
            }
        }
    });

    bPlus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            res = Integer.valueOf(txt1.getText());
            txt1.setText("");
            op = "+";
        }
    });

    bMinus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            res = Integer.valueOf(txt1.getText());
            txt1.setText("");
            op = "-";
        }
    });

    bDiv.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            res = Integer.valueOf(txt1.getText());
            txt1.setText("");
            op = "/";
        }
    });

    bMult.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg1) {
            res = Integer.valueOf(txt1.getText());
            txt1.setText("");
            op = "*";
        }
    });

    bRes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int num = Integer.valueOf(res);
            int num1 = Integer.valueOf(res1);
            String strOp = op;

            CalcMethod mc = new CalcMethod();
            String strRes = String.valueOf(mc.calc(num, strOp, num1));
            txt1.setText(strRes);
        }
    });
}
        catch (ArithmeticException e)
        {
         //TODO
        }
    }
}
