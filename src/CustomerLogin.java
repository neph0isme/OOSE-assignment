

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

public class CustomerLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final boolean True = false;
	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_pass;
	private database db = new database();

	

	/**
	 * Create the frame.
	 */
	public CustomerLogin() {
		
		setTitle("Customer Login");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login as Customer");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(170, 97, 294, 37);
		contentPane.add(lbltitle);
		
		JLabel lblun = new JLabel("Username");
		lblun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblun.setBounds(181, 178, 92, 14);
		contentPane.add(lblun);
		
		JLabel lblpass = new JLabel("Password");
		lblpass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblpass.setBounds(196, 219, 77, 14);
		contentPane.add(lblpass);
		
		txt_username = new JTextField();
		txt_username.setBounds(283, 177, 132, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_pass = new JTextField();
		txt_pass.setBounds(283, 218, 132, 20);
		contentPane.add(txt_pass);
		txt_pass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Do not have an account yet? ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(196, 326, 242, 25);
		contentPane.add(lblNewLabel);
		
		//label to get to customer sign up page
		JLabel lbl_CNA = new JLabel("Create an account");
		lbl_CNA.setForeground(Color.BLUE);
		lbl_CNA.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CNA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_CNA.setBounds(255, 351, 140, 14);
		contentPane.add(lbl_CNA);
		
		lbl_CNA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new CustomerSignUp().setVisible(true); // Open the registration window
                dispose(); // Close the current login window
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbl_CNA.setForeground(Color.BLACK); // Change color when hovered
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbl_CNA.setForeground(Color.BLUE); // Restore original color
            }
        });
		
		
		//login button
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnlogin.setBounds(283, 266, 89, 23);
		contentPane.add(btnlogin);
		
		JButton btnBack = new JButton("back");
		btnBack.setBounds(283, 407, 89, 23);
		contentPane.add(btnBack);
		
		btnlogin.addActionListener(e -> {
            String username = txt_username.getText();
            String password = txt_pass.getText();

            if (db.validateCustomerLogin(username, password)) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new custOption(db.c2).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login Unsuccessfull");
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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
