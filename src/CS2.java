import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CS2 {
    ArrayList<Student> studentDetails = new ArrayList<>();
    JFrame mainFrame;
    JPanel mainPanel;

    public void first(){
        JFrame fF = new JFrame("First");
        JPanel fP  =new JPanel();
        JLabel nameL = new JLabel("Name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of Birth:");
        JTextField dobTF = new JTextField(15);
        JButton addB = new JButton("Add");

        fF.setBounds(500,250,500,400);
        fF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fF.setAlwaysOnTop(true);

        fP.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.gridx=0;
        g.gridy=0;
        fP.add(nameL, g);

        g.gridy--;
        g.gridwidth=2;
        fP.add(nameTF, g);

        g.gridy--;
        g.gridwidth=1;
        fP.add(dobL, g);

        g.gridy--;
        g.gridwidth=2;
        fP.add(dobTF, g);

        g.gridy--;
        fP.add(addB, g);

        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentDetails.add(new Student(dobTF.getText(), nameTF.getText(), 0,0));
//                for (Student value : studentDetails){
//                    System.out.println(value.getStudentName()+" "+value.getDateOfBirth());
//                }
            }
        });

        fF.add(fP);
        fF.setVisible(true);
    }

    public static void main(String[] args) {
        CS2 obj = new CS2();
        obj.first();

    }
}