import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class viewAllReserve extends JFrame {

    public viewAllReserve(database db) {
        setTitle("View All Reservations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(856, 600);
        setLocationRelativeTo(null);

        // Column names for the table
        String[] columnNames = {"Reservation ID", "Restaurant ID", "Pax", "Customer Name", "Phone Number", "Email", "Status"};

        // Retrieve reservation data
        ArrayList<Reservation> reservations = db.getReservations();
        Object[][] data = new Object[reservations.size()][7];

        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            data[i][0] = r.getReserveID();
            data[i][1] = r.getRestaurantID();
            data[i][2] = r.getReservePax();
            data[i][3] = r.getCustName();
            data[i][4] = r.getCustPhone();
            data[i][5] = r.getCustEmail();
            data[i][6] = r.isReserveStatus() ? "Confirmed" : "Pending"; // Convert boolean to text
        }

        // Create table model and table
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        getContentPane().setLayout(null);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 73, 820, 427);
        getContentPane().add(scrollPane);
        
        JLabel lblHeader = new JLabel("All Reservations");
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHeader.setBounds(10, 32, 820, 14);
        getContentPane().add(lblHeader);
        
        JButton btnBack = new JButton("back");
        btnBack.setBounds(382, 527, 89, 23);
        getContentPane().add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new staffView(db).setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        database db = new database(); // Initialize database
        SwingUtilities.invokeLater(() -> new viewAllReserve(db).setVisible(true));
    }
}
