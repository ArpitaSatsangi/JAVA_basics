import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.Random;
import java.util.function.ToDoubleFunction;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class _2104225_08b extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b;
    JTextField tf1, tf2;
    JFrame frame;

    public _2104225_08b(String title) {
        setTitle(title);
        frame = new JFrame("Frame");
        b = new JButton("Convert");
        l1 = new JLabel("Enter Temperature in Celcius: ");
        l2 = new JLabel("Temperature in Fahrenheit: ");
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf2.setEditable(false);
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(b);
        frame.setSize(700, 75);
        b.addActionListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent evt) {
        double f = 0;
        if (evt.getActionCommand().equals("Convert")) {
            double c = Double.parseDouble(tf1.getText());

            f = (c * (9.0 / 5.0)) + 32.0;

        }
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        tf2.setText(df.format(f));
        repaint();
    }

    public static void main(String[] args) {
        _2104225_08b f = new _2104225_08b("MY FRAME");
    }
}
