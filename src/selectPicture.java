import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selectPicture extends JFrame {
    private JTextField txtRating;
    private JTextField txtRatingCuisine;

    public selectPicture() {
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("PIC1");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive - Universiti Kebangsaan Malaysia\\Pictures\\saje.jpg"));
        lblNewLabel.setBounds(40, 108, 343, 87);
        getContentPane().add(lblNewLabel);
		setLocationRelativeTo(null);

        JLabel lblNewLabel_1 = new JLabel("PIC2");
        lblNewLabel_1.setBounds(40, 213, 343, 87);
        getContentPane().add(lblNewLabel_1);

        txtRating = new JTextField();
        txtRating.setText("Rating:\r\n\r\n\r\nCuisine:");
        txtRating.setBounds(393, 108, 172, 87);
        getContentPane().add(txtRating);
        txtRating.setColumns(10);

        txtRatingCuisine = new JTextField();
        txtRatingCuisine.setText("Rating:\r\n\r\n\r\nCuisine:");
        txtRatingCuisine.setBounds(393, 213, 172, 87);
        getContentPane().add(txtRatingCuisine);
        txtRatingCuisine.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("CHOOSE YOUR RESTAURANT");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(260, 27, 219, 43);
        getContentPane().add(lblNewLabel_2);

        // Button for first restaurant
        JButton btnNewButton = new JButton("Choose");
        btnNewButton.setBounds(576, 151, 85, 21);
        getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(e -> {
            new ChooseDateTimePage().setVisible(true); 
            dispose(); 
        });

        // Button for second restaurant
        JButton btnNewButton_1 = new JButton("Choose");
        btnNewButton_1.setBounds(575, 246, 85, 21);
        getContentPane().add(btnNewButton_1);

        btnNewButton_1.addActionListener(e -> {
            new ChooseDateTimePage().setVisible(true); 
            dispose(); 
        });

        setTitle("Select Picture");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
