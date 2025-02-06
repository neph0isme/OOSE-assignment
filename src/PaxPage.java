import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaxPage extends JFrame {
    
    private JTextField paxField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField emailField;
    private JButton confirmButton;

    public PaxPage() {
        setTitle("Pax Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel paxLabel = new JLabel("Choose pax: ");
        paxField = new JTextField(5);
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Number Phone: ");
        phoneField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        confirmButton = new JButton("Confirm");

        
        add(paxLabel);
        add(paxField);
        add(nameLabel);
        add(nameField);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); 
        add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String pax = paxField.getText();
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                
                JOptionPane.showMessageDialog(PaxPage.this, "Booking Confirmed!\n" +
                        "Pax: " + pax + "\n" +
                        "Name: " + name + "\n" +
                        "Phone: " + phone + "\n" +
                        "Email: " + email);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PaxPage());
    }
}
