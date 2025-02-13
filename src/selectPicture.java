import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class selectPicture extends JFrame {
    
    
	private static final long serialVersionUID = 1L;
	private Reservation reservation;
	private database db;

    public selectPicture(database db) {
        this.db = db; // Pass the database instance

        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

        // Load and resize the first image
        ImageIcon originalIcon1 = new ImageIcon("picture\\PASTA GUI.png");
        Image img1 = originalIcon1.getImage().getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        JLabel lblNewLabel = new JLabel(new ImageIcon(img1));
        lblNewLabel.setBounds(40, 108, 294, 100);
        getContentPane().add(lblNewLabel);

        // Load and resize the second image
        ImageIcon originalIcon2 = new ImageIcon("picture\\sushii.png");
        Image img2 = originalIcon2.getImage().getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        JLabel lblNewLabel_1 = new JLabel(new ImageIcon(img2));
        lblNewLabel_1.setBounds(40, 244, 294, 100);
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("CHOOSE YOUR RESTAURANT");
        lblNewLabel_2.setBounds(241, 27, 219, 43);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(lblNewLabel_2);

        // Button for first restaurant
        JButton btnRest1 = new JButton("Choose");
        btnRest1.setBounds(486, 147, 85, 21);
        getContentPane().add(btnRest1);

        btnRest1.addActionListener(e -> {
        	String selectedRestID = "R001";
            reservation = new Reservation(generateNewReservationID(), selectedRestID, 0, "", "", "", "", "", "", false);
            new ChooseDateTimePage(reservation, db).setVisible(true);
            dispose();
        });

        // Button for second restaurant
        JButton btnRest2 = new JButton("Choose");
        btnRest2.setBounds(486, 281, 85, 21);
        getContentPane().add(btnRest2);
        
        JLabel lblNewLabel_3 = new JLabel("Rating: 4.5 star");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(361, 131, 118, 21);
        getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Rating: 4.3 star");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3_1.setBounds(361, 270, 118, 21);
        getContentPane().add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("Cuisine: Italian");
        lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3_2.setBounds(361, 162, 118, 21);
        getContentPane().add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_3_3 = new JLabel("Cuisine: Japanese");
        lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3_3.setBounds(361, 301, 118, 21);
        getContentPane().add(lblNewLabel_3_3);

        btnRest2.addActionListener(e -> {
        	String selectedRestID = "R002";
            Reservation reservation = new Reservation(generateNewReservationID(), selectedRestID, 0, "", "", "", "", "", "", false);
            new ChooseDateTimePage(reservation, db).setVisible(true);
            dispose();
        });

        setTitle("Select Picture");
        setSize(650, 451);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String generateNewReservationID() {
    	
    	int maxID=0;
    	
    	 for (Reservation r : db.getReservations()) {
    	        String id = r.getReserveID().substring(1); // for remove 'B' prefix
    	        int num = Integer.parseInt(id);
    	        if (num > maxID) {
    	            maxID = num;
    	        }
    	    }
    	    
    	    int nextId = maxID + 1;
    	    return String.format("B%03d", nextId);
    }
}

/*
public static void main(String[] args) {
        database db = new database(); // Create a single instance of the database
        SwingUtilities.invokeLater(() -> {
            new selectPicture(db).setVisible(true); // Pass the database instance
        });
} */

