import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewReserve extends JFrame {

    public viewReserve() {
        setTitle("View Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(5, 2, 5, 5));

        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("View Reservation");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 63, 568, 32);
        getContentPane().add(lblNewLabel);

        JButton btnCancel = new JButton("CANCEL");
        btnCancel.setBounds(59, 189, 115, 45);
        getContentPane().add(btnCancel);

        JButton btnEdit = new JButton("EDIT");
        btnEdit.setBounds(244, 189, 115, 45);
        getContentPane().add(btnEdit);

        JButton btnRate = new JButton("RATE");
        btnRate.setBounds(417, 189, 115, 45);
        getContentPane().add(btnRate);

        JButton btnBack = new JButton("BACK");
        btnBack.setBounds(10, 11, 89, 23);
        getContentPane().add(btnBack);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(64, 131, 468, 22);
        getContentPane().add(textArea);

        // Add action listeners to the buttons
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate to cancelReserve.java
                new cancelReserve().setVisible(true);
                dispose(); // Close the current window
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate to editReservation.java
                new editReservation().setVisible(true);
                dispose(); // Close the current window
            }
        });

        btnRate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate to rateReserve.java
                new rateReserve().setVisible(true);
                dispose(); // Close the current window
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate back to the previous screen (assuming it's MainMenu.java)
                new viewRestaurant().setVisible(true);
                dispose(); // Close the current window
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the viewReserve window
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    viewReserve frame = new viewReserve();
                    frame.setSize(600, 300);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}