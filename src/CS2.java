import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CS2 {
    ArrayList<Student> studentDetails = new ArrayList<>();
    JFrame mainF = new JFrame("ICP");

    public void initiate(){
        JPanel messageP = new JPanel();
        JLabel messageL = new JLabel("For testing purpose, fill in the form:");
        JButton acceptB = new JButton("Accept");
        JPanel conP = new JPanel();
        JPanel nameP = new JPanel();
        JPanel dobP = new JPanel();
        JPanel durationP = new JPanel();
        JPanel feeP = new JPanel();
        JPanel buttonP = new JPanel();
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of Birth:");
        JTextField dobTF = new JTextField(15);
        JLabel durationL = new JLabel("Course Duration:");
        JTextField durationTF = new JTextField(15);
        JLabel feeL = new JLabel("Tuition Fee");
        JTextField feeTF = new JTextField(15);
        JButton button = new JButton("Add");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);

        conP.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(5, 0,0,0);

        messageP.setLayout(new GridBagLayout());
        g.gridy=0;
        g.gridx=0;
        messageP.add(messageL, g);
        g.gridy--;
        messageP.add(acceptB, g);
        conP.add(messageP);

        acceptB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conP.remove(messageP);

                nameP.setLayout(new GridBagLayout());
                g.gridx=0;
                g.gridy=0;
                g.fill=1;
                nameP.add(nameL, g);
                g.gridy--;
                nameP.add(nameTF, g);
                g.gridy++;
                conP.add(nameP, g);

                dobP.setLayout(new GridBagLayout());
                g.fill=1;
                dobP.add(dobL, g);
                g.gridy--;
                dobP.add(dobTF, g);
                conP.add(dobP, g);

                durationP.setLayout(new GridBagLayout());
                g.fill=1;
                durationP.add(durationL, g);
                g.gridy--;
                durationP.add(durationTF, g);
                conP.add(durationP, g);

                feeP.setLayout(new GridBagLayout());
                g.fill=1;
                feeP.add(feeL, g);
                g.gridy--;
                feeP.add(feeTF, g);
                conP.add(feeP, g);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(nameTF.getText().equals("") || dobTF.getText().equals("") || durationTF.getText().equals("") || feeTF.getText().equals("")){

                        }else {
                            JOptionPane.showMessageDialog(mainF,"The actual program is now initiating!!!");
                            mainF.remove(conP);
                            first1();
                        }

                    }
                });

                buttonP.add(button);
                g.gridy--;
                conP.add(buttonP, g);
                conP.updateUI();
            }
        });

        mainF.add(conP);
        mainF.setVisible(true);

    }
    public void first1(){
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Label");
        JButton teacherB = new JButton("Teacher");
        JButton studentB = new JButton("Student");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.gridy=0;
        g.gridx=0;
        g.gridwidth=2;
        g.insets=new Insets(0,0,25,15);
        panel1.add(label1, g);

        g.gridy--;
        g.gridwidth=1;

        panel1.add(teacherB, g);

        g.gridx++;
        panel1.add(studentB, g);

        studentB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(panel1);
                studentLogin();
            }
        });

        mainF.add(panel1);
        mainF.setVisible(true);
        panel1.updateUI();
    }

    public void studentLogin(){        // the login page
        JPanel studentP = new JPanel();
        JPanel usernameP = new JPanel();
        JPanel passwordP = new JPanel();
        JPanel buttonP = new JPanel();
        JLabel usernameL = new JLabel("Student name:");
        JTextField usernameTF = new JTextField(15);
        JLabel passwordL = new JLabel("EnrollmentID:");
        JTextField passwordTF = new JTextField(15);
        JButton signupB = new JButton("Signup");
        JButton loginB = new JButton("Login");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);

        studentP.setLayout(new GridBagLayout());
        usernameP.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(5, 0,0,0);
        g.gridx=0;
        g.gridy=0;
        g.fill=1;
        usernameP.add(usernameL, g);
        g.gridy--;
        usernameP.add(usernameTF, g);
        g.gridy++;
        studentP.add(usernameP, g);

        passwordP.setLayout(new GridBagLayout());
        g.fill=1;
        passwordP.add(passwordL, g);
        g.gridy--;
        passwordP.add(passwordTF, g);
        studentP.add(passwordP, g);

        buttonP.add(signupB);
        buttonP.add(loginB);
        g.gridy--;
        studentP.add(buttonP, g);

        signupB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                mainF.dispose();
            }
        });
        loginB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valid=false;
                if (usernameTF.getText().equals("")||passwordTF.getText().equals("")){
                    JOptionPane.showMessageDialog(mainF, "Fill in all the form");      // if any of the textField is empty
                }else {
                    for (Student user : studentDetails) {
                        if (usernameTF.getText().equals(user.getStudentName()) && passwordTF.getText().equals(String.valueOf(user.getEnrollmentID()))) {       // if the username and the password matches valid is set to true
                            valid = true;
                            JOptionPane.showMessageDialog(mainF, "Logged in successfully, Welcome " + user.getStudentName());
                        }
                    }
                    if (valid){
                        mainF.dispose();       // if the inputs are correct homePage is initiated
                    }else {
                        JOptionPane.showMessageDialog(mainF,"Invalid username or password");
                    }
                }
            }
        });
        mainF.add(studentP);
        mainF.setVisible(true);
        studentP.updateUI();
    }
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
                for (Student value : studentDetails){
                    System.out.println(value.getStudentName()+" "+value.getDateOfBirth());
                }
                nameTF.setText("");
                dobTF.setText("");
            }
        });

        fF.add(fP);
        fF.setVisible(true);

    }

    public void clear(){
        
    }

    public static void main(String[] args) {
        CS2 obj = new CS2();
        obj.studentLogin();

    }
}