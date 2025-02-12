import java.awt.*;
import javax.swing.*;

public class selectPicture extends JFrame {
    private static database db = new database();

    public selectPicture(database db) {
        this.db = db; // Pass the database instance

        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

        // Load and resize the first image
        ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\ASUS\\OneDrive - Universiti Kebangsaan Malaysia\\Pictures\\PASTA GUI.png");
        Image img1 = originalIcon1.getImage().getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        JLabel lblNewLabel = new JLabel(new ImageIcon(img1));
        lblNewLabel.setBounds(40, 108, 294, 100);
        getContentPane().add(lblNewLabel);

        // Load and resize the second image
        ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\ASUS\\OneDrive - Universiti Kebangsaan Malaysia\\Pictures\\sushii.png");
        Image img2 = originalIcon2.getImage().getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        JLabel lblNewLabel_1 = new JLabel(new ImageIcon(img2));
        lblNewLabel_1.setBounds(40, 213, 294, 100);
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("CHOOSE YOUR RESTAURANT");
        lblNewLabel_2.setBounds(260, 27, 219, 43);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(lblNewLabel_2);

        // Button for first restaurant
        JButton btnRest1 = new JButton("Choose");
        btnRest1.setBounds(486, 153, 85, 21);
        getContentPane().add(btnRest1);

        btnRest1.addActionListener(e -> {
            Reservation newReservation = new Reservation(generateNewReservationID(), "R001", 0, "", "", "", false);
            new ChooseDateTimePage(newReservation, db).setVisible(true);
            dispose();
        });

        // Button for second restaurant
        JButton btnRest2 = new JButton("Choose");
        btnRest2.setBounds(486, 246, 85, 21);
        getContentPane().add(btnRest2);

        btnRest2.addActionListener(e -> {
            Reservation newReservation = new Reservation(generateNewReservationID(), "R002", 0, "", "", "", false);
            new ChooseDateTimePage(newReservation, db).setVisible(true);
            dispose();
        });

        setTitle("Select Picture");
        setSize(650, 451);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String generateNewReservationID() {
        int nextId = db.getReservations().size() + 1; // Get next ID
        return String.format("B%03d", nextId); // Format as B001, B002, B003...
    }
}
