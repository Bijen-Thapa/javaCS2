import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CS2b {
    ArrayList<Student> studentDetails = new ArrayList<>();
    int enrollmentID = 1;
    JFrame mainF = new JFrame("ICP");
    String[] yearCB = {"Year","1990", "1990", "1990", "1990", "1990", "1990", "1990"};
    String[] monthCB = {"Month","January", "January", "January", "January", "January", "January", "January"};
    String[] dayCB = {"day","1", "2", "3", "4", "5", "6", "7"};


    //    public void initiate(){
////        JPanel messageP = new JPanel();
////        JLabel messageL = new JLabel("For testing purpose, fill in the form:");
////        JButton acceptB = new JButton("Accept");
////        JPanel conP = new JPanel();
////        JPanel nameP = new JPanel();
////        JPanel dobP = new JPanel();
////        JPanel durationP = new JPanel();
////        JPanel feeP = new JPanel();
////        JPanel buttonP = new JPanel();
////        JLabel nameL = new JLabel("Student name:");
////        JTextField nameTF = new JTextField(15);
////        JLabel dobL = new JLabel("Date of Birth:");
////        JTextField dobTF = new JTextField(15);
////        JLabel durationL = new JLabel("Course Duration:");
////        JTextField durationTF = new JTextField(15);
////        JLabel feeL = new JLabel("Tuition Fee");
////        JTextField feeTF = new JTextField(15);
////        JButton button = new JButton("Add");
////
////        mainF.setBounds(400, 200, 700,500);
////        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
////        mainF.setAlwaysOnTop(true);
////
////        conP.setLayout(new GridBagLayout());
////        GridBagConstraints g = new GridBagConstraints();
////        g.insets = new Insets(5, 0,0,0);
////
////        messageP.setLayout(new GridBagLayout());
////        g.gridy=0;
////        g.gridx=0;
////        messageP.add(messageL, g);
////        g.gridy--;
////        messageP.add(acceptB, g);
////        conP.add(messageP);
////
////        acceptB.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                conP.remove(messageP);
////
////                nameP.setLayout(new GridBagLayout());
////                g.gridx=0;
////                g.gridy=0;
////                g.fill=1;
////                nameP.add(nameL, g);
////                g.gridy--;
////                nameP.add(nameTF, g);
////                g.gridy++;
////                conP.add(nameP, g);
////
////                dobP.setLayout(new GridBagLayout());
////                g.fill=1;
////                dobP.add(dobL, g);
////                g.gridy--;
////                dobP.add(dobTF, g);
////                conP.add(dobP, g);
////
////                durationP.setLayout(new GridBagLayout());
////                g.fill=1;
////                durationP.add(durationL, g);
////                g.gridy--;
////                durationP.add(durationTF, g);
////                conP.add(durationP, g);
////
////                feeP.setLayout(new GridBagLayout());
////                g.fill=1;
////                feeP.add(feeL, g);
////                g.gridy--;
////                feeP.add(feeTF, g);
////                conP.add(feeP, g);
////
////                button.addActionListener(new ActionListener() {
////                    @Override
////                    public void actionPerformed(ActionEvent e) {
////                        if(nameTF.getText().equals("") || dobTF.getText().equals("") || durationTF.getText().equals("") || feeTF.getText().equals("")){
////
////                        }else {
////                            JOptionPane.showMessageDialog(mainF,"The actual program is now initiating!!!");
////                            mainF.remove(conP);
////                            first1();
////                        }
////
////                    }
////                });
////
////                buttonP.add(button);
////                g.gridy--;
////                conP.add(buttonP, g);
////                conP.updateUI();
////            }
////        });
////
////        mainF.add(conP);
////        mainF.setVisible(true);
//
//
//
//        JPanel messageP = new JPanel();
//        JLabel messageL = new JLabel("For testing purpose, fill in the form:");
//        JButton acceptB = new JButton("Accept");
//        JPanel conP = new JPanel();
//
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
//                mainF.remove(conP);
//                first();
//            }
//        });
//
//        mainF.add(conP);
//        mainF.setVisible(true);
//
//    }
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
        JButton regularB = new JButton("Add regular");
        JButton dropoutB = new JButton("Add dropout");

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

        panel1.add(regularB, g);

        g.gridx++;
        panel1.add(dropoutB, g);

        regularB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(panel1);
                regular();
            }
        });
        dropoutB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(panel1);
                dropout();
            }
        });

        mainF.add(panel1);
        mainF.setVisible(true);
        panel1.updateUI();


    }
    public void regular(){
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
        JPanel lineP5 = new JPanel();
        JPanel lineP5_1 = new JPanel();
        JPanel lineP5_2 = new JPanel();
        JPanel lineP6 = new JPanel();
        JPanel lineP6_1 = new JPanel();
        JPanel lineP6_2 = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JTextField enrollmentTF = new JTextField(10);
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        JComboBox<String> dobCBY = new JComboBox<>(yearCB);
        JComboBox<String> dobCBM = new JComboBox<>(monthCB);
        JComboBox<String> dobCBD = new JComboBox<>(dayCB);
        JLabel courseL = new JLabel("Course name:");
        JTextField courseTF = new JTextField(15);
        JLabel courseDL = new JLabel("Course duration:");
        JTextField courseDTF = new JTextField(15);
        JLabel feeL = new JLabel("Tuition fee:");
        JTextField feeTF = new JTextField(15);
        JLabel doeL = new JLabel("Date of enrollment:");
        JComboBox<String> doeCBY = new JComboBox<>(yearCB);
        JComboBox<String> doeCBM = new JComboBox<>(monthCB);
        JComboBox<String> doeCBD = new JComboBox<>(dayCB);
        JButton registerB = new JButton("Register");
        JLabel nOfModuleL = new JLabel("Number of modules:");
        JTextField nOFModuleTF = new JTextField(15);
        JLabel nOfCreditL = new JLabel("Number of credit hours:");
        JTextField nOfCreditTF = new JTextField(15);
        JLabel daysPresentL = new JLabel("Days present:");
        JTextField daysPresentTF = new JTextField(15);
        JButton clearB = new JButton("Clear");
        JButton backB = new JButton("Back");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);


        mainP.setLayout(new GridBagLayout());
        mainP1.setLayout(new GridBagLayout());
        lineP1.setLayout(new GridBagLayout());
        lineP2.setLayout(new GridBagLayout());
        lineP3.setLayout(new GridBagLayout());
        lineP4.setLayout(new GridBagLayout());
        lineP5.setLayout(new GridBagLayout());
        lineP6.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        lineP1_1.add(enrollmentL);
        lineP1_1.add(enrollmentTF);

        lineP1_2.add(nameL);
        lineP1_2.add(nameTF);

        lineP2_1.add(dobL);
        lineP2_1.add(dobCBY);
        lineP2_1.add(dobCBM);
        lineP2_1.add(dobCBD);

        lineP2_2.add(doeL);
        lineP2_2.add(doeCBY);
        lineP2_2.add(doeCBM);
        lineP2_2.add(doeCBD);


        lineP3_1.add(courseL);
        lineP3_1.add(courseTF);

        lineP3_2.add(courseDL);
        lineP3_2.add(courseDTF);

        lineP4_1.add(nOfModuleL);
        lineP4_1.add(nOFModuleTF);

        lineP4_2.add(nOfCreditL);
        lineP4_2.add(nOfCreditTF);

        lineP5_1.add(daysPresentL);
        lineP5_1.add(daysPresentTF);

        lineP5_2.add(feeL);
        lineP5_2.add(feeTF);

        lineP6_1.add(clearB);
        lineP6_2.add(registerB);

        g.gridx=0;
        g.gridy=0;
        lineP1.add(lineP1_1,g);
        g.gridx++;
        lineP1.add(lineP1_2,g);

        g.gridx=0;
        g.gridy=0;
        lineP2.add(lineP2_1,g);
        g.gridx++;
        lineP2.add(lineP2_2,g);

        g.gridx=0;
        g.gridy=0;
        lineP3.add(lineP3_1);
        g.gridx++;
        lineP3.add(lineP3_2);

        g.gridx=0;
        g.gridy=0;
        lineP4.add(lineP4_1);
        g.gridx++;
        lineP4.add(lineP4_2);

        lineP5.add(lineP5_1);
        lineP5.add(lineP5_2);

        lineP6.add(lineP6_1);
        lineP6.add(lineP6_2);
        g.gridwidth=1;
        g.gridx=0;
        g.gridy=0;
        g.insets = new Insets(0,0,15,0);
        mainP1.add(lineP1, g);
        g.gridy=1;
        mainP1.add(lineP2, g);
        g.gridy=2;
        mainP1.add(lineP3, g);
        g.gridy=3;
        mainP1.add(lineP4, g);
        g.gridy=4;
        mainP1.add(lineP5, g);
        g.gridy=5;
        mainP1.add(lineP6, g);
        g.gridy=6;
        mainP1.add(backB, g);

        clearB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollmentTF.setText(null);
                nameTF.setText(null);
                courseTF.setText(null);
                courseDTF.setText(null);
                nOFModuleTF.setText(null);
                nOfCreditTF.setText(null);
                daysPresentTF.setText(null);
                feeTF.setText(null);
                dobCBY.setSelectedIndex(0);
                dobCBM.setSelectedIndex(0);
                dobCBD.setSelectedIndex(0);
                doeCBY.setSelectedIndex(0);
                doeCBM.setSelectedIndex(0);
                doeCBD.setSelectedIndex(0);
            }
        });
        registerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean usernameA = true;
                if (enrollmentTF.getText().equals("")||nameTF.getText().equals("")||courseTF.getText().equals("")||courseDTF.getText().equals("")||nOFModuleTF.getText().equals("")||nOfCreditTF.getText().equals("")||feeTF.getText().equals("")){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");          // if any of the textField are empty
                }else {
                    studentDetails.add(new Regular(nameTF.getText(), date(dobCBY,dobCBM,dobCBD), Integer.parseInt(courseDTF.getText()), Integer.parseInt(feeTF.getText()), Integer.parseInt(enrollmentTF.getText()), date(doeCBY,doeCBM,doeCBD), courseTF.getText(), Integer.parseInt(nOFModuleTF.getText()), Integer.parseInt(nOfCreditTF.getText()), Integer.parseInt(daysPresentTF.getText())));
                    studentDetails.get(0).display();
                    JOptionPane.showMessageDialog(mainF, "Registered successfully!");
                    mainF.remove(mainP);
                    home();
                }
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                home();
            }
        });
        mainP.add(mainP1, g);
        mainF.add(mainP);
        mainF.setVisible(true);
        mainP.updateUI();
    }
    public void dropout(){

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
        JPanel lineP5 = new JPanel();
        JPanel lineP5_1 = new JPanel();
        JPanel lineP5_2 = new JPanel();
        JPanel lineP6 = new JPanel();
        JPanel lineP6_1 = new JPanel();
        JPanel lineP6_2 = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JTextField enrollmentTF = new JTextField(10);
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        JComboBox<String> dobCBY = new JComboBox<>(yearCB);
        JComboBox<String> dobCBM = new JComboBox<>(monthCB);
        JComboBox<String> dobCBD = new JComboBox<>(dayCB);
        JLabel courseL = new JLabel("Course name:");
        JTextField courseTF = new JTextField(15);
        JLabel courseDL = new JLabel("Course duration:");
        JTextField courseDTF = new JTextField(15);
        JLabel feeL = new JLabel("Tuition fee:");
        JTextField feeTF = new JTextField(15);
        JLabel doeL = new JLabel("Date of enrollment:");
        JComboBox<String> doeCBY = new JComboBox<>(yearCB);
        JComboBox<String> doeCBM = new JComboBox<>(monthCB);
        JComboBox<String> doeCBD = new JComboBox<>(dayCB);
        JButton addDB = new JButton("Add to dropout");
        JLabel nOfRModuleL = new JLabel("Number of remaining modules:");
        JTextField nOfRModuleTF = new JTextField(15);
        JLabel nOfMAttainedL = new JLabel("Number of months attended:");
        JTextField nOfMAttainedTF = new JTextField(15);
        JLabel dodL = new JLabel("Date of dropout:");
        JComboBox<String> dodCBY = new JComboBox<>(yearCB);
        JComboBox<String> dodCBM = new JComboBox<>(monthCB);
        JComboBox<String> dodCBD = new JComboBox<>(dayCB);
        JButton clearB = new JButton("Clear");
        JButton backB = new JButton("Back");

        mainF.setBounds(400, 200, 700,500);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setAlwaysOnTop(true);


        mainP.setLayout(new GridBagLayout());
        mainP1.setLayout(new GridBagLayout());
        lineP1.setLayout(new GridBagLayout());
        lineP2.setLayout(new GridBagLayout());
        lineP3.setLayout(new GridBagLayout());
        lineP4.setLayout(new GridBagLayout());
        lineP5.setLayout(new GridBagLayout());
        lineP6.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        lineP1_1.add(enrollmentL);
        lineP1_1.add(enrollmentTF);

        lineP1_2.add(nameL);
        lineP1_2.add(nameTF);

        lineP2_1.add(dobL);
        lineP2_1.add(dobCBY);
        lineP2_1.add(dobCBM);
        lineP2_1.add(dobCBD);

        lineP2_2.add(doeL);
        lineP2_2.add(doeCBY);
        lineP2_2.add(doeCBM);
        lineP2_2.add(doeCBD);


        lineP3_1.add(courseL);
        lineP3_1.add(courseTF);

        lineP3_2.add(courseDL);
        lineP3_2.add(courseDTF);

        lineP4_1.add(nOfRModuleL);
        lineP4_1.add(nOfRModuleTF);

        lineP4_2.add(nOfMAttainedL);
        lineP4_2.add(nOfMAttainedTF);

        lineP5_1.add(dodL);
        lineP5_1.add(dodCBY);
        lineP5_1.add(dodCBM);
        lineP5_1.add(dodCBD);

        lineP5_2.add(feeL);
        lineP5_2.add(feeTF);

        lineP6_1.add(clearB);
        lineP6_2.add(addDB);

        g.gridx=0;
        g.gridy=0;
        lineP1.add(lineP1_1,g);
        g.gridx++;
        lineP1.add(lineP1_2,g);

        g.gridx=0;
        g.gridy=0;
        lineP2.add(lineP2_1,g);
        g.gridx++;
        lineP2.add(lineP2_2,g);

        g.gridx=0;
        g.gridy=0;
        lineP3.add(lineP3_1);
        g.gridx++;
        lineP3.add(lineP3_2);

        g.gridx=0;
        g.gridy=0;
        lineP4.add(lineP4_1);
        g.gridx++;
        lineP4.add(lineP4_2);

        lineP5.add(lineP5_1);
        lineP5.add(lineP5_2);

        lineP6.add(lineP6_1);
        lineP6.add(lineP6_2);
        g.gridwidth=1;
        g.gridx=0;
        g.gridy=0;
        g.insets = new Insets(0,0,15,0);
        mainP1.add(lineP1, g);
        g.gridy=1;
        mainP1.add(lineP2, g);
        g.gridy=2;
        mainP1.add(lineP3, g);
        g.gridy=3;
        mainP1.add(lineP4, g);
        g.gridy=4;
        mainP1.add(lineP5, g);
        g.gridy=5;
        mainP1.add(lineP6, g);
        g.gridy=6;
        mainP1.add(backB, g);

        clearB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollmentTF.setText(null);
                nameTF.setText(null);
                courseTF.setText(null);
                courseDTF.setText(null);
                nOfRModuleTF.setText(null);
                nOfMAttainedTF.setText(null);
                feeTF.setText(null);
                dobCBY.setSelectedIndex(0);
                dobCBM.setSelectedIndex(0);
                dobCBD.setSelectedIndex(0);
                doeCBY.setSelectedIndex(0);
                doeCBM.setSelectedIndex(0);
                doeCBD.setSelectedIndex(0);
                dodCBY.setSelectedIndex(0);
                dodCBM.setSelectedIndex(0);
                dodCBD.setSelectedIndex(0);
            }
        });
        addDB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean usernameA = true;
                if (enrollmentTF.getText().equals("")||nameTF.getText().equals("")||courseTF.getText().equals("")||courseDTF.getText().equals("")||feeTF.getText().equals("")){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");          // if any of the textField are empty
                }else {
                    enrollmentID++;
                    studentDetails.add(new Dropout(nameTF.getText(), date(dobCBY,dobCBM,dobCBD), Integer.parseInt(courseDTF.getText()), Integer.parseInt(feeTF.getText()), Integer.parseInt(enrollmentTF.getText()), date(doeCBY,doeCBM,doeCBD), courseTF.getText(),Integer.parseInt(nOfRModuleTF.getText()),Integer.parseInt(nOfMAttainedTF.getText()),date(dodCBY,dodCBM,dodCBD)));
                    studentDetails.get(0).display();
                    JOptionPane.showMessageDialog(mainF, "Registered successfully!");
                    mainF.remove(mainP);
                    home();
                }
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                home();
            }
        });
        mainP.add(mainP1, g);
        mainF.add(mainP);
        mainF.setVisible(true);
        mainP.updateUI();
    }
    public void clear(){

    }
    public String date(JComboBox<String> year, JComboBox<String> month, JComboBox<String> day){
        return year.getSelectedItem()+" "+month.getSelectedItem()+" "+day.getSelectedItem();
    }
    public static void main(String[] args) {
        CS2b obj = new CS2b();
        obj.home();

    }
}
