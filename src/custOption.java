import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class custOption extends JFrame {
	
    public custOption(ArrayList<Customer> arrayList) {
        getContentPane().setBackground(new Color(128, 255, 255));
        setTitle("Pick Your Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JButton btnViewRest = new JButton("View Restaurant");
        btnViewRest.setBounds(67, 119, 158, 23);
        getContentPane().add(btnViewRest);

        JButton btnViewReserve = new JButton("View Reserve");
        btnViewReserve.setBounds(67, 174, 158, 23);
        getContentPane().add(btnViewReserve);

        JLabel lblText = new JLabel("Welcome,");
        lblText.setHorizontalAlignment(SwingConstants.TRAILING);
        lblText.setBounds(54, 57, 76, 14);
        getContentPane().add(lblText);

        JLabel lblName = new JLabel(arrayList != null ? arrayList.getName() : "Guest");
        lblName.setBounds(140, 57, 103, 14);
        getContentPane().add(lblName);

        // View Restaurant Button
        btnViewRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new selectPicture().setVisible(true);
                dispose();
            }
        });

        // View Reserve Button
        btnViewReserve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewReserve(null).setVisible(true);
                dispose();
            }
        });
    }
}
