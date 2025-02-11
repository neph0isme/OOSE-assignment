import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UpdRestDet extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField restaurantNameField;
    private JTextField cuisineTypeField;
    private JTextField locationField;
    private JSpinner paxSpinner;
    private database db;
    private Restaurant restaurant;

    public UpdRestDet(database db, Restaurant restaurant) {
        this.db = db;
        this.restaurant = restaurant;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null); // Set Absolute Layout
        setContentPane(contentPane);

        JLabel titleLabel = new JLabel("UPDATE RESTAURANT DETAILS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(180, 20, 300, 30);
        contentPane.add(titleLabel);

        JLabel nameLabel = new JLabel("Restaurant Name:");
        nameLabel.setBounds(50, 70, 120, 25);
        contentPane.add(nameLabel);

        restaurantNameField = new JTextField(20);
        restaurantNameField.setBounds(180, 70, 200, 25);
        restaurantNameField.setText(restaurant.getName());
        contentPane.add(restaurantNameField);

        JLabel cuisineLabel = new JLabel("Type of Cuisine:");
        cuisineLabel.setBounds(50, 110, 120, 25);
        contentPane.add(cuisineLabel);

        cuisineTypeField = new JTextField(20);
        cuisineTypeField.setBounds(180, 110, 200, 25);
        cuisineTypeField.setText(restaurant.getCuisineType());
        contentPane.add(cuisineTypeField);

        JLabel locationLabel = new JLabel("Location:");
        locationLabel.setBounds(50, 150, 120, 25);
        contentPane.add(locationLabel);

        locationField = new JTextField(20);
        locationField.setBounds(180, 150, 200, 25);
        locationField.setText(restaurant.getLocation());
        contentPane.add(locationField);

        JLabel paxLabel = new JLabel("Number of Pax:");
        paxLabel.setBounds(50, 190, 120, 25);
        contentPane.add(paxLabel);

        paxSpinner = new JSpinner(new SpinnerNumberModel(restaurant.getRestPax(), 1, 100, 1));
        paxSpinner.setBounds(180, 190, 50, 25);
        contentPane.add(paxSpinner);

        JLabel ratingLabel = new JLabel("Rating (Out of 5):");
        ratingLabel.setBounds(50, 230, 120, 25);
        contentPane.add(ratingLabel);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(150, 300, 100, 30);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveRestaurantDetails();
            }
        });
        contentPane.add(saveButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(270, 300, 100, 30);
        cancelButton.addActionListener(e -> dispose());
        contentPane.add(cancelButton);
        
        JLabel lblrating = new JLabel(String.valueOf(restaurant.getRating())); // Display actual rating
        lblrating.setBounds(180, 235, 49, 14);
        contentPane.add(lblrating);
    }

    private void saveRestaurantDetails() {
        restaurant.setName(restaurantNameField.getText());
        restaurant.setCuisineType(cuisineTypeField.getText());
        restaurant.setLocation(locationField.getText());
        restaurant.setRestPax((int) paxSpinner.getValue());
        //restaurant.setRating((double) ratingSpinner.getValue());

        db.updateRestaurant(restaurant);
        //System.out.println(restaurant.getRating());
        JOptionPane.showMessageDialog(this, "Restaurant details updated successfully!");
    }

    public static void main(String[] args) {
        database db = new database();
        Restaurant restaurant = db.getRestaurants().get(0);

        EventQueue.invokeLater(() -> {
            try {
                UpdRestDet frame = new UpdRestDet(db, restaurant);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}