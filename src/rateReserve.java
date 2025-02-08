import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class rateReserve extends JFrame {
	
    public rateReserve() {
    	
        setTitle("Reservation Rating");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 426); // Set the size of the window
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
        lblNewLabel_1.setBounds(6, 148, 192, 38);
        getContentPane().add(lblNewLabel_1);
        
        JRadioButton rdbtnOne = new JRadioButton("1 STAR");
        rdbtnOne.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnOne.setBounds(6, 193, 192, 23);
        getContentPane().add(rdbtnOne);
        
        JRadioButton rdbtnTwo = new JRadioButton("2 STAR");
        rdbtnTwo.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTwo.setBounds(6, 219, 192, 23);
        getContentPane().add(rdbtnTwo);
        
        JRadioButton rdbtnThree = new JRadioButton("3 STAR");
        rdbtnThree.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnThree.setBounds(6, 245, 192, 23);
        getContentPane().add(rdbtnThree);
        
        JRadioButton rdbtnFour = new JRadioButton("4 STAR");
        rdbtnFour.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFour.setBounds(6, 271, 192, 23);
        getContentPane().add(rdbtnFour);
        
        JRadioButton rdbtnFive = new JRadioButton("5 STAR");
        rdbtnFive.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFive.setBounds(6, 297, 192, 23);
        getContentPane().add(rdbtnFive);
        
        JLabel lblRestaurantName = new JLabel("New label");
        lblRestaurantName.setHorizontalAlignment(SwingConstants.CENTER);
        lblRestaurantName.setBounds(6, 105, 192, 14);
        getContentPane().add(lblRestaurantName);
        
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(60, 353, 89, 23);
        getContentPane().add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerController customerController = new CustomerController(null, null);
				new viewReserve(customerController).setVisible(true);
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
