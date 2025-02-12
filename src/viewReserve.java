import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class viewReserve extends JFrame {
	
    private database db;
    //private DefaultTableModel model;
    private JTable reservationTable;
	private Customer loggedInCustomer;
    

    public viewReserve(Customer customer, database db) {
        this.loggedInCustomer = customer;
        this.db = db;

        setTitle("View Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 376);
        setLocationRelativeTo(null); // Centers the window on the screen
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("View Reservation");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 568, 32);
        getContentPane().add(lblNewLabel);

        JButton btnCancel = new JButton("CANCEL");
        btnCancel.setBounds(59, 258, 115, 45);
        getContentPane().add(btnCancel);

        JButton btnEdit = new JButton("EDIT");
        btnEdit.setBounds(234, 258, 115, 45);
        getContentPane().add(btnEdit);

        JButton btnRate = new JButton("RATE");
        btnRate.setBounds(420, 258, 115, 45);
        getContentPane().add(btnRate);

        JButton btnBack = new JButton("BACK");
        btnBack.setBounds(10, 11, 89, 23);
        getContentPane().add(btnBack);

        // Column names for the table
        String[] columnNames = {"Reservation ID", "Restaurant ID", "Pax", "Date", "Start Time", "End Time", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        reservationTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(reservationTable);
        scrollPane.setBounds(59, 54, 468, 180); // Adjusted bounds to center the table
        getContentPane().add(scrollPane);

        // Load reservations for the logged-in customer
        loadReservations();

        // Add action listeners to the buttons
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new cancelReserve(customer, db).setVisible(true);
                dispose();
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new editReservation().setVisible(true);
                dispose();
            }
        });

        btnRate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new rateReserve().setVisible(true);
                dispose();
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new custOption(loggedInCustomer, db).setVisible(true);
                dispose();
            }
        });
    }
    
    

    // Method to load reservations for the logged-in customer
    private void loadReservations() {
        
    	ArrayList<Reservation> reservations = db.getReservationsForCustomer(loggedInCustomer);
        
    	// DEBUGGING: Print reservations fetched for the customer
    	System.out.println("Reservations for customer: " + loggedInCustomer.getEmail());
    	for (Reservation r : reservations) {
    	    System.out.println(r.getReserveID() + " - " + r.getCustEmail() + " - " + r.getDate());
    	}
    	
    	// Update Table
        DefaultTableModel model = (DefaultTableModel) reservationTable.getModel();
        model.setRowCount(0);
    	
    	for (Reservation r : reservations) {
            if (r.getCustEmail().equals(loggedInCustomer.getEmail())) {
                Object[] rowData = {
                        r.getReserveID(),
                        r.getRestaurantID(),
                        r.getReservePax(),
                        r.getDate(),
                        r.getStartTime(),
                        r.getEndTime(),
                        r.isReserveStatus() ? "Confirmed" : "Pending"
                };
                model.addRow(rowData);
            }
        }
    }
}