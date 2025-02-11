import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class StaffBookingList extends JFrame {
    
    private JTable bookingTable;
    private DefaultTableModel tableModel;
    private database db; // Instance of the database class

    public StaffBookingList() {
    	setBackground(new Color(255, 128, 192));
        db = new database(); // Initialize the database instance

        setTitle("Staff Booking List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        // Create table model with column names
        String[] columnNames = {"Pax", "Name", "Phone", "Email"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookingTable = new JTable(tableModel);
        
        // Create a scroll pane for the table
        JScrollPane scrollPane = new JScrollPane(bookingTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Create a button panel
        JPanel buttonPanel = new JPanel();
        JButton refreshButton = new JButton("Refresh");
        JButton closeButton = new JButton("Close");

        // Add action listeners
        refreshButton.addActionListener(e -> refreshBookingList());
        closeButton.addActionListener(e -> dispose()); // Close the window

        buttonPanel.add(refreshButton);
        buttonPanel.add(closeButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Load initial booking data
        refreshBookingList();

        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void refreshBookingList() {
        // Clear the current table data
        tableModel.setRowCount(0);

        // Retrieve customers from the database
        ArrayList<Customer> customers = db.getCustomers(); // Assuming this method returns a list of customers

        // Populate the table with customer data
        for (Customer customer : customers) {
            // Assuming you want to display the customer's details
            tableModel.addRow(new Object[]{
                "1", // Pax - You can replace this with actual pax data if available
                customer.getName(),
                customer.getPhoneNumber(),
                customer.getEmail()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StaffBookingList());
    }
}