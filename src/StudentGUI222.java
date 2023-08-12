
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.ArrayList;

public class StudentGUI222 {
    String name;
    int enrollmentID;
    int courseDuration;
    String dob;
    String doe;
    int tuitionFee;

    String years[] = {"Select DOB", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"};
    String[] monthCB = {"Select Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] dayCB = {"day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"};

    ArrayList<Student>ABC=new ArrayList<>();

    public void informatics(){
        JFrame frame = new JFrame("Student Management System");
        JFrame frame1 = new JFrame("regular");
        JFrame frame2 = new JFrame("dropout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        JPanel panel1 = new JPanel();
//        panel1.setSize(300,200);
        JPanel panel2 = new JPanel();
//        panel2.setSize(300,200);
        JPanel panel3 = new JPanel();
//        panel3.setSize(300,200);
        JPanel dateOfBirthP = new JPanel();
        JPanel dateOfEnrollmentP = new JPanel();


        Border marginTop = new EmptyBorder(20,0,0,0);
        Border marginBottom = new EmptyBorder(0,0,20,0);



        JLabel studentName = new JLabel("Student Name");
        studentName.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel enrollmentIDL = new JLabel("Enrollment ID");
        enrollmentIDL.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel courseName = new JLabel("Course Name");
        courseName.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel courseDurationL = new JLabel("Course Duration");
        courseDurationL.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel dateOfBirth = new JLabel("Date Of Birth");
        dateOfBirth.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel dateOfEnrollment = new JLabel("Date Of Enrollment");
        dateOfEnrollment.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel tuitionFeeL = new JLabel("Tuition Fee");
        tuitionFeeL.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel numberOfModules = new JLabel("Number Of Modules");
        numberOfModules.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel numberOfCreditHours = new JLabel("Number Of Credit Hours");
        numberOfCreditHours.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel daysPresent = new JLabel("Days Present");
        daysPresent.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel numberOfRemainingModules = new JLabel("Number Of Remaining Modules");
        numberOfRemainingModules.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel numberOfMonthsAttended = new JLabel("Number Of Months Attended");
        numberOfMonthsAttended.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel dateOfDropOut = new JLabel("Date Of Drop Out");
        dateOfDropOut.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel remainingAmount = new JLabel("Remaining Amount");
        remainingAmount.setFont(new Font("Arial", Font.PLAIN,16));
        JLabel Text1 = new JLabel("Student Management System");
        Text1.setFont(new Font("Arial", Font.PLAIN,18));
        JLabel Text2 = new JLabel("Regular Student");
        Text2.setFont(new Font("Arial", Font.PLAIN,18));
        JLabel Text3 = new JLabel("DropOut Student");
        Text3.setFont(new Font("Arial", Font.PLAIN,18));

        panel1.setBackground(Color.LIGHT_GRAY);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel3.setBackground(Color.LIGHT_GRAY);
        Text1.setForeground(Color.BLUE);
        Text2.setForeground(Color.BLUE);
        Text3.setForeground(Color.BLUE);

        JTextField studentNameTf = new JTextField(15);
        JTextField enrollmentIDTf = new JTextField(15);
        JTextField courseNameTf = new JTextField(15);
        JTextField courseDurationTf = new JTextField(15);
        JComboBox<String> dateOfBirthY = new JComboBox<>(years);
        JComboBox<String> dateOfBirthM = new JComboBox<>(monthCB);
        JComboBox<String> dateOfBirthD = new JComboBox<>(dayCB);
        JComboBox<String> dateOfEnrollmentY = new JComboBox<>(years);
        JComboBox<String> dateOfEnrollmentM = new JComboBox<>(monthCB);
        JComboBox<String> dateOfEnrollmentD = new JComboBox<>(dayCB);
        JTextField tuitionFeeTf = new JTextField(15);
        JTextField numberOfModulesTf = new JTextField(15);
        JTextField numberOfCreditHoursTf = new JTextField(15);
        JTextField daysPresentTf = new JTextField(15);
        JTextField numberOfRemainingModulesTf = new JTextField(15);
        JTextField numberOfMothsAttendedTf = new JTextField(15);
        JComboBox<String> dateOfDropOutTf = new JComboBox<>(years);

        JTextField remainingAmountTf = new JTextField(15);


        JButton regularBackButton = new JButton("Back");
        JButton regularAddButton = new JButton("Add");
        JButton ClearButton = new JButton("clear");
        JButton RegularClearButton = new JButton("clear");
        JButton RegularDisplayButton = new JButton("Display Regular");
        JButton DropoutBackButton = new JButton("Back");
        JButton DropoutAddButton = new JButton("Add");
        JButton DropoutClearButton = new JButton("clear");
        JButton DropoutDisplayButton = new JButton("Display Dropout");
        JButton regularButton = new JButton("Regular");
        JButton DropOutButton = new JButton("DropOut");
        JButton presentButton = new JButton("Present %");



        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel1.setLayout(layout);

        dateOfBirthP.add(dateOfEnrollmentY);
        dateOfBirthP.add(dateOfEnrollmentM);
        dateOfBirthP.add(dateOfEnrollmentD);

        dateOfEnrollmentP.add(dateOfBirthY);
        dateOfEnrollmentP.add(dateOfBirthM);
        dateOfEnrollmentP.add(dateOfBirthD);

        gbc.insets = new Insets(0,0,0,90);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        panel1.add(Text1, gbc);

        gbc.insets = new Insets(0,0,0,50);
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(studentName, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(studentNameTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(enrollmentIDL, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(enrollmentIDTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(courseName, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel1.add(courseNameTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(courseDurationL, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel1.add(courseDurationTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(dateOfBirth, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        dateOfBirthP.setBackground(Color.lightGray);
        panel1.add(dateOfBirthP, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(dateOfEnrollment, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        dateOfEnrollmentP.setBackground(Color.lightGray);
        panel1.add(dateOfEnrollmentP, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel1.add(tuitionFeeL, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel1.add(tuitionFeeTf, gbc);

        gbc.gridy=8;
        panel1.add(DropOutButton, gbc);
        gbc.gridx=0;
        panel1.add(regularButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 8;
        panel1.add(ClearButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel1.add(RegularDisplayButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 9;
        panel1.add(DropoutDisplayButton, gbc);

        panel2.setLayout(layout);

        gbc.insets = new Insets(0,0,0,0);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        panel2.add(Text2, gbc);

        gbc.insets = new Insets(0,0,0,50);
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel2.add(numberOfModules, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel2.add(numberOfModulesTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel2.add(numberOfCreditHours, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel2.add(numberOfCreditHoursTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel2.add(daysPresent, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel2.add(daysPresentTf, gbc);

        gbc.insets = new Insets(0,0,0,0);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel2.add(regularBackButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel2.add(presentButton, gbc);
        gbc.gridx =1;
        gbc.gridy = 5;
        panel2.add(RegularClearButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        panel2.add(regularAddButton, gbc);



        panel3.setLayout(layout);

        gbc.insets = new Insets(0,0,0,90);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        panel3.add(Text3, gbc);



        gbc.insets = new Insets(0,0,0,50);
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel3.add(numberOfRemainingModules, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel3.add(numberOfRemainingModulesTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel3.add(numberOfMonthsAttended, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel3.add(numberOfMothsAttendedTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel3.add(dateOfDropOut, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel3.add(dateOfDropOutTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel3.add(remainingAmount, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel3.add(remainingAmountTf, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel3.add(DropoutAddButton, gbc);
        gbc.gridx =0;
        gbc.gridy = 7;
        panel3.add(DropoutClearButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel3.add(DropoutBackButton, gbc);


        regularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (studentNameTf.getText().isEmpty()||enrollmentIDTf.getText().isEmpty()||courseNameTf.getText().isEmpty()||courseDurationTf.getText().isEmpty()||tuitionFeeTf.getText().isEmpty()||dateOfBirthY.getSelectedIndex()==0||dateOfBirthM.getSelectedIndex()==0||dateOfBirthD.getSelectedIndex()==0||dateOfEnrollmentY.getSelectedIndex()==0||dateOfEnrollmentM.getSelectedIndex()==0||dateOfEnrollmentD.getSelectedIndex()==0){

                    JOptionPane.showMessageDialog(frame,"Insert data");
                }else {
                    name = studentNameTf.getText();
                    enrollmentID = Integer.parseInt(enrollmentIDTf.getText());
                    courseDuration = Integer.parseInt(courseDurationTf.getText());
                    dob = dateOfBirthY.getSelectedItem()+" "+dateOfBirthM.getSelectedItem()+" "+dateOfBirthD.getSelectedItem();
                    doe = dateOfEnrollmentY.getSelectedItem()+" "+dateOfEnrollmentM.getSelectedItem()+" "+dateOfEnrollmentD.getSelectedItem();
                    tuitionFee = Integer.parseInt(tuitionFeeTf.getText());

                    frame.dispose();
                    frame1.setVisible(true);
                }
            }
        });
        DropOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (studentNameTf.getText().isEmpty()||enrollmentIDTf.getText().isEmpty()||courseNameTf.getText().isEmpty()||courseDurationTf.getText().isEmpty()||tuitionFeeTf.getText().isEmpty()||dateOfBirthY.getSelectedIndex()==0||dateOfBirthM.getSelectedIndex()==0||dateOfBirthD.getSelectedIndex()==0||dateOfEnrollmentY.getSelectedIndex()==0||dateOfEnrollmentM.getSelectedIndex()==0||dateOfEnrollmentD.getSelectedIndex()==0){

                    JOptionPane.showMessageDialog(frame,"Insert data");
                }else {
                    name = studentNameTf.getText();
                    enrollmentID = Integer.parseInt(enrollmentIDTf.getText());
                    courseDuration = Integer.parseInt(courseDurationTf.getText());
                    dob = dateOfBirthY.getSelectedItem() + " " + dateOfBirthM.getSelectedItem() + " " + dateOfBirthD.getSelectedItem();
                    doe = dateOfEnrollmentY.getSelectedItem() + " " + dateOfEnrollmentM.getSelectedItem() + " " + dateOfEnrollmentD.getSelectedItem();
                    tuitionFee = Integer.parseInt(tuitionFeeTf.getText());

                    frame.dispose();
                    frame2.setVisible(true);
                }
            }
        });
//        regularAddButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (numberOfModules.getText().isEmpty()||numberOfCreditHoursTf.getText().isEmpty()||daysPresentTf.getText().isEmpty()){
//                    JOptionPane.showMessageDialog(frame,"Insert data");
//                }else{
//                    ABC.add(new regular(studentNameTf.getText(), ));
//
//
//                }
//            }
//        });
        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentNameTf.setText("");
                enrollmentIDTf.setText("");
                courseNameTf.setText("");
                courseDurationTf.setText("");
                tuitionFeeTf.setText("");
                dateOfBirthY.setSelectedIndex(0);
                dateOfBirthM.setSelectedIndex(0);
                dateOfBirthD.setSelectedIndex(0);
                dateOfEnrollmentY.setSelectedIndex(0);
                dateOfEnrollmentM.setSelectedIndex(0);
                dateOfEnrollmentD.setSelectedIndex(0);
            }
        });
        RegularClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfModulesTf.setText("");
                numberOfCreditHoursTf.setText("");
                daysPresentTf.setText("");
                daysPresentTf.setText("");
            }
        });
        DropoutClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfRemainingModulesTf.setText("");
                dateOfDropOutTf.setSelectedIndex(0);
                numberOfMothsAttendedTf.setText("");
                remainingAmountTf.setText("");
            }
        });
        regularBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
                frame.setVisible(true);
            }
        });
        DropoutBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                frame.setVisible(true);
            }
        });
        regularAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (numberOfModulesTf.getText().isEmpty(),)
            }
        });


        panel1.setBorder(marginTop);
        panel3.setBorder(marginBottom);
        frame.add(panel1);
        frame1.add(panel2);
        frame2.add(panel3);
        frame.pack();
        frame1.pack();
        frame2.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        StudentGUI222 obj = new StudentGUI222();
        obj.informatics();
    }
}