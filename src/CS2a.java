import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CS2a {
    ArrayList<Student> studentDetails = new ArrayList<>();
    int enrollmentID = 1;

    JFrame mainF = new JFrame("ICP");

    public void initiate(){
//        JPanel messageP = new JPanel();
//        JLabel messageL = new JLabel("For testing purpose, fill in the form:");
//        JButton acceptB = new JButton("Accept");
//        JPanel conP = new JPanel();
//        JPanel nameP = new JPanel();
//        JPanel dobP = new JPanel();
//        JPanel durationP = new JPanel();
//        JPanel feeP = new JPanel();
//        JPanel buttonP = new JPanel();
//        JLabel nameL = new JLabel("Student name:");
//        JTextField nameTF = new JTextField(15);
//        JLabel dobL = new JLabel("Date of Birth:");
//        JTextField dobTF = new JTextField(15);
//        JLabel durationL = new JLabel("Course Duration:");
//        JTextField durationTF = new JTextField(15);
//        JLabel feeL = new JLabel("Tuition Fee");
//        JTextField feeTF = new JTextField(15);
//        JButton button = new JButton("Add");
//
//        mainF.setBounds(400, 200, 700,500);
//        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        mainF.setAlwaysOnTop(true);
//
//        conP.setLayout(new GridBagLayout());
//        GridBagConstraints g = new GridBagConstraints();
//        g.insets = new Insets(5, 0,0,0);
//
//        messageP.setLayout(new GridBagLayout());
//        g.gridy=0;
//        g.gridx=0;
//        messageP.add(messageL, g);
//        g.gridy--;
//        messageP.add(acceptB, g);
//        conP.add(messageP);
//
//        acceptB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                conP.remove(messageP);
//
//                nameP.setLayout(new GridBagLayout());
//                g.gridx=0;
//                g.gridy=0;
//                g.fill=1;
//                nameP.add(nameL, g);
//                g.gridy--;
//                nameP.add(nameTF, g);
//                g.gridy++;
//                conP.add(nameP, g);
//
//                dobP.setLayout(new GridBagLayout());
//                g.fill=1;
//                dobP.add(dobL, g);
//                g.gridy--;
//                dobP.add(dobTF, g);
//                conP.add(dobP, g);
//
//                durationP.setLayout(new GridBagLayout());
//                g.fill=1;
//                durationP.add(durationL, g);
//                g.gridy--;
//                durationP.add(durationTF, g);
//                conP.add(durationP, g);
//
//                feeP.setLayout(new GridBagLayout());
//                g.fill=1;
//                feeP.add(feeL, g);
//                g.gridy--;
//                feeP.add(feeTF, g);
//                conP.add(feeP, g);
//
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        if(nameTF.getText().equals("") || dobTF.getText().equals("") || durationTF.getText().equals("") || feeTF.getText().equals("")){
//
//                        }else {
//                            JOptionPane.showMessageDialog(mainF,"The actual program is now initiating!!!");
//                            mainF.remove(conP);
//                            first1();
//                        }
//
//                    }
//                });
//
//                buttonP.add(button);
//                g.gridy--;
//                conP.add(buttonP, g);
//                conP.updateUI();
//            }
//        });
//
//        mainF.add(conP);
//        mainF.setVisible(true);



        JPanel messageP = new JPanel();
        JLabel messageL = new JLabel("For testing purpose, fill in the form:");
        JButton acceptB = new JButton("Accept");
        JPanel conP = new JPanel();


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
                mainF.remove(conP);
                first();
            }
        });

        mainF.add(conP);
        mainF.setVisible(true);

    }
    public void studentLogin() {        // the login page
        JPanel studentP = new JPanel();
        JPanel usernameP = new JPanel();
        JPanel passwordP = new JPanel();
        JPanel buttonP = new JPanel();
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JTextField enrollmentTF = new JTextField(15);
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
        usernameP.add(nameL, g);
        g.gridy--;
        usernameP.add(nameTF, g);
        g.gridy++;
        studentP.add(usernameP, g);

        passwordP.setLayout(new GridBagLayout());
        g.fill=1;
        passwordP.add(enrollmentL, g);
        g.gridy--;
        passwordP.add(enrollmentTF, g);
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
                if (nameTF.getText().equals("")||enrollmentTF.getText().equals("")){
                    JOptionPane.showMessageDialog(mainF, "Fill in all the form");      // if any of the textField is empty
                }else {
                    for (Student user : studentDetails) {
                        if (nameTF.getText().equals(user.getStudentName()) && enrollmentTF.getText().equals(String.valueOf(user.getEnrollmentID()))) {       // if the username and the password matches valid is set to true
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

    public void home(){
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
    public void first(){
        JPanel mainP = new JPanel();
        JPanel mainP1 = new JPanel();
        JPanel lineP1 = new JPanel();
        JPanel lineP1_1 = new JPanel();
        JPanel lineP1_2 = new JPanel();
        JPanel lineP2 = new JPanel();
        JPanel lineP2_1 = new JPanel();
        JPanel lineP2_2 = new JPanel();
        JPanel lineP3 = new JPanel();
        JPanel lineP3_1 = new JPanel();
        JPanel lineP3_2 = new JPanel();
        JPanel lineP4 = new JPanel();
        JPanel lineP4_1 = new JPanel();
        JPanel lineP4_2 = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JLabel enrollmentV = new JLabel();
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        JTextField dobTF = new JTextField(15);
        JLabel courseL = new JLabel("Course name:");
        JTextField courseTF = new JTextField(15);
        JLabel courseDL = new JLabel("Course duration:");
        JTextField courseDTF = new JTextField(15);
        JLabel feeL = new JLabel("Tuition fee:");
        JTextField feeTF = new JTextField(15);
        JLabel doeL = new JLabel("Date of enrollment:");
        JTextField doeTF = new JTextField(15);
        JButton registerB = new JButton("Register");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);


        mainP.setLayout(new GridBagLayout());
        mainP1.setLayout(new GridBagLayout());
        lineP1_1.setLayout(new GridBagLayout());
        lineP1_2.setLayout(new GridBagLayout());
        lineP2_1.setLayout(new GridBagLayout());
        lineP2_2.setLayout(new GridBagLayout());
        lineP3_1.setLayout(new GridBagLayout());
        lineP3_2.setLayout(new GridBagLayout());
        lineP4_1.setLayout(new GridBagLayout());
        lineP4_2.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        lineP1_1.add(enrollmentL, g);
        g.gridy--;
        g.gridwidth=2;
        enrollmentV.setText(String.valueOf(enrollmentID));
        lineP1_1.add(enrollmentV, g);
        g.gridx=0;
        g.gridy--;
        g.gridwidth=1;
        lineP1_2.add(courseL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP1_2.add(courseTF, g);

        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        lineP2_1.add(nameL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP2_1.add(nameTF, g);
        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        lineP2_2.add(courseDL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP2_2.add(courseDTF, g);

        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        lineP3_1.add(dobL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP3_1.add(dobTF, g);
        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        lineP3_2.add(feeL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP3_2.add(feeTF, g);

        g.gridx=0;
        g.gridy=0;
        g.gridwidth=1;
        g.weightx=-10;
        lineP4_1.add(doeL, g);
        g.gridy--;
        g.gridwidth=2;
        lineP4_1.add(doeTF, g);
        g.gridx=0;
        g.gridy=0;
        g.gridwidth=2;
        g.gridheight=2;
        g.ipadx=70;
        g.ipady=8;
        lineP4_2.add(registerB, g);

        lineP1.add(lineP1_1);
        lineP1.add(lineP1_2);
        lineP2.add(lineP2_1);
        lineP2.add(lineP2_2);
        lineP3.add(lineP3_1);
        lineP3.add(lineP3_2);
        lineP4.add(lineP4_1);
        lineP4.add(lineP4_2);
        g.gridwidth=1;
        g.gridx=0;
        g.gridy=0;
        g.insets = new Insets(0,0,15,0);
        mainP1.add(lineP1, g);
        g.gridy--;
        mainP1.add(lineP2, g);
        g.gridy--;
        mainP1.add(lineP3, g);
        g.gridy--;
        mainP1.add(lineP4, g);

        registerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean usernameA = true;
                if (enrollmentV.getText().equals("")||nameTF.getText().equals("")||dobTF.getText().equals("")||courseTF.getText().equals("")||courseDTF.getText().equals("")||feeTF.getText().equals("")){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");          // if any of the textField are empty
                }else {
                    enrollmentID++;
//                    studentDetails.add(new Student();
                    studentDetails.add(new Regular(dobTF.getText(), nameTF.getText(), Integer.parseInt(courseDTF.getText()), Integer.parseInt(feeTF.getText()), 0,"", "", 0,0, 0));
                    JOptionPane.showMessageDialog(mainF, "Registered successfully!");
                    mainF.remove(mainP);
                    home();
                }
            }
        });
        mainP.add(mainP1, g);
        mainF.add(mainP);
        mainF.setVisible(true);
        mainP.updateUI();
    }

    public void clear(){

    }

    public static void main(String[] args) {
        CS2a obj = new CS2a();
        obj.initiate();

    }

}
