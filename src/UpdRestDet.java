import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UpdRestDet extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField restaurantNameField;
    private JTextField cuisineTypeField;
    private JTextField locationField;
    private JSpinner paxSpinner;
    private JLabel ratingLabel; // JLabel for displaying rating

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UpdRestDet frame = new UpdRestDet();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public UpdRestDet() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 450); // Adjusted height for rating
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // Title Label
        JLabel titleLabel = new JLabel("RESTAURANT DETAILS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPane.add(titleLabel, gbc);

        // Restaurant Name
        JLabel restaurantNameLabel = new JLabel("Restaurant Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        contentPane.add(restaurantNameLabel, gbc);

        restaurantNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(restaurantNameField, gbc);

        // Type of Cuisine
        JLabel cuisineTypeLabel = new JLabel("Type of Cuisine:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(cuisineTypeLabel, gbc);

        cuisineTypeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(cuisineTypeField, gbc);

        // Location
        JLabel locationLabel = new JLabel("Location:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPane.add(locationLabel, gbc);

        locationField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        contentPane.add(locationField, gbc);

        // Number of Pax
        JLabel paxLabel = new JLabel("Number of Pax:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        contentPane.add(paxLabel, gbc);

        paxSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)); // Default value, min, max, step
        gbc.gridx = 1;
        gbc.gridy = 4;
        contentPane.add(paxSpinner, gbc);

        // Rating
        JLabel ratingDisplayLabel = new JLabel("Rating:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        contentPane.add(ratingDisplayLabel, gbc);

        // JLabel for displaying the rating
        ratingLabel = new JLabel("4 Stars"); // Example rating, you can set this dynamically
        gbc.gridx = 1;
        gbc.gridy = 5;
        contentPane.add(ratingLabel, gbc);

        // Buttons
        JButton saveButton = new JButton("Save");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        contentPane.add(saveButton, gbc);

        JButton cancelButton = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        contentPane.add(cancelButton, gbc);
    }
}