import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaxPage extends JFrame {
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField emailField;
    private JButton confirmButton;
    private JButton backButton; 
    private JSpinner paxSpinner;
    
    private database db;
    private Reservation reservation;

    public PaxPage(Reservation reservation, database db) {
        this.reservation = reservation; // Ensure reservation is stored
        this.db = db; // Ensure db is stored
        
        setBackground(new Color(128, 255, 255));
        setTitle("Pax Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(new Color(128, 255, 255));
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(75, 20)); 
        backButtonPanel.add(backButton); 
        
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5)); 
        formPanel.setBackground(new Color(128, 255, 255));
        
        JLabel paxLabel = new JLabel("Choose pax: ");
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Number Phone: ");
        phoneField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        
        confirmButton = new JButton("Confirm");
        confirmButton.setPreferredSize(new Dimension(100, 25));

        formPanel.add(paxLabel);
        paxSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)); // Minimum pax = 1
        formPanel.add(paxSpinner);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        
        // Panel for confirm button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(128, 255, 255));
        buttonPanel.add(confirmButton);
        formPanel.add(new JLabel()); // Empty label for spacing
        formPanel.add(buttonPanel);

        getContentPane().add(backButtonPanel, BorderLayout.NORTH); 
        getContentPane().add(formPanel, BorderLayout.CENTER); 
        
        // ✅ Confirm button updates reservation details before proceeding
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateReservationDetails();
                PaxPage.this.dispose();
                new depositPayment(reservation, db).setVisible(true);
            }
        });

        // ✅ Back button returns to ChooseDateTimePage
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaxPage.this.dispose();
                new ChooseDateTimePage(reservation, db).setVisible(true);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateReservationDetails() {
        // Get user inputs
        int pax = (int) paxSpinner.getValue();
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String email = emailField.getText().trim();

        // ✅ Ensure fields are not empty before updating reservation
        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Missing Information", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // ✅ Update reservation object
        reservation.setReservePax(pax);
        reservation.setCustName(name);
        reservation.setCustPhone(phone);
        reservation.setCustEmail(email);

        // ✅ Store the updated reservation in the database
        db.addReservation(reservation);

        JOptionPane.showMessageDialog(this, "Reservation details saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
