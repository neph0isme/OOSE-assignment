import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffBookingList extends JFrame {
    
    private JTable bookingTable;
    private DefaultTableModel tableModel;
    private JTextField paxField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField emailField;

    public StaffBookingList() {
        setTitle("Staff Booking List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create table model with column names
        String[] columnNames = {"Pax", "Name", "Phone", "Email"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookingTable = new JTable(tableModel);
        
        // Create a scroll pane for the table
        JScrollPane scrollPane = new JScrollPane(bookingTable);
        add(scrollPane, BorderLayout.CENTER);

        // Create a panel for adding new bookings
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Choose Pax: "));
        paxField = new JTextField();
        inputPanel.add(paxField);
        
        inputPanel.add(new JLabel("Name: "));
        nameField = new JTextField();
        inputPanel.add(nameField);
        
        inputPanel.add(new JLabel("Phone: "));
        phoneField = new JTextField();
        inputPanel.add(phoneField);
        
        inputPanel.add(new JLabel("Email: "));
        emailField = new JTextField();
        inputPanel.add(emailField);
        
        JButton addButton = new JButton("Add Booking");
        inputPanel.add(addButton);
        
        add(inputPanel, BorderLayout.NORTH); // Add input panel to the top

        // Create a button panel
        JPanel buttonPanel = new JPanel();
        JButton refreshButton = new JButton("Refresh");
        JButton closeButton = new JButton("Close");

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBooking();
            }
        });

        refreshButton.addActionListener(e -> refreshBookingList());
        closeButton.addActionListener(e -> dispose()); // Close the window

        buttonPanel.add(refreshButton);
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void addBooking() {
        String pax = paxField.getText();
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        // Validate input
        if (pax.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Add the new booking to the table
        tableModel.addRow(new Object[]{pax, name, phone, email});

        // Clear input fields
        paxField.setText("");
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }

    private void refreshBookingList() {
        // In a real application, you would refresh the data from the database
        JOptionPane.showMessageDialog(this, "Booking list refreshed!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StaffBookingList());
    }
}