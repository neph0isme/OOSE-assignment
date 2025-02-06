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
	public editReservation() {
		setTitle("Edit Reservation Details");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(700, 500);
	    setLocationRelativeTo(null); // Centers the window on the screen
	    getContentPane().setLayout(null);
	    
	    JButton btnBack = new JButton("Back");
	    btnBack.setBounds(10, 11, 89, 23);
	    getContentPane().add(btnBack);
	    
	    JLabel lblEditPax = new JLabel("Edit Pax Number:");
	    lblEditPax.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblEditPax.setBounds(53, 89, 210, 14);
	    getContentPane().add(lblEditPax);
	    
	    textField = new JTextField();
	    textField.setBounds(261, 83, 43, 20);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblPaxNumber = new JLabel("Pax");
	    lblPaxNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblPaxNumber.setBounds(311, 86, 46, 14);
	    getContentPane().add(lblPaxNumber);
	    
	    JLabel lblName = new JLabel("Name:");
	    lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblName.setBounds(53, 115, 210, 14);
	    getContentPane().add(lblName);
	    
	    textName = new JTextField();
	    textName.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textName.setBounds(261, 114, 352, 20);
	    getContentPane().add(textName);
	    textName.setColumns(10);
	    
	    JLabel lblNumber = new JLabel("Number Phone:");
	    lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNumber.setBounds(53, 143, 210, 14);
	    getContentPane().add(lblNumber);
	    
	    textNumber = new JTextField();
	    textNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textNumber.setColumns(10);
	    textNumber.setBounds(261, 142, 352, 20);
	    getContentPane().add(textNumber);
	    
	    JLabel lblEmail = new JLabel("Email:");
	    lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblEmail.setBounds(53, 169, 210, 14);
	    getContentPane().add(lblEmail);
	    
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textField_1.setColumns(10);
	    textField_1.setBounds(261, 168, 352, 20);
	    getContentPane().add(textField_1);
	    
	    btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewReserve().setVisible(true);
                dispose();
            }
        });
	    
	    
	    
	}
}
