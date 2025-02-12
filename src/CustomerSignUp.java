

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class CustomerSignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_fname;
	private JTextField txt_lname;
	private JTextField txt_phone;
	private JTextField txt_username;
	private JTextField txt_pass;
	private JTextField txt_email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSignUp frame = new CustomerSignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create New Account");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(208, 51, 262, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(194, 214, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(208, 255, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No.");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(208, 294, 94, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(208, 130, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(208, 172, 94, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Have an existing account?");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(231, 414, 191, 19);
		contentPane.add(lblNewLabel_7);
		
		JLabel lbl_login = new JLabel("Login");
		lbl_login.setForeground(Color.BLUE);
		lbl_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_login.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login.setBounds(406, 414, 64, 19);
		contentPane.add(lbl_login);
		
		lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new CustomerLogin().setVisible(true); 
                dispose(); 
            }
        });
		
		JButton btncreateacc = new JButton("CREATE ACCOUNT");
		btncreateacc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btncreateacc.setBounds(258, 374, 175, 29);
		contentPane.add(btncreateacc);
		
		txt_fname = new JTextField();
		txt_fname.setBounds(309, 213, 124, 20);
		contentPane.add(txt_fname);
		txt_fname.setColumns(10);
		
		txt_lname = new JTextField();
		txt_lname.setBounds(309, 254, 124, 20);
		contentPane.add(txt_lname);
		txt_lname.setColumns(10);
		
		txt_phone = new JTextField();
		txt_phone.setBounds(309, 293, 124, 20);
		contentPane.add(txt_phone);
		txt_phone.setColumns(10);
		
		txt_username = new JTextField();
		txt_username.setBounds(309, 129, 125, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_pass = new JTextField();
		txt_pass.setBounds(309, 171, 125, 20);
		contentPane.add(txt_pass);
		txt_pass.setColumns(10);
		
		txt_email = new JTextField();
		txt_email.setBounds(309, 331, 124, 20);
		contentPane.add(txt_email);
		txt_email.setColumns(10);
		
		JLabel lbl_email = new JLabel("Email");
		lbl_email.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_email.setBounds(253, 332, 49, 14);
		contentPane.add(lbl_email);
		
		JButton btnBack = new JButton("back");
		btnBack.setBounds(305, 503, 89, 23);
		contentPane.add(btnBack);
		
		btncreateacc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve User Inputs
                String firstName = txt_fname.getText();
                String lastName = txt_lname.getText();
                String phone = txt_phone.getText();
                String username = txt_username.getText();
                String password = txt_pass.getText();
                String email = txt_email.getText();
                // Create a New Customer Object
                Customer newCustomer = new Customer(username, firstName + " " + lastName, email, phone, password);

                // Add the new customer to the database
                database db = new database();
                db.addCustomer(newCustomer);

                // Optionally, show a confirmation message
                JOptionPane.showMessageDialog(null, "Account is created!");

                // Navigate to the login page after successful account creation
                new CustomerLogin().setVisible(true);
                dispose();  // Close the current frame
            }
        });
		
		btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserLoginAs().setVisible(true);
                dispose();
            }
        });
	}
}
