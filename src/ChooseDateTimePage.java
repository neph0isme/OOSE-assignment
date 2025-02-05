import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseDateTimePage extends JFrame{
	public ChooseDateTimePage() {
		
		JButton btnNewButton = new JButton("Back ");
		btnNewButton.setBounds(10, 10, 83, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("SELECT DATE:");
		lblNewLabel.setBounds(60, 95, 83, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT TIME:");
		lblNewLabel_1.setBounds(60, 209, 83, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FROM:");
		lblNewLabel_2.setBounds(91, 236, 31, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO:");
		lblNewLabel_3.setBounds(104, 266, 18, 13);
		getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 232, 93, 21);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(130, 262, 93, 21);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(130, 138, 93, 21);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(300, 138, 93, 21);
		getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(470, 138, 93, 21);
		getContentPane().add(comboBox_4);
		
		JLabel lblNewLabel_4 = new JLabel("YEAR");
		lblNewLabel_4.setBounds(91, 142, 31, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MONTH");
		lblNewLabel_5.setBounds(250, 142, 45, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DAY");
		lblNewLabel_6.setBounds(437, 142, 31, 13);
		getContentPane().add(lblNewLabel_6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
