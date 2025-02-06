import java.awt.*;
import javax.swing.*;

public class rateReserve extends JFrame {
    
    public rateReserve() {
        setTitle("Reservation Rating");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400); // Set the size of the window
        setLocationRelativeTo(null); // Center the window on the screen
        getContentPane().setLayout(null);
        
        Panel panel = new Panel();
        panel.setBackground(new Color(0, 128, 255));
        panel.setBounds(0, 0, 584, 76);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Rate and Review");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(10, 0, 564, 76);
        panel.add(lblNewLabel);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblNewLabel_1 = new JLabel("Rate from 1 to 5 Star");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(23, 123, 114, 23);
        getContentPane().add(lblNewLabel_1);
        
        JRadioButton rdbtnOne = new JRadioButton("1 STAR");
        rdbtnOne.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnOne.setBounds(23, 153, 109, 23);
        getContentPane().add(rdbtnOne);
        
        JRadioButton rdbtnTwo = new JRadioButton("2 STAR");
        rdbtnTwo.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTwo.setBounds(23, 179, 109, 23);
        getContentPane().add(rdbtnTwo);
        
        JRadioButton rdbtnThree = new JRadioButton("3 STAR");
        rdbtnThree.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnThree.setBounds(23, 205, 109, 23);
        getContentPane().add(rdbtnThree);
        
        JRadioButton rdbtnFour = new JRadioButton("4 STAR");
        rdbtnFour.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFour.setBounds(23, 231, 109, 23);
        getContentPane().add(rdbtnFour);
        
        JRadioButton rdbtnFive = new JRadioButton("5 STAR");
        rdbtnFive.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFive.setBounds(23, 257, 109, 23);
        getContentPane().add(rdbtnFive);
    }
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                rateReserve frame = new rateReserve();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
