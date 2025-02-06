import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class viewReservation extends JFrame{
	public JFrame frame;
	public JPanel mainPanel;
	public CardLayout cardLayout;
    public DefaultTableModel tableModelins;
	
	public viewReservation() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Reservation");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 63, 568, 32);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.setBounds(59, 189, 115, 45);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.setBounds(244, 189, 115, 45);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RATE");
		btnNewButton_2.setBounds(417, 189, 115, 45);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setBounds(10, 11, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(64, 131, 468, 22);
		getContentPane().add(textArea);
		
		
		frame = new JFrame("View Reservation");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new CardLayout());
	}
}

