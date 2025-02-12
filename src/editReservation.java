import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class editReservation extends JFrame{
	private JTextField textField;
	private JTextField textName;
	private JTextField textNumber;
	private JTextField textField_1;
	private Customer customer;
	private database db = new database();
	
	public editReservation() {
		getContentPane().setBackground(new Color(128, 255, 255));
		setTitle("Edit Reservation Details");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(600, 265);
	    setLocationRelativeTo(null); // Centers the window on the screen
	    getContentPane().setLayout(null);
	    
	    JButton btnBack = new JButton("Back");
	    btnBack.setBounds(10, 11, 89, 23);
	    getContentPane().add(btnBack);
	    
	    JLabel lblEditPax = new JLabel("Edit Pax Number:");
	    lblEditPax.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblEditPax.setBounds(10, 51, 210, 14);
	    getContentPane().add(lblEditPax);
	    
	    textField = new JTextField();
	    textField.setBounds(218, 45, 43, 20);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblPaxNumber = new JLabel("Pax");
	    lblPaxNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblPaxNumber.setBounds(268, 48, 46, 14);
	    getContentPane().add(lblPaxNumber);
	    
	    JLabel lblName = new JLabel("Name:");
	    lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblName.setBounds(10, 77, 210, 14);
	    getContentPane().add(lblName);
	    
	    textName = new JTextField();
	    textName.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textName.setBounds(218, 76, 352, 20);
	    getContentPane().add(textName);
	    textName.setColumns(10);
	    
	    JLabel lblNumber = new JLabel("Number Phone:");
	    lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNumber.setBounds(10, 105, 210, 14);
	    getContentPane().add(lblNumber);
	    
	    textNumber = new JTextField();
	    textNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textNumber.setColumns(10);
	    textNumber.setBounds(218, 104, 352, 20);
	    getContentPane().add(textNumber);
	    
	    JLabel lblEmail = new JLabel("Email:");
	    lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblEmail.setBounds(10, 131, 210, 14);
	    getContentPane().add(lblEmail);
	    
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textField_1.setColumns(10);
	    textField_1.setBounds(218, 130, 352, 20);
	    getContentPane().add(textField_1);
	    
	    JButton btnNewButton = new JButton("Done");
	    btnNewButton.setBounds(481, 185, 89, 23);
	    getContentPane().add(btnNewButton);
	    
	    btnNewButton.addActionListener(e -> {
	    	JOptionPane.showMessageDialog(this, "Edited Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new viewReserve(customer, db).setVisible(true);
            dispose();
        });
	    
	    btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewReserve(customer, db).setVisible(true);
                dispose();
            }
        });
	    
	}
	
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    editReservation frame = new editReservation();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
