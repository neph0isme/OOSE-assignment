import java.awt.*;
import javax.swing.*;

public class selectPicture extends JFrame {
    private JTextField txtRating;
    private JTextField txtRatingCuisine;

    public selectPicture() {
        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

        // Load and resize the first image
        ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\Lenovo\\git\\OOSE-assignment\\pictures\\pasta.jpg");
        Image img1 = originalIcon1.getImage();
        Image resizedImg1 = img1.getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon1 = new ImageIcon(resizedImg1);

        JLabel lblNewLabel = new JLabel(resizedIcon1);
        lblNewLabel.setBounds(40, 108, 294, 100);
        getContentPane().add(lblNewLabel);
        setLocationRelativeTo(null);

        // Load and resize the second image
        ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\Lenovo\\git\\OOSE-assignment\\pictures\\sushi.jpg"); // Change path
        Image img2 = originalIcon2.getImage();
        Image resizedImg2 = img2.getScaledInstance(294, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImg2);

        JLabel lblNewLabel_1 = new JLabel(resizedIcon2);
        lblNewLabel_1.setBounds(40, 213, 294, 100);
        getContentPane().add(lblNewLabel_1);

        txtRating = new JTextField("Rating:\n\n\nCuisine:");
        txtRating.setBounds(356, 108, 120, 87);
        getContentPane().add(txtRating);
        txtRating.setColumns(10);

        txtRatingCuisine = new JTextField("Rating:\n\n\nCuisine:");
        txtRatingCuisine.setBounds(356, 213, 120, 87);
        getContentPane().add(txtRatingCuisine);
        txtRatingCuisine.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("CHOOSE YOUR RESTAURANT");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(260, 27, 219, 43);
        getContentPane().add(lblNewLabel_2);

        // Button for first restaurant
        JButton btnNewButton = new JButton("Choose");
        btnNewButton.setBounds(486, 153, 85, 21);
        getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(e -> {
            new ChooseDateTimePage().setVisible(true);
            dispose();
        });

        // Button for second restaurant
        JButton btnNewButton_1 = new JButton("Choose");
        btnNewButton_1.setBounds(486, 246, 85, 21);
        getContentPane().add(btnNewButton_1);

        btnNewButton_1.addActionListener(e -> {
            new ChooseDateTimePage().setVisible(true);
            dispose();
        });

        setTitle("Select Picture");
        setSize(650, 451);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
