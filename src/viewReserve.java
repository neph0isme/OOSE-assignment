import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewReserve extends JFrame {
	private static CustomerController customerController;
	private database db = new database();
	
    public viewReserve(CustomerController customerController) {
    	this.customerController = customerController;
    	
        setTitle("View Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null); // Centers the window on the screen
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
                new cancelReserve().setVisible(true);
                dispose();
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new editReservation().setVisible(true);
                dispose();
            }
        });

        btnRate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new rateReserve().setVisible(true);
                dispose();
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new custOption(db.c1).setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    viewReserve frame = new viewReserve(customerController);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
