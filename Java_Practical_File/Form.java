import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    private JLabel nameLabel, emailLabel, genderLabel, addressLabel;
    private JTextField nameField, emailField;
    private Choice genderChoice;
    private JTextArea addressArea;
    private JButton submitButton, exitButton;

    public Form() {
        nameLabel = new JLabel("Name          :");
        nameField = new JTextField(10);

        emailLabel = new JLabel("Email          :");
        emailField = new JTextField(10);

        genderLabel = new JLabel("Gender        :");
        genderChoice = new Choice();
        genderChoice.addItem("Male");
        genderChoice.addItem("Female");

        addressLabel = new JLabel("Address         :");
        addressArea = new JTextArea();

        submitButton = new JButton("Submit");
        exitButton = new JButton("Exit");

        setLayout(new GridLayout(5, 2, 10, 10));
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(genderLabel);
        add(genderChoice);
        add(addressLabel);
        add(addressArea);
        add(submitButton);
        add(exitButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Form();
            }
        });
    }
}
