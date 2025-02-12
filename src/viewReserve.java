import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewReserve extends JFrame {
	//private static CustomerController customerController;
	private database db = new database();
	private DefaultTableModel tableModel;
	private JTable bookingTable;
	private static Customer loggedInCustomer;
	
    public viewReserve(Customer customer) {
    	
    	
    	this.loggedInCustomer = customer;
    	
        setTitle("View Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 376);
        setLocationRelativeTo(null); // Centers the window on the screen
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("View Reservation");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 63, 568, 32);
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
        
        String[] columnNames = {"Pax", "Name", "Phone", "Email"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookingTable = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(59, 116, 468, 114);
        getContentPane().add(scrollPane);

        // Add action listeners to the buttons
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new cancelReserve().setVisible(true);
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
                new custOption(loggedInCustomer,db).setVisible(true);
                dispose();
            }
        });
    }
}
