import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class staffView extends JFrame {
	private String staffID;
	private database db;
	
	public staffView(database db, String staffID) {
		getContentPane().setBackground(new Color(255, 128, 192));
		
		this.db = db; //simpan data ref
	    this.staffID = staffID;
		Restaurant rest = db.getRestaurantByStaffID(staffID); // Implement this method
		
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
                new viewAllReserve(db, staffID).setVisible(true);
                dispose();
            }
        });
        
        btnEditRestDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdRestDet(db, rest).setVisible(true);
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
