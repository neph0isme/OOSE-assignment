import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
		setTitle("OpenTable");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Login As...");
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("Verdana", Font.PLAIN, 18));
		lbltitle.setBounds(20, 235, 604, 72);
		contentPane.add(lbltitle);
		
		JButton btnstaff = new JButton("Restaurant Staff");
		btnstaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnstaff.setBounds(243, 318, 149, 23);
		contentPane.add(btnstaff);
		
		btnstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Staff button clicked!");
				try {
		            new RestStaffLogin().setVisible(true);
		            dispose();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});

		JButton btncust = new JButton("Customer");
		btncust.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btncust.setBounds(243, 374, 149, 23);
		contentPane.add(btncust);
		
		JLabel lblWelcomeTo = new JLabel("Welcome To");
		lblWelcomeTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setBounds(10, 51, 614, 40);
		contentPane.add(lblWelcomeTo);
		
		JLabel lblOpenTable = new JLabel("OpenTable");
		lblOpenTable.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblOpenTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpenTable.setBounds(10, 106, 604, 72);
		contentPane.add(lblOpenTable);
		
		btncust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Cust button clicked!");
				try {
		            new CustomerLogin().setVisible(true);
		            dispose();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});

		
		
		
	}
}
