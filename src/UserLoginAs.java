import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLoginAs extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginAs frame = new UserLoginAs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserLoginAs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login As...");
		lbltitle.setFont(new Font("Verdana", Font.BOLD, 18));
		lbltitle.setBounds(263, 90, 117, 72);
		contentPane.add(lbltitle);
		
		JButton btnstaff = new JButton("Restaurant Staff");
		btnstaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnstaff.setBounds(241, 223, 149, 23);
		contentPane.add(btnstaff);
		
		btnstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Staff button clicked!");
				try {
		            new RestStaffLogin().setVisible(true);
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});

		JButton btncust = new JButton("Customer");
		btncust.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btncust.setBounds(241, 279, 149, 23);
		contentPane.add(btncust);
		
		btncust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Cust button clicked!");
				try {
		            new CustomerLogin().setVisible(true);
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});

		
		
		
	}
}
