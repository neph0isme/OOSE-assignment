
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class RestStaffLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_restid;
	private JTextField txt_pass;
	private database db = new database();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestStaffLogin frame = new RestStaffLogin();
					frame.setVisible(true);
					//dispose();
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
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login as Restaurant Staff");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(145, 97, 346, 37);
		contentPane.add(lbltitle);
		
		txt_restid = new JTextField();
		txt_restid.setBounds(308, 177, 129, 20);
		contentPane.add(txt_restid);
		txt_restid.setColumns(10);
		
		txt_pass = new JTextField();
		txt_pass.setBounds(308, 218, 129, 20);
		contentPane.add(txt_pass);
		txt_pass.setColumns(10);
		
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
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnlogin.setBounds(310, 263, 89, 23);
		contentPane.add(btnlogin);
		
		btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String restID = txt_restid.getText();
                String password = txt_pass.getText();

                if (db.validateStaffLogin(restID, password)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    //dispose(); 
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Login Unsuccessful");
                }
            }
        });
	}
}
