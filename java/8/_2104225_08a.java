import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*; 
import java.util.Random;

public class _2104225_08a extends JFrame implements ActionListener{
    int count=0;
    JLabel l1,l2;
    JButton b1,b2,b3;
    JFrame frame;
    public _2104225_08a (String title)
    {
        setTitle(title);
        frame=new JFrame("Test_FRAMEW2");
        b1=new JButton("PINK");
        b1.setBackground(Color.PINK);
        b2=new JButton("GREEN");
        b2.setBackground(Color.GREEN);
        b3=new JButton("BLUE");
        b3.setBackground(Color.BLUE);
        l1=new JLabel("Click:");
        l2=new JLabel("");
        frame.add(l1);
        frame.add(b3);
        frame.add(b2);
        frame.add(b1);
        frame.add(l2);
        frame.setSize(400,150);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent evt )
    {
        String c;
        String[] s={"PINK","GREEN","BLUE"};
        Random rand= new Random();
        String col=s[rand.nextInt(3)];
        if(evt.getActionCommand().equals(col))
        {
            if(col=="BLUE")
            {
            frame.getContentPane().setBackground(Color.BLUE);
            }
            else if(col=="PINK")
            {
            frame.getContentPane().setBackground(Color.PINK);
            }
            else   
            {
                frame.getContentPane().setBackground(Color.GREEN);
            }
            c= Integer.toString(count=count+3);
            l1.setText("Correct Choice");
        }
        else
        {
            frame.getContentPane().setBackground(Color.RED);
            l1.setText("Wrong Try Again");
            c=Integer.toString(count);
        }
        l2.setText("POINT "+c);
        repaint();
    }
    public static void main(String[] args)
    {
        _2104225_08a f =new _2104225_08a ("MY FRAME");
    }
}