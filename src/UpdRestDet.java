

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;

//POV RESTAURANT STAFF to update details of the restaurant
public class UpdRestDet extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdRestDet frame = new UpdRestDet();
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
	public UpdRestDet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblt = new JLabel("RESTAURANT DETAILS");
		lblt.setBounds(274, 40, 117, 14);
		contentPane.add(lblt);
		
		JLabel lblNewLabel = new JLabel("Restaurant Name");
		lblNewLabel.setBounds(161, 107, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Cuisine");
		lblNewLabel_1.setBounds(161, 143, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Location");
		lblNewLabel_2.setBounds(161, 185, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(245, 217, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Pax");
		lblNewLabel_3.setBounds(161, 220, 89, 14);
		contentPane.add(lblNewLabel_3);
	}
}
