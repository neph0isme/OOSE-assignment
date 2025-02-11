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
    private database db;

    public PaxPage() {
    	setBackground(new Color(128, 255, 255));
        db = new database(); 

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
        confirmButton.setPreferredSize(new Dimension(100, 25)); // Set preferred size for the confirm button

        formPanel.add(paxLabel);
        
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
        formPanel.add(spinner);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        
        // Create a panel for the confirm button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(128, 255, 255));
        buttonPanel.add(confirmButton);
        formPanel.add(new JLabel()); // Empty label for spacing
        formPanel.add(buttonPanel); // Add button panel to form

        getContentPane().add(backButtonPanel, BorderLayout.NORTH); 
        getContentPane().add(formPanel, BorderLayout.CENTER); 
        
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	PaxPage.this.dispose();
                new depositPayment().setVisible(true);
            }
        });

        // Action listener for the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaxPage.this.dispose();
                new ChooseDateTimePage().setVisible(true); // Assuming this class exists
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