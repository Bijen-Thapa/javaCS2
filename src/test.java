import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class test {
    ArrayList<Student > studentDetails = new ArrayList<>();
    JFrame mainF = new JFrame("Frame");
    UIManager def = new UIManager();


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
        JPanel p2a = new JPanel();
        JLabel l2 = new JLabel("label2");
        JButton b2 = new JButton("Button2");

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(p2);
                first();

            }
        });

//        p2.add(l2);
//        p2.add(b2);
        p2.add(p2a);
        p2a.setBorder(new LineBorder(Color.black,25, true));
//        p2a.setBackground(Color.red);
        p2a.setSize(new Dimension(300,100));
        mainF.add(p2);
        p2.updateUI();
    }
    public void test(){
        JButton b = new JButton();
        b.setBorder(null);
        b.setFocusable(false);
        b.setBackground(null);
        Calendar year = new GregorianCalendar();
        System.out.println(year.getWeekYear()-1);
    }
    public int[] idTaken(){
        studentDetails.add(new Regular("","",0,0,5,"","",0,0,0));
        studentDetails.add(new Regular("","",0,0,2,"","",0,0,0));

        int[] taken = new int[studentDetails.size()];
        if (!studentDetails.isEmpty()){
            for (int i = 0; i<studentDetails.size();i++){
                taken[i] = studentDetails.get(i).getEnrollmentID();
            }
        }
        Arrays.sort(taken);
        return taken;
    }
    public static void main(String[] args) {
//        UIManager.put("defaultFont", new Font("MONOSPACED", Font.BOLD, 14));
//        test obj = new test();
////        System.out.println(obj.idTaken()[1]);
//        for (int i=0; i<2; ++i){
//            System.out.print(obj.idTaken()[0]);
//        Calendar c = Calendar.getInstance();
//        System.out.println(Calendar.getWeekYear());
        }
    }

