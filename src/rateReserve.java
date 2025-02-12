import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class rateReserve extends JFrame {
	
	private Customer customer;
	private database db = new database();
	
    public rateReserve() {
    	
    	
    	getContentPane().setBackground(new Color(128, 255, 255));
    	
        setTitle("Reservation Rating");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 364); // Set the size of the window
        setLocationRelativeTo(null); // Center the window on the screen
        getContentPane().setLayout(null);
        
        Panel panel = new Panel();
        panel.setBackground(new Color(0, 128, 255));
        panel.setBounds(0, 0, 211, 76);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Rate and Review");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(10, 0, 191, 76);
        panel.add(lblNewLabel);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblNewLabel_1 = new JLabel("Rate from 1 to 5 Star");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(11, 82, 192, 38);
        getContentPane().add(lblNewLabel_1);
        
        JRadioButton rdbtnOne = new JRadioButton("1 STAR");
        rdbtnOne.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnOne.setBounds(10, 134, 192, 23);
        getContentPane().add(rdbtnOne);
        
        JRadioButton rdbtnTwo = new JRadioButton("2 STAR");
        rdbtnTwo.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTwo.setBounds(10, 160, 192, 23);
        getContentPane().add(rdbtnTwo);
        
        JRadioButton rdbtnThree = new JRadioButton("3 STAR");
        rdbtnThree.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnThree.setBounds(10, 186, 192, 23);
        getContentPane().add(rdbtnThree);
        
        JRadioButton rdbtnFour = new JRadioButton("4 STAR");
        rdbtnFour.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFour.setBounds(10, 212, 192, 23);
        getContentPane().add(rdbtnFour);
        
        JRadioButton rdbtnFive = new JRadioButton("5 STAR");
        rdbtnFive.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFive.setBounds(10, 238, 192, 23);
        getContentPane().add(rdbtnFive);
        
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(64, 294, 89, 23);
        getContentPane().add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            

			@Override
            public void actionPerformed(ActionEvent e) {
				new viewReserve(customer, db).setVisible(true);
                dispose();
            }
        });
    }
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                rateReserve frame = new rateReserve();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
