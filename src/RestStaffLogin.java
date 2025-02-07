
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;

public class RestStaffLogin extends JFrame {

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
					RestStaffLogin frame = new RestStaffLogin();
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
	public RestStaffLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login as Restaurant Staff");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(145, 97, 346, 37);
		contentPane.add(lbltitle);
		
		textField = new JTextField();
		textField.setBounds(308, 177, 129, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 218, 129, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblrest = new JLabel("Restaurant ID");
		lblrest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblrest.setHorizontalAlignment(SwingConstants.RIGHT);
		lblrest.setBounds(169, 178, 120, 14);
		contentPane.add(lblrest);
		
		JLabel lblpass = new JLabel("Password");
		lblpass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblpass.setBounds(212, 219, 77, 14);
		contentPane.add(lblpass);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnlogin.setBounds(309, 265, 77, 23);
		contentPane.add(btnlogin);
	}

}
