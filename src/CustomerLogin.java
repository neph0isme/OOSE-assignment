

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class CustomerLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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

	/**
	 * Create the frame.
	 */
	public CustomerLogin() {
		
		setTitle("Customer Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login as Customer");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(182, 97, 294, 37);
		contentPane.add(lbltitle);
		
		JLabel lblun = new JLabel("Username");
		lblun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblun.setBounds(197, 178, 92, 14);
		contentPane.add(lblun);
		
		JLabel lblpass = new JLabel("Password");
		lblpass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblpass.setBounds(212, 219, 77, 14);
		contentPane.add(lblpass);
		
		textField = new JTextField();
		textField.setBounds(299, 177, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(299, 218, 132, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Do not have an account yet? ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(212, 326, 242, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_CNA = new JLabel("Create an account");
		lbl_CNA.setForeground(Color.BLUE);
		lbl_CNA.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CNA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_CNA.setBounds(271, 351, 140, 14);
		contentPane.add(lbl_CNA);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(299, 266, 89, 23);
		contentPane.add(btnNewButton);
	}
}
