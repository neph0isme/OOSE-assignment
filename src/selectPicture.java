import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selectPicture extends JFrame {
	private JTextField txtRating;
	private JTextField txtRatingCuisine;
	public selectPicture() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(10, 10, 94, 33);
		getContentPane().add(btnNewButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(608, 79, 27, 272);
		getContentPane().add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("PIC1");
		lblNewLabel.setBounds(62, 108, 343, 87);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PIC2");
		lblNewLabel_1.setBounds(62, 213, 343, 87);
		getContentPane().add(lblNewLabel_1);
		
		txtRating = new JTextField();
		txtRating.setText("Rating:\r\n\r\n\r\nCuisine:");
		txtRating.setBounds(415, 108, 172, 87);
		getContentPane().add(txtRating);
		txtRating.setColumns(10);
		
		txtRatingCuisine = new JTextField();
		txtRatingCuisine.setText("Rating:\r\n\r\n\r\nCuisine:");
		txtRatingCuisine.setBounds(415, 213, 172, 87);
		getContentPane().add(txtRatingCuisine);
		txtRatingCuisine.setColumns(10);
	}
}
