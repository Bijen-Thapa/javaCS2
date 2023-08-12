import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LoginSignUp {

    ArrayList<User> usersList = new ArrayList<>();

    public void loginScreen(){
        JFrame frame = new JFrame("Login Screen");

        JPanel panel = new JPanel();
        panel.setSize(400, 300);
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JLabel messageLabel = new JLabel();
        JLabel attemptsLabel = new JLabel("0 attempts");
        JTextField usernameTf = new JTextField(15);
        JTextField passwordTf = new JTextField(15);
        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Signup");

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // taking longer width
        panel.add(messageLabel, gbc);
        gbc.gridwidth = 1; // taking single width
        gbc.gridy = 1; // Next line/row
        panel.add(usernameLabel, gbc);
        gbc.gridx = 1; // Next column/Side
        panel.add(usernameTf, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2; // Next line
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1; // Next column/Side
        panel.add(passwordTf, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3; // Next line
        panel.add(loginButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4; // Next line
        panel.add(signupButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameTf.getText().equals("") ||  passwordTf.getText().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please enter value on textfields");
                }else{
                    boolean userExists = false;
                    for (User user:usersList
                    ) {
                        // Compares if username is already available in arraylist or not using foreach loop
                        if(usernameTf.getText().equals(user.username)){
                            // Compares password of that particular user whose username is matched.
                            if(passwordTf.getText().equals(user.password)){
                                JOptionPane.showMessageDialog(frame,"Welcome to ICP "+user.name);
                            }else{
                                JOptionPane.showMessageDialog(frame,"Credentials are incorrect");
                            }

                            // Changes to user exists to true and end the loop because there can't be another user with same username
                            userExists = true;
                            break;
                        }
                    }

                    // Checks if user exists or not
                    if(!userExists){
                        JOptionPane.showMessageDialog(frame,"No user found");
                    }
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                signUpScreen();
            }
        });


        frame.add(panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void signUpScreen(){
        JFrame frame = new JFrame("Register Screen");

        JPanel panel = new JPanel();
        panel.setSize(400, 300);

        JLabel nameLabel = new JLabel("Name");
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");

        JTextField nameTf = new JTextField(15);
        JTextField usernameTf = new JTextField(15);
        JTextField passwordTf = new JTextField(15);
        JButton signupButton = new JButton("Signup");
        JButton backButton = new JButton("Back");

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        gbc.gridx = 0;
        gbc.gridy = 0;// taking longer width
        panel.add(nameLabel, gbc);
        gbc.gridx = 1; // Next column/Side
        panel.add(nameTf, gbc);
        gbc.gridwidth = 1; // taking single width
        gbc.gridx = 0; // Next column/Side
        gbc.gridy = 1; // Next line/row
        panel.add(usernameLabel, gbc);
        gbc.gridx = 1; // Next column/Side
        panel.add(usernameTf, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2; // Next line
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1; // Next column/Side
        panel.add(passwordTf, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3; // Next line
        panel.add(signupButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4; // Next line
        panel.add(backButton, gbc);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameTf.getText().equals("") || nameTf.getText().equals("")|| passwordTf.getText().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please enter value on textfields");
                }else{
                    boolean userExists = false;
                    for (User user:usersList
                         ) {

                        // Compares if username is already available in arraylist or not using foreach loop
                        if(usernameTf.getText().equals(user.username)){
                            userExists = true;
                            break;
                        }
                    }

                    // Checks if user exists or not
                    if(userExists){
                        JOptionPane.showMessageDialog(frame,"User Already Exists");
                    }else{
                        User user = new User(nameTf.getText(), usernameTf.getText(), passwordTf.getText());
                        usersList.add(user); // Add user to arrayList
                        JOptionPane.showMessageDialog(frame,"Successfully Registered");
                    }
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                loginScreen();
            }
        });


        // This is when user clicks cross button in signup screen
        frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("Closing the frame...");
                    frame.dispose();
                    loginScreen();
                }
            });


        frame.add(panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }



    public void addDummyUsers(){
        // Add a user to the arraylist - usersList
        usersList.add(new User("Administrations", "admin","admin"));

    }

    public static void main(String[] args) {
            LoginSignUp loginSignUp = new LoginSignUp();
            loginSignUp.addDummyUsers();

            loginSignUp.loginScreen();


   }

}
