import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGUI {
    ArrayList<Student> studentDetails = new ArrayList<>();
    private static int enrollmentID=1;
    private JFrame mainF = new JFrame("ICP");
    private final Color backColor = new Color(182, 173, 173);
    private final LayoutManager gridBag = new GridBagLayout();
    private final String[] yearCB = new String[12];
    private final String[] monthCB = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private final String[] dayCB = new String[31];
    private final String[] courseName = {"Select course","BBA","BIT","BBS"};
    public StudentGUI(){
        UIManager.put("Button.focusable", true);
        UIManager.put("Button.setBorder", null);
        UIManager.put("Button.background", backColor.darker());
        UIManager.put("Panel.background", backColor);
        UIManager.put("ComboBox<String>.focusable", false);
        UIManager.put("OptionPane.background", Color.WHITE);
        yearCB[0]="Year";
        dayCB[0]="Day";
        for (int i = 1;i<31;i++){
            dayCB[i] = String.valueOf(i);
        }
        mainF.setBounds(250, 100, 1000,600);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainF.setVisible(true);
    }
    public void initiate(){
        int msg = JOptionPane.showConfirmDialog(mainF,"This program is made with the assumption that: \n" +
                "A formal college was keep their students record on paper, \n"+"and now they are transitioning to digital record system.","message", JOptionPane.DEFAULT_OPTION);
        if (msg==JOptionPane.OK_OPTION){
            home();
        }else {
            initiate();
        }

    }
    public void home(){
        mainF.setTitle("Home");
        JPanel mainP = new JPanel();
        JLabel label1 = new JLabel("ICP student management system");
        JButton detailB = new JButton("Student details");
        JButton addB = new JButton("Add student");

        mainP.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();

        g.gridy=0;
        g.gridx=0;
        g.gridwidth=2;
        g.insets=new Insets(0,0,25,15);
        mainP.add(label1, g);

        g.gridy=1;
        g.gridwidth=1;

        mainP.add(detailB, g);

        g.gridx=1;
        mainP.add(addB, g);
        g.gridy=2;
        g.gridx=0;
        g.gridwidth=2;

        detailB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                studentLog();
            }
        });
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addStudentHome();
            }
        });

        mainF.add(mainP);
        mainP.updateUI();

    }
    public void addStudentHome(){
        mainF.setTitle("Add a student");
        JPanel mainP = new JPanel();
        JLabel label1 = new JLabel("Choose either to enroll a new student or add an existing student:");
        JButton enrollB = new JButton("Enroll a new student");
        JButton addB = new JButton("Add an existing student");
        JButton backB = new JButton("Back");

        mainP.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();
        g.gridy=0;
        g.gridx=0;
        g.gridwidth=2;
        g.insets=new Insets(0,0,25,15);
        mainP.add(label1, g);

        g.gridy++;
        g.gridwidth=1;

        mainP.add(enrollB, g);

        g.gridx++;
        mainP.add(addB, g);
        g.gridx=0;
        g.gridy++;
        g.gridwidth=2;
        mainP.add(backB,g);

        enrollB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idAvailable();
                mainF.remove(mainP);
                newStudent();
            }
        });
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addExistingHome();
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                home();
            }
        });

        mainF.add(mainP);
        mainP.updateUI();
    }
    public void addExistingHome(){
        mainF.setTitle("Add an existing student");
        JPanel mainP = new JPanel();
        JLabel label1 = new JLabel("Choose to add:");
        JButton regularB = new JButton("Add regular");
        JButton dropoutB = new JButton("Add dropout");
        JButton backB = new JButton("Back");

        mainP.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();

        g.gridy=0;
        g.gridx=0;
        g.gridwidth=2;
        g.insets=new Insets(0,0,25,15);
        mainP.add(label1, g);

        g.gridy=1;
        g.gridwidth=1;

        mainP.add(regularB, g);

        g.gridx=1;
        mainP.add(dropoutB, g);
        g.gridy=2;
        g.gridx=0;
        g.gridwidth=2;
        mainP.add(backB,g);

        regularB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                regular();
            }
        });
        dropoutB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                dropout();
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addStudentHome();
            }
        });
        mainF.add(mainP);
        mainP.updateUI();
    }
    public void regular(){
        mainF.setTitle("Existing regular student");
        JPanel mainP = new JPanel();
        JPanel lineP1n2 = new JPanel();
        JPanel lineP1 = new JPanel();
        JPanel lineP2 = new JPanel();
        JPanel lineP3 = new JPanel();
        JPanel lineP3n4 = new JPanel();
        JPanel lineP4 = new JPanel();
        JPanel lineP5 = new JPanel();
        JPanel lineP6 = new JPanel();
        JPanel dobP = new JPanel();
        JPanel doeP = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JTextField enrollmentTF = new JTextField(15);
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        yearCB[0] = "Year";
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(1994+i);
        }
        JComboBox<String> dobCBY = new JComboBox<>(yearCB);
        JComboBox<String> dobCBM = new JComboBox<>(monthCB);
        JComboBox<String> dobCBD = new JComboBox<>(dayCB);
        JLabel courseL = new JLabel("Course name:");
        JComboBox<String> CourseCB = new JComboBox<>(courseName);
        CourseCB.setFocusable(false);
        JLabel courseDL = new JLabel("Course duration:");
        JLabel courseDV = new JLabel("Select course");
        JLabel courseAttL = new JLabel();
        JLabel feeL = new JLabel("Tuition fee (Per month):");
        JLabel feeV = new JLabel("Select course");
        JLabel currencyAttachmentL = new JLabel();
        JLabel doeL = new JLabel("Date of enrollment:");
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(2005+i);
        }
        JComboBox<String> doeCBY = new JComboBox<>(yearCB);
        JComboBox<String> doeCBM = new JComboBox<>(monthCB);
        JComboBox<String> doeCBD = new JComboBox<>(dayCB);
        JButton addB = new JButton("Add to regular");
        JLabel nOfModuleL = new JLabel("Number of modules:");
        JLabel nOfModuleV = new JLabel("Select course");
        JLabel nOfCreditL = new JLabel("Number of credit hours:");
        JTextField nOfCreditTF = new JTextField(15);
        JLabel daysPresentL = new JLabel("Days present:");
        JTextField daysPresentTF = new JTextField(15);
        JButton clearB = new JButton("Clear");
        JButton backB = new JButton("Back");
        JPanel courseDP = new JPanel();
        JPanel feeP = new JPanel();

        mainP.setLayout(gridBag);
        lineP1.setLayout(gridBag);
        lineP2.setLayout(gridBag);
        lineP3.setLayout(gridBag);
        lineP4.setLayout(gridBag);
        lineP5.setLayout(gridBag);
        lineP6.setLayout(gridBag);
        lineP1n2.setLayout(gridBag);
        lineP3n4.setLayout(gridBag);

        GridBagConstraints g = new GridBagConstraints();

        g.insets = new Insets(5,0, 30,0);
        g.gridx=0;
        g.gridy=0;
        g.weightx=1;
        g.anchor = GridBagConstraints.WEST;
        lineP1.add(enrollmentL,g);
        g.gridy=1;
        lineP1.add(dobL,g);
        g.gridy=2;
        lineP1.add(courseL,g);
        g.gridy=3;
        lineP1.add(nOfModuleL,g);
        g.gridy=4;
        lineP1.add(daysPresentL,g);

        g.insets = new Insets(0,0, 28,0);
        g.gridx=0;
        g.gridy=0;
        lineP2.add(enrollmentTF,g);
        dobP.add(dobCBY);
        dobP.add(dobCBM);
        dobP.add(dobCBD);
        g.gridy++;
        lineP2.add(dobP,g);
        g.insets = new Insets(0,0, 28,0);
        g.gridy++;
        lineP2.add(CourseCB,g);
        g.gridy++;
        lineP2.add(nOfModuleV,g);
        g.gridy++;
        lineP2.add(daysPresentTF,g);

        g.insets = new Insets(5,0, 30,0);
        g.gridx=0;
        g.gridy=0;
        lineP3.add(nameL, g);
        g.gridy++;
        lineP3.add(doeL, g);;
        g.gridy++;
        lineP3.add(courseDL, g);;
        g.gridy++;
        lineP3.add(nOfCreditL, g);;
        g.gridy++;
        lineP3.add(feeL, g);

        g.insets = new Insets(0,0, 24,0);
        g.gridx=0;
        g.gridy=0;
        lineP4.add(nameTF, g);
        doeP.add(doeCBY);
        doeP.add(doeCBM);
        doeP.add(doeCBD);
        g.gridy++;
        lineP4.add(doeP, g);
        courseDP.add(courseDV);
        g.gridy++;
        lineP4.add(courseDP, g);
        g.gridy++;
        lineP4.add(nOfCreditTF, g);
        feeP.add(currencyAttachmentL);
        feeP.add(feeV);
        g.gridy++;
        lineP4.add(feeP, g);

        g.anchor = GridBagConstraints.CENTER;
        g.insets = new Insets(0,0, 0,0);
        g.gridy=0;
        g.gridx=0;
        mainP.add(lineP1,g);
        g.gridx=1;
        mainP.add(lineP2,g);
        g.gridx=2;
        mainP.add(lineP3,g);
        g.gridx=3;
        mainP.add(lineP4,g);
        g.gridx=0;
        g.gridy=1;
        g.gridwidth=2;
        g.insets = new Insets(0,0, 0,0);
        mainP.add(clearB,g);;
        g.gridx=2;
        g.gridwidth=8;
        mainP.add(addB,g);
        g.gridx=0;
        g.gridy=2;
        g.gridwidth=8;
        mainP.add(backB,g);

        g.anchor = GridBagConstraints.CENTER;

        CourseCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (CourseCB.getSelectedIndex()==0){
                    courseDP.remove(courseAttL);
                    currencyAttachmentL.setText(null);
                    courseDV.setText("Select course");
                    nOfModuleV.setText("Select course");
                    feeV.setText("Select course");
                }else if (CourseCB.getSelectedIndex()==1){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    nOfModuleV.setText("15");
                    feeV.setText("22000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==2){
                    courseDP.add(courseAttL);
                    courseDV.setText("32");
                    courseAttL.setText("month/s");
                    nOfModuleV.setText("18");
                    feeV.setText("39000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==3){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    nOfModuleV.setText("16");
                    feeV.setText("35000");
                    currencyAttachmentL.setText("Rs");
                }
            }
        });
        clearB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollmentTF.setText(null);
                nameTF.setText(null);
                CourseCB.setSelectedIndex(0);
                nOfCreditTF.setText(null);
                daysPresentTF.setText(null);
                dobCBY.setSelectedIndex(0);
                dobCBM.setSelectedIndex(0);
                dobCBD.setSelectedIndex(0);
                doeCBY.setSelectedIndex(0);
                doeCBM.setSelectedIndex(0);
                doeCBD.setSelectedIndex(0);
            }
        });
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enrollmentTF.getText().isEmpty()||nameTF.getText().isEmpty()|| !dateValid(dobCBY, dobCBM, dobCBD) || !dateValid(doeCBY, doeCBM, doeCBD) ||CourseCB.getSelectedIndex()==0||nOfCreditTF.getText().isEmpty()){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");          // if any of the textField are empty
                }else {
                    boolean valid = true;
                    try {
                        Integer.parseInt(enrollmentTF.getText());
                        Integer.parseInt(nOfCreditTF.getText());
                        Integer.parseInt(daysPresentTF.getText());
                    } catch (NumberFormatException ex) {
                        valid = false;
                        JOptionPane.showMessageDialog(mainP,"Insert data properly");
                    }finally {
                        if (valid){
                            if (idExist(enrollmentTF)){
                                JOptionPane.showMessageDialog(mainP,"Id already taken!!!");
                            }else {
                                studentDetails.add(new Regular(nameTF.getText(), date(dobCBY,dobCBM,dobCBD), Integer.parseInt(courseDV.getText()), Integer.parseInt(feeV.getText()), Integer.parseInt(enrollmentTF.getText()), date(doeCBY,doeCBM,doeCBD), CourseCB.getSelectedItem().toString(), Integer.parseInt(nOfModuleV.getText()), Integer.parseInt(nOfCreditTF.getText()), Integer.parseInt(daysPresentTF.getText())));
                                JOptionPane.showMessageDialog(mainF, "Registered successfully!");
                                mainF.remove(mainP);
                                addExistingHome();

                            }
                        }
                    }
                }
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addExistingHome();
            }
        });
        mainF.add(mainP);
        mainP.updateUI();
    }
    public void dropout(){
        mainF.setTitle("Existing dropout student");
        JPanel mainP = new JPanel();
        JPanel lineP1 = new JPanel();
        JPanel lineP2 = new JPanel();
        JPanel lineP3 = new JPanel();
        JPanel lineP4 = new JPanel();
        JPanel buttonP = new JPanel();
        JPanel dobP = new JPanel();
        JPanel doeP = new JPanel();
        JPanel dodP = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JTextField enrollmentTF = new JTextField(15);
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(1994+i);
        }
        JComboBox<String> dobCBY = new JComboBox<>(yearCB);
        JComboBox<String> dobCBM = new JComboBox<>(monthCB);
        JComboBox<String> dobCBD = new JComboBox<>(dayCB);
        JLabel courseL = new JLabel("Course name:");
        JComboBox<String> CourseCB = new JComboBox<>(courseName);
        JLabel courseDL = new JLabel("Course duration:");
        JLabel courseDV = new JLabel("Select course");
        JLabel courseAttL = new JLabel();
        JLabel feeL = new JLabel("Tuition fee (Per month):");
        JLabel feeV = new JLabel("Select course");
        JLabel currencyAttachmentL = new JLabel();
        JLabel doeL = new JLabel("Date of enrollment:");
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(2005+i);
        }
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
        JPanel courseDP = new JPanel();
        JPanel feeP = new JPanel();

        mainP.setLayout(gridBag);
        lineP1.setLayout(gridBag);
        lineP2.setLayout(gridBag);
        lineP3.setLayout(gridBag);
        lineP4.setLayout(gridBag);
        buttonP.setLayout(gridBag);

        GridBagConstraints g = new GridBagConstraints();

        g.insets = new Insets(0,0, 25,0);
        g.gridx=0;
        g.gridy=0;
        g.weightx=1;
        g.anchor = GridBagConstraints.LINE_START;
        lineP1.add(enrollmentL,g);
        g.gridy=1;
        lineP1.add(dobL,g);
        g.gridy=2;
        lineP1.add(courseL,g);
        g.gridy=3;
        lineP1.add(nOfRModuleL,g);
        g.gridy=4;
        lineP1.add(dodL,g);

        g.insets = new Insets(0,0, 15,0);
        g.gridx=0;
        g.gridy=0;
        lineP2.add(enrollmentTF,g);
        dobP.add(dobCBY);
        dobP.add(dobCBM);
        dobP.add(dobCBD);
        g.gridy=1;
        lineP2.add(dobP,g);
        g.gridy=2;
        lineP2.add(CourseCB,g);
        g.gridy=3;
        lineP2.add(nOfRModuleTF,g);
        dodP.add(dodCBY);
        dodP.add(dodCBM);
        dodP.add(dodCBD);
        g.gridy=4;
        lineP2.add(dodP,g);

        g.insets = new Insets(0,0, 25,0);
        g.gridx=0;
        g.gridy=0;
        lineP3.add(nameL, g);
        g.gridy++;
        lineP3.add(doeL, g);;
        g.gridy++;
        lineP3.add(courseDL, g);;
        g.gridy++;
        lineP3.add(nOfMAttainedL, g);;
        g.gridy++;
        lineP3.add(feeL, g);

        g.insets = new Insets(0,0, 15,0);
        g.gridx=0;
        g.gridy=0;
        lineP4.add(nameTF, g);
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(2005+i);
        }
        doeP.add(doeCBY);
        doeP.add(doeCBM);
        doeP.add(doeCBD);
        g.gridy++;
        lineP4.add(doeP, g);
        courseDP.add(courseDV);
        g.gridy++;
        lineP4.add(courseDP, g);
        g.gridy++;
        lineP4.add(nOfMAttainedTF, g);
        feeP.add(currencyAttachmentL);
        feeP.add(feeV);
        g.gridy++;
        lineP4.add(feeP, g);

        g.anchor = GridBagConstraints.CENTER;
        g.insets = new Insets(0,0, 0,0);
        g.gridy=0;
        g.gridx=0;
        mainP.add(lineP1,g);
        g.gridx=1;
        mainP.add(lineP2,g);
        g.gridx=2;
        mainP.add(lineP3,g);
        g.gridx=3;
        mainP.add(lineP4,g);
        g.gridx=0;
        g.gridy=1;
        g.gridwidth=2;
        mainP.add(clearB,g);;
        g.gridx=2;
        g.gridwidth=8;
        mainP.add(addDB,g);
        g.gridx=0;
        g.gridy=2;
        g.gridwidth=8;
        mainP.add(backB,g);

        CourseCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (CourseCB.getSelectedIndex()==0){
                    courseDP.remove(courseAttL);
                    currencyAttachmentL.setText(null);
                    courseDV.setText("Select course");
                    feeV.setText("Select course");
                }else if (CourseCB.getSelectedIndex()==1){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    feeV.setText("22000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==2){
                    courseDP.add(courseAttL);
                    courseDV.setText("32");
                    courseAttL.setText("month/s");
                    feeV.setText("39000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==3){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    feeV.setText("35000");
                    currencyAttachmentL.setText("Rs");
                }
            }
        });
        clearB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollmentTF.setText(null);
                nameTF.setText(null);
                CourseCB.setSelectedIndex(0);
                courseDV.setText(null);
                nOfRModuleTF.setText(null);
                nOfMAttainedTF.setText(null);
                feeV.setText(null);
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
                if (enrollmentTF.getText().isEmpty()||nameTF.getText().isEmpty()||!dateValid(dobCBY,dobCBM,dobCBD)||!dateValid(doeCBY,doeCBM,doeCBD)||CourseCB.getSelectedIndex()==0||nOfRModuleTF.getText().isEmpty()||nOfMAttainedTF.getText().isEmpty()||!dateValid(dodCBY, dodCBM, dodCBD)){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");          // if any of the textField are empty
                }else {boolean valid = true;
                    try {
                        Integer.parseInt(enrollmentTF.getText());
                        Integer.parseInt(nOfRModuleTF.getText());
                        Integer.parseInt(nOfMAttainedTF.getText());
                    } catch (NumberFormatException ex) {
                        valid = false;
                        JOptionPane.showMessageDialog(mainP,"Insert data properly");
                    }finally {
                        if (valid){
                            if (idExist(enrollmentTF)){
                                JOptionPane.showMessageDialog(mainP,"Id already taken!!!");
                            }else {
                                studentDetails.add(new Dropout(nameTF.getText(), date(dobCBY,dobCBM,dobCBD), Integer.parseInt(courseDV.getText()), Integer.parseInt(feeV.getText()), Integer.parseInt(enrollmentTF.getText()), date(doeCBY,doeCBM,doeCBD), CourseCB.getSelectedItem().toString(),Integer.parseInt(nOfRModuleTF.getText()),Integer.parseInt(nOfMAttainedTF.getText()),date(dodCBY,dodCBM,dodCBD)));
                                JOptionPane.showMessageDialog(mainF, "Student added successfully!");
                                mainF.remove(mainP);
                                addExistingHome();
                            }
                        }
                    }
                }
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addExistingHome();
            }
        });
        mainF.add(mainP);
        mainP.updateUI();
    }
    public void newStudent(){
        mainF.setTitle("New student");
        JPanel mainP = new JPanel();
        JPanel mainP1 = new JPanel();
        JPanel lineP1 = new JPanel();
        JPanel enrollmentP = new JPanel();
        JPanel courseP = new JPanel();
        JPanel lineP2 = new JPanel();
        JPanel nameP = new JPanel();
        JPanel courseDP = new JPanel();
        JPanel lineP3 = new JPanel();
        JPanel dobP = new JPanel();
        JPanel feeP = new JPanel();
        JPanel lineP4 = new JPanel();
        JPanel doeP = new JPanel();
        JPanel lineP4_2 = new JPanel();
        JPanel dobSubP = new JPanel();
        JPanel doeSubP = new JPanel();
        JPanel buttonP = new JPanel();
        JLabel enrollmentL = new JLabel("EnrollmentID:");
        JLabel enrollmentV = new JLabel();
        JLabel nameL = new JLabel("Student name:");
        JTextField nameTF = new JTextField(15);
        JLabel dobL = new JLabel("Date of birth:");
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(1994+i);
        }
        JComboBox<String> dobCBY = new JComboBox<>(yearCB);
        JComboBox<String> dobCBM = new JComboBox<>(monthCB);
        JComboBox<String> dobCBD = new JComboBox<>(dayCB);
        JLabel courseL = new JLabel("Course name:");
        JComboBox<String> CourseCB = new JComboBox<>(courseName);
        CourseCB.setFocusable(false);
        JLabel courseDL = new JLabel("Course duration:");
        JLabel courseDV = new JLabel("Select course");
        JLabel courseAttL = new JLabel();
        JLabel feeL = new JLabel("Tuition fee (Per month):");
        JLabel feeV = new JLabel("Select course");
        JLabel currencyAttachmentL = new JLabel();
        JLabel doeL = new JLabel("Date of enrollment:");
        for (int i =1;i<12;i++){
            yearCB[i] = String.valueOf(2005+i);
        }
        JComboBox<String> doeCBY = new JComboBox<>(yearCB);
        JComboBox<String> doeCBM = new JComboBox<>(monthCB);
        JComboBox<String> doeCBD = new JComboBox<>(dayCB);
        JButton clearB = new JButton("Clear");
        JButton registerB = new JButton("Register");
        JButton backB = new JButton("Back");
        JPanel courseDSubP = new JPanel();
        JPanel feeSubP = new JPanel();

        mainP.setLayout(gridBag);
        mainP1.setLayout(gridBag);
        lineP1.setLayout(gridBag);
        lineP2.setLayout(gridBag);
        enrollmentP.setLayout(gridBag);
        courseP.setLayout(gridBag);
        nameP.setLayout(gridBag);
        courseDP.setLayout(gridBag);
        dobP.setLayout(gridBag);
        feeP.setLayout(gridBag);
        doeP.setLayout(gridBag);
        lineP4_2.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();

        g.anchor = GridBagConstraints.LINE_START;
        g.gridx=0;
        g.gridy=0;
        enrollmentP.add(enrollmentL, g);
        g.gridx=1;
        g.insets = new Insets(0,15,0,0);

        enrollmentV.setText(String.valueOf(StudentGUI.enrollmentID));
        enrollmentP.add(enrollmentV, g);

        g.insets = new Insets(0,0,0,0);
        g.gridx=0;
        g.gridy=0;
        g.weightx=1;
        dobP.add(dobL, g);
        g.gridy--;
        dobSubP.add(dobCBY);
        dobSubP.add(dobCBM);
        dobSubP.add(dobCBD);
        dobP.add(dobSubP, g);

        g.gridx=0;
        g.gridy=0;
        courseDP.add(courseDL, g);
        courseDSubP.add(courseDV);
        g.gridx=1;
        courseDP.add(courseDSubP, g);

        g.gridx=0;
        g.gridy=0;
        doeP.add(doeL, g);
        g.gridy--;
        doeSubP.add(doeCBY);
        doeSubP.add(doeCBM);
        doeSubP.add(doeCBD);
        doeP.add(doeSubP, g);

        g.gridx=0;
        g.gridy=0;
        nameP.add(nameL,g);
        g.gridy--;
        nameP.add(nameTF, g);

        g.gridy=1;
        courseP.add(courseL, g);
        g.gridy=2;
        courseP.add(CourseCB, g);

        g.gridx=0;
        g.gridy=0;
        feeP.add(feeL, g);
        feeSubP.add(currencyAttachmentL);
        feeSubP.add(feeV);
        g.gridx=1;
        feeP.add(feeSubP, g);

        g.insets = new Insets(0,0,25,0);
        g.gridx=0;
        g.gridy=0;
        lineP1.add(enrollmentP,g);
        g.gridy=1;
        lineP1.add(dobP,g);
        g.gridy=2;
        lineP1.add(courseDP,g);
        g.gridy=3;
        lineP1.add(doeP,g);

        g.gridx=0;
        g.gridy=0;
        lineP2.add(nameP,g);
        g.gridy=1;
        lineP2.add(courseP,g);
        g.gridy=2;
        lineP2.add(feeP,g);
        g.gridy=3;
        lineP2.add(registerB,g);

        g.gridx=0;
        g.gridy=0;
        buttonP.add(clearB,g);
        g.gridx=1;
        buttonP.add(backB);

        g.anchor = GridBagConstraints.CENTER;
        g.gridwidth=1;
        g.gridx=0;
        g.gridy=0;
        g.insets = new Insets(0,0,0,0);
        mainP.add(lineP1, g);
        g.gridx=1;
        mainP.add(lineP2, g);
        g.gridx=0;
        g.gridy=1;
        g.gridwidth=2;
        mainP.add(buttonP,g);

        final int[] nOFModule={0};
        CourseCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (CourseCB.getSelectedIndex()==0){
                    courseDP.remove(courseAttL);
                    currencyAttachmentL.setText(null);
                    courseDV.setText("Select course");
                    feeV.setText("Select course");
                }else if (CourseCB.getSelectedIndex()==1){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    feeV.setText("22000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==2){
                    courseDP.add(courseAttL);
                    courseDV.setText("32");
                    courseAttL.setText("month/s");
                    feeV.setText("39000");
                    currencyAttachmentL.setText("Rs");
                }else if (CourseCB.getSelectedIndex()==3){
                    courseDP.add(courseAttL);
                    courseDV.setText("42");
                    courseAttL.setText("month/s");
                    feeV.setText("35000");
                    currencyAttachmentL.setText("Rs");
                }
            }
        });
        registerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameTF.getText().isEmpty()||CourseCB.getSelectedIndex()==0||!dateValid(dobCBY,dobCBM,dobCBD)||!dateValid(doeCBY,doeCBM,doeCBD)){
                    JOptionPane.showMessageDialog(mainF,"Fill in all the form to proceed!");
                }else {
                    boolean valid = true;
                    try {
                        Integer.parseInt(courseDV.getText());
                        Integer.parseInt(feeV.getText());
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(mainP,"Insert data properly");
                        valid = false;
                    }finally {
                        if (valid){
                            studentDetails.add(new Regular(nameTF.getText(), date(dobCBY,dobCBM,dobCBD), Integer.parseInt(courseDV.getText()), Integer.parseInt(feeV.getText()), Integer.parseInt(enrollmentV.getText()), date(doeCBY,doeCBM,doeCBD), CourseCB.getSelectedItem().toString(), nOFModule[0], 0, 0));
                            JOptionPane.showMessageDialog(mainF, "Registered successfully!");
                            mainF.remove(mainP);
                            addStudentHome();
                        }
                    }
                }
            }
        });
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                addStudentHome();
            }
        });
        mainF.add(mainP);
        mainP.updateUI();
    }
    public void studentLog(){
        mainF.setTitle("Student details");
        JLabel msg = new JLabel();
        JPanel mainP = new JPanel();
        JButton displayB = new JButton("Display");
        JButton backB = new JButton("Back");

        mainP.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();

        if (studentDetails.isEmpty()){
            msg.setText("No students to display, add students to see their details");
            g.gridx=0;
            g.gridy=0;
            mainP.add(msg,g);
            g.gridy=1;
            mainP.add(backB,g);
        }else {

            String[] head = {"EnrollmentID","Name","Course","Category"};
            String[][] data = {};
            DefaultTableModel defTable = new DefaultTableModel(data,head);
            JTable table = new JTable(defTable);
            JScrollPane sp = new JScrollPane(table);
            table.setRowSelectionAllowed(false);
            table.setCellSelectionEnabled(false);
            table.setColumnSelectionAllowed(false);
            table.setDragEnabled(false);
            table.setFillsViewportHeight(false);
            sp.setFocusable(false);

            for (Student stu: studentDetails ){
                Object[] addStu;
                if (stu instanceof Regular){
                    addStu = new Object[]{stu.getEnrollmentID(), stu.getStudentName(), stu.getCourseName(), "Regular"};

                }else {
                    addStu = new Object[]{stu.getEnrollmentID(), stu.getStudentName(), stu.getCourseName(), "Dropout"};
                }
                defTable.addRow(addStu);
            }

            msg.setText("Student details:");
            g.gridx=0;
            g.gridy=0;
            g.gridwidth=2;
            mainP.add(msg,g);
            g.gridy=1;
            mainP.add(sp,g);
            g.anchor = GridBagConstraints.CENTER;
            g.gridwidth=1;
            g.gridy=2;
            mainP.add(displayB,g);
            g.gridx=1;
            mainP.add(backB,g);
        }

        displayB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inp = JOptionPane.showInputDialog(mainP,"Enrollment ID");
                int inpu=0;
                if (inp.isEmpty()){
                    JOptionPane.showMessageDialog(mainP,"Inset data");
                }else {
                    boolean valid = true;
                    try {
                        inpu = Integer.parseInt(inp);
                    }catch (NumberFormatException exc){
                        JOptionPane.showMessageDialog(mainP, "Input invalid");
                        valid=false;
                    }finally {
                        int i=0;
                        if (valid){
                            if (studentDetails.isEmpty()){
                                JOptionPane.showMessageDialog(mainP,"Student with the given id do not exist");
                            }else{
                                boolean exist = false;
                                Student stud= null;
                                for (Student ss : studentDetails){
                                    if (inpu== ss.getEnrollmentID()){
                                        exist = true;
                                        stud = ss;
                                    }
                                }
                                if (exist){
                                    mainF.remove(mainP);
                                    studentDisplay(stud);
                                }else {
                                    JOptionPane.showMessageDialog(mainP,"ID does not exist");
                                }
                            }
                            ++i;
                        }
                    }
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
        mainF.add(mainP);
        mainP.updateUI();
    }
    public void studentDisplay(Student id){
        mainF.setTitle("Student Details");
        JPanel mainP = new JPanel();
        JPanel subP = new JPanel();
        JButton functionB1 = new JButton();
        JButton functionB2 = new JButton();
        JButton backB = new JButton("Back");
        mainP.setLayout(gridBag);
        subP.setLayout(gridBag);
        GridBagConstraints g = new GridBagConstraints();
        mainP.setBackground(backColor);
        subP.setBackground(backColor.brighter());

        if (id instanceof Regular idReal){
            idReal.presentPercentage(idReal.getDaysPresent());
            JLabel enrollmentID = new JLabel("EnrollmentID: "+idReal.getEnrollmentID());
            JLabel name = new JLabel("name: "+idReal.getStudentName());
            JLabel dob = new JLabel("Date of birth: "+idReal.getDateOfBirth());
            JLabel courseName = new JLabel("Course name: "+idReal.getCourseName());
            JLabel courseDuration = new JLabel("Course duration: "+idReal.getCourseDuration()+"month/s");
            JLabel doe = new JLabel("Date of Enrollment: "+idReal.getDateOfEnrollment());
            JLabel fee = new JLabel("Tuition fee: Rs"+idReal.getTuitionFee());
            JLabel nOfModule = new JLabel("Number of modules: "+idReal.getNumOfModules());
            JLabel daysPresent = new JLabel("Days present: "+idReal.getDaysPresent());
            JLabel creditHrs = new JLabel("Credit hours: "+idReal.getNumOfCreditHours()+" Hrs");

            g.anchor= GridBagConstraints.WEST;
            g.gridx=0;
            g.gridy=0;
            g.ipadx=600;
            g.insets = new Insets(10,0,15,0);
            subP.add(enrollmentID,g);
            g.gridy=1;
            subP.add(name,g);
            g.gridy=2;
            subP.add(dob,g);
            g.gridy=3;
            subP.add(courseName,g);
            g.gridy=4;
            subP.add(courseDuration,g);
            g.gridy=5;
            subP.add(doe,g);
            g.gridy=6;
            subP.add(fee,g);
            g.gridy=7;
            subP.add(nOfModule,g);
            g.gridy=8;
            subP.add(daysPresent,g);
            g.gridy=9;
            subP.add(creditHrs,g);

            functionB1.setText("Present percentage");
            functionB2.setText("Grant certificate");

            functionB1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String daysInput = JOptionPane.showInputDialog(mainP,"Days present;");
                    if (daysInput.isEmpty()){
                        JOptionPane.showMessageDialog(mainP,"Enter data to proceed");
                    }else {
                        boolean valid = true;
                        int daysPresent=0;
                        try {
                             daysPresent= Integer.parseInt(daysInput);
                        }catch (NumberFormatException l){
                            valid=false;
                            JOptionPane.showMessageDialog(mainP,"Insert data properly");
                        }finally {
                            if (valid){
                                if (daysPresent>(idReal.getCourseDuration()*30)){
                                    JOptionPane.showMessageDialog(mainP,"Invalid data");
                                }else {
                                    ((Regular) id).setDaysPresent(daysPresent);
                                    JOptionPane.showMessageDialog(mainP,"Present percentage of "+id.getStudentName()+" is "+idReal.presentPercentage(daysPresent));
                                    mainF.remove(mainP);
                                    studentDisplay(id);
                                }
                            }
                        }
                    }
                }
            });
            functionB2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int daysInput = JOptionPane.showConfirmDialog(mainP,"Grant certificate","Confirmation", JOptionPane.YES_NO_OPTION);
                    if (daysInput==JOptionPane.YES_OPTION){
                        System.out.println("yes done");
                        if (idReal.getIsGrantedScholarship()){
                            System.out.println("grant");
                            JOptionPane.showMessageDialog(mainP,idReal.getStudentName()+" having the enrollmentID "+idReal.getEnrollmentID()+" has been granted scholarship on ");
                        }else {
                            System.out.println("not g");
                            JOptionPane.showMessageDialog(mainP,idReal.getStudentName()+" is not eligible");
                        }

                    }
                }
            });
        }else if (id instanceof Dropout idReal){
            idReal.billsPayable();
            JLabel enrollmentID = new JLabel("EnrollmentID: "+idReal.getEnrollmentID());
            JLabel name = new JLabel("name: "+idReal.getStudentName());
            JLabel dob = new JLabel("Date of birth: "+idReal.getDateOfBirth());
            JLabel courseName = new JLabel("Course name: "+idReal.getCourseName());
            JLabel courseDuration = new JLabel("Course duration: "+idReal.getCourseDuration()+"month/s");
            JLabel doe = new JLabel("Date of Enrollment: "+idReal.getDateOfEnrollment());
            JLabel fee = new JLabel("Tuition fee: Rs"+idReal.getTuitionFee());
            JLabel nOfRModule = new JLabel("Number of remaining modules: "+idReal.getNumOfRemainingModules());
            JLabel nOfMAttended = new JLabel("Number of months attended: "+idReal.getNumOfMonthsAttended());
            JLabel dod = new JLabel("Date of dropout: "+idReal.getDateOfDropout());

            g.anchor= GridBagConstraints.WEST;
            g.gridx=0;
            g.gridy=0;
            g.ipadx=600;
            g.insets = new Insets(10,0,15,0);
            subP.add(enrollmentID,g);
            g.gridy=1;
            subP.add(name,g);
            g.gridy=2;
            subP.add(dob,g);
            g.gridy=3;
            subP.add(courseName,g);
            g.gridy=4;
            subP.add(courseDuration,g);
            g.gridy=5;
            subP.add(doe,g);
            g.gridy=6;
            subP.add(fee,g);
            g.gridy=7;
            subP.add(nOfRModule,g);
            g.gridy=8;
            subP.add(nOfMAttended,g);
            g.gridy=9;
            subP.add(dod,g);

            functionB1.setText("Pay bills");
            functionB2.setText("Remove student");

            functionB1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (idReal.getRemainingAmount()==0){
                        JOptionPane.showMessageDialog(mainP,"All bills cleared");
                    }else {
                        String pay = JOptionPane.showInputDialog(mainP,"Pay remaining amount: Rs "+idReal.getRemainingAmount());
                        int payAmount = 0;
                        if (pay.isEmpty()){
                            JOptionPane.showMessageDialog(mainP,"Insert data");
                        }else {
                            boolean valid = true;
                            try {
                                payAmount = Integer.parseInt(pay);
                            }catch (NumberFormatException exc){
                                JOptionPane.showMessageDialog(mainP, "Input invalid");
                                valid=false;
                            }finally {
                                if (valid){
                                    if (payAmount > idReal.getRemainingAmount()){
                                        JOptionPane.showMessageDialog(mainP,"Pay the right amount of money");
                                    } else if (payAmount<1) {
                                        JOptionPane.showMessageDialog(mainP,"Pay the right amount of money");
                                    }else {
                                        idReal.setRemainingAmount(idReal.getRemainingAmount()-payAmount);
                                        idReal.setHasPaid(true);
                                        JOptionPane.showMessageDialog(mainP,"All bills cleared");

                                    }
                                }
                            }
                        }

                    }
                }
            });
            functionB2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!idReal.getHasPaid()){
                        JOptionPane.showMessageDialog(mainP,"All bills not cleared");
                    }else {
                        JOptionPane.showMessageDialog(mainP,idReal.getStudentName()+" having enrollmentID "+idReal.getEnrollmentID()+" has successfully been removed");
                        int r =0;
                        while (true){
                            if (idReal.getEnrollmentID()==studentDetails.get(r).getEnrollmentID()){
                                studentDetails.remove(r);
                                break;
                            }
                            r++;
                        }
                        idReal.removeStudent();
                        mainF.remove(mainP);
                        studentLog();
                    }
                }
            });
        }
        g.gridy=0;
        g.gridx=0;
        g.ipadx=120;
        g.ipady=15;
        g.gridwidth=2;
        mainP.add(subP,g);
        backB.setBackground(backColor.darker());
        backB.setFocusable(false);
        backB.setBorder(null);
        g.ipadx=45;
        g.ipady=10;
        g.gridy=1;
        g.gridwidth=1;
        g.anchor = GridBagConstraints.EAST;
        mainP.add(functionB1,g);
        g.gridx=1;
        g.gridwidth=1;
        mainP.add(functionB2,g);
        g.gridy=2;
        g.gridx=0;
        g.gridwidth=2;
        g.anchor = GridBagConstraints.CENTER;
        mainP.add(backB,g);

        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainF.remove(mainP);
                studentLog();
            }
        });
        mainF.add(mainP);
        mainP.updateUI();
    }
    public boolean dateValid(JComboBox<String> year, JComboBox<String> month, JComboBox<String> day){
        return !(year.getSelectedIndex() == 0) && !(month.getSelectedIndex() == 0) && !(day.getSelectedIndex() == 0);
    }
    public boolean idExist(JTextField text){
        boolean exist = false;
        int i =0;
        if (studentDetails.isEmpty()){
            return false;
        }else {
            while (i< studentDetails.size()){
                if (studentDetails.get(i).getEnrollmentID()==Integer.parseInt(text.getText())){
                    exist=true;
                    break;
                }
                i++;
            }
        }
        return exist;
    }
    public void idAvailable(){
        int i =0;
        int initialIndex = 0;
        while (true){
            if (studentDetails.isEmpty()){
                break;
            }else {
                if(idTaken().length>i) {
                    if (enrollmentID > idTaken()[i]) {
                        ++i;
                        continue;
                    } else if (enrollmentID == idTaken()[i]) {
                        ++enrollmentID;
                        ++i;
                    } else {
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }
    public int[] idTaken(){
        int[] taken = new int[studentDetails.size()];
        if (!studentDetails.isEmpty()){
            for (int i = 0; i<studentDetails.size();i++){
                taken[i] = studentDetails.get(i).getEnrollmentID();
            }
        }
        Arrays.sort(taken);
        return taken;
    }
    public String date(JComboBox<String> year, JComboBox<String> month, JComboBox<String> day){
        return year.getSelectedItem()+" "+month.getSelectedItem()+" "+day.getSelectedItem();
    }
    public static void main(String[] args) {
        StudentGUI obj = new StudentGUI();
        obj.initiate();
    }
}

