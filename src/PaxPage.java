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
    private JButton backButton; 
    private database db; // Instance of the database class

    public PaxPage() {
        db = new database(); // Initialize the database instance

        setTitle("Pax Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(75, 20)); 
        backButtonPanel.add(backButton); 
        
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5)); 
        JLabel paxLabel = new JLabel("Choose pax: ");
        paxField = new JTextField(5);
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Number Phone: ");
        phoneField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        confirmButton = new JButton("Confirm");

        formPanel.add(paxLabel);
        formPanel.add(paxField);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(new JLabel()); 
        formPanel.add(confirmButton);

        add(backButtonPanel, BorderLayout.NORTH); 
        add(formPanel, BorderLayout.CENTER); 
        
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pax = paxField.getText();
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                
                // Here you can add logic to save the booking to the database
                // For example, you could create a new Customer object and add it to the database
                // db.addCustomer(new Customer(...));

                JOptionPane.showMessageDialog(PaxPage.this, "Booking Confirmed!\n" +
                        "Pax: " + pax + "\n" +
                        "Name: " + name + "\n" +
                        "Phone: " + phone + "\n" +
                        "Email: " + email);
            }
        });

        // Action listener for the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaxPage.this.dispose();
                new ChooseDateTimePage(); // Assuming this class exists
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