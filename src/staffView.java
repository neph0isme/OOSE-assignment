import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class staffView extends JFrame {
	public staffView(database database) {
		
		//Restaurant rest;
		
		 // Initialize a restaurant (assuming it's the first one in the database for now)
        Restaurant rest = database.getRestaurants().size() > 0 ? database.getRestaurants().get(0) : null;
		
		setTitle("Staff View");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JButton btnAllRes = new JButton("View All Reservation");
        btnAllRes.setBounds(54, 113, 172, 23);
        getContentPane().add(btnAllRes);
        
        JButton btnEditRestDetails = new JButton("Edit Restaurant Details");
        btnEditRestDetails.setBounds(54, 170, 172, 23);
        getContentPane().add(btnEditRestDetails);
        
        
        JLabel lblHeader = new JLabel("Staff View");
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHeader.setBounds(10, 43, 264, 14);
        getContentPane().add(lblHeader);
        
        JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setBounds(97, 227, 89, 23);
        getContentPane().add(btnLogOut);
        
        btnAllRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewAllReserve(database).setVisible(true);
                dispose();
            }
        });
        
        btnEditRestDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdRestDet(database, rest).setVisible(true);
                dispose();
            }
        });
        
        
        btnLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RestStaffLogin().setVisible(true);
                dispose();
            }
        });
        
	}
}
