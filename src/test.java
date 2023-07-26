import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    JFrame mainF = new JFrame("Frame");

    public void first(){
        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);
        mainF.setVisible(true);
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("label1");
        JButton b1 = new JButton("Button1");

        p1.add(l1);
        p1.add(b1);
        mainF.add(p1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(p1);
                second();
            }
        });
        p1.updateUI();
    }
    public void second(){
        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);
        mainF.setVisible(true);
        JPanel p2 = new JPanel();
        JLabel l2 = new JLabel("label2");
        JButton b2 = new JButton("Button2");

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(p2);
                first();

            }
        });

        p2.add(l2);
        p2.add(b2);
        mainF.add(p2);
        p2.updateUI();
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.first();
    }
}
