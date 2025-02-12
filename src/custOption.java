import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
public class custOption extends JFrame {
	
	//private CustomerController customerController;
	 private Customer loggedInCustomer;
	 private database db;

	    public custOption(Customer customer, database db) {
	        this.loggedInCustomer = customer;
	        this.db = db;

	        setTitle("Customer Options");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        setLocationRelativeTo(null);
	        getContentPane().setLayout(null);

	        // Existing "View Reservation" button
	        JButton btnViewReservation = new JButton("View Reservation");
	        btnViewReservation.setBounds(100, 50, 200, 30);
	        getContentPane().add(btnViewReservation);

	        // Add action listener to the existing button
	        btnViewReservation.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Open the viewReserve frame with the logged-in customer and database
	                new viewReserve(loggedInCustomer, db).setVisible(true);
	                dispose(); // Close the current frame
	            }
	        });
    	
    	//Customer firstCustomer = customers.isEmpty() ? null : customers.get(0); // Get first customer or null
        //String customerName = (firstCustomer != null) ? firstCustomer.getName() : "Guest";

        getContentPane().setBackground(new Color(128, 255, 255));
        setTitle("Pick Your Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JButton btnViewRest = new JButton("View Restaurant");
        btnViewRest.setBounds(67, 119, 158, 23);
        getContentPane().add(btnViewRest);

        JButton btnViewReserve = new JButton("View Reserve");
        btnViewReserve.setBounds(67, 174, 158, 23);
        getContentPane().add(btnViewReserve);
        
        JLabel lblText = new JLabel("Welcome,");
        lblText.setHorizontalAlignment(SwingConstants.TRAILING);
        lblText.setBounds(54, 57, 76, 14);
        getContentPane().add(lblText);

        JLabel lblName = new JLabel(customer != null ? customer.getName() : "Guest");
        lblName.setBounds(140, 57, 103, 14);
        getContentPane().add(lblName);

        // View Restaurant Button
        
        btnViewRest.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                new selectPicture(db).setVisible(true);
                dispose();
            }
        	
        });

   
    }

	
}
