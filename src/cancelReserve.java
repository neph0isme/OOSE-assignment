import java.awt.*;
import javax.swing.*;

public class cancelReserve extends JFrame {

    public cancelReserve() {
        setTitle("Cancel Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400); // Set the size of the window
        setLocationRelativeTo(null); // Center the window on the screen

        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Do You Want To Cancel This Booking?");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 112, 562, 33);
        getContentPane().add(lblNewLabel);

        JButton btnYes = new JButton("Yes");
        btnYes.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnYes.setBounds(146, 194, 128, 40);
        getContentPane().add(btnYes);

        JButton btnNo = new JButton("No");
        btnNo.setBounds(305, 194, 128, 40);
        getContentPane().add(btnNo);

        // Add action listeners for the buttons
        btnYes.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Your booking has been canceled.");
            dispose(); // Close the current window
            new LoginPage().setVisible(true); // Navigate back to the main menu
        });

        btnNo.addActionListener(e -> {
            dispose(); // Close the current window
            new viewReserve().setVisible(true); // Navigate back to the view reservation screen
        });
    }

    public static void main(String[] args) {
        // Create and display the cancelReserve window
        EventQueue.invokeLater(() -> {
            try {
                cancelReserve frame = new cancelReserve();
                frame.setVisible(true); // Display the window
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}