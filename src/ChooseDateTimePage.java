import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ChooseDateTimePage extends JFrame {
    private static Reservation reservation;
    private static database db = new database();
	
	public ChooseDateTimePage(Reservation reservation, database db) {
    	this.reservation = reservation;
    	this.db = db;
    	
        getContentPane().setBackground(new Color(128, 255, 255));
        setTitle("Choose Date & Time");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        // Back Button
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(10, 10, 83, 21);
        btnBack.addActionListener(e -> {
            new selectPicture(db).setVisible(true); // Open selectPicture GUI
            dispose(); // Close current window
        });
        getContentPane().add(btnBack);

        JLabel lblSelectDate = new JLabel("SELECT DATE:");
        lblSelectDate.setBounds(60, 95, 100, 21);
        getContentPane().add(lblSelectDate);

        JLabel lblSelectTime = new JLabel("SELECT TIME:");
        lblSelectTime.setBounds(60, 209, 100, 13);
        getContentPane().add(lblSelectTime);

        JLabel lblFrom = new JLabel("FROM:");
        lblFrom.setBounds(91, 236, 40, 13);
        getContentPane().add(lblFrom);

        JLabel lblTo = new JLabel("TO:");
        lblTo.setBounds(104, 266, 40, 13);
        getContentPane().add(lblTo);

        // Year ComboBox (2025 - 2030)
        JComboBox<String> comboBoxYear = new JComboBox<>();
        for (int year = 2025; year <= 2030; year++) {
            comboBoxYear.addItem(String.valueOf(year));
        }
        comboBoxYear.setBounds(130, 138, 93, 21);
        getContentPane().add(comboBoxYear);

        // Month ComboBox
        JComboBox<String> comboBoxMonth = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"});
        comboBoxMonth.setBounds(300, 138, 93, 21);
        getContentPane().add(comboBoxMonth);

        // Day ComboBox (1 - 31)
        JComboBox<String> comboBoxDay = new JComboBox<>();
        for (int day = 1; day <= 31; day++) {
            comboBoxDay.addItem(String.valueOf(day));
        }
        comboBoxDay.setBounds(470, 138, 93, 21);
        getContentPane().add(comboBoxDay);

        JLabel lblYear = new JLabel("YEAR");
        lblYear.setBounds(91, 142, 40, 13);
        getContentPane().add(lblYear);

        JLabel lblMonth = new JLabel("MONTH");
        lblMonth.setBounds(250, 142, 50, 13);
        getContentPane().add(lblMonth);

        JLabel lblDay = new JLabel("DAY");
        lblDay.setBounds(437, 142, 30, 13);
        getContentPane().add(lblDay);

        // Time ComboBoxes
        JComboBox<String> comboBoxFrom = new JComboBox<>();
        JComboBox<String> comboBoxTo = new JComboBox<>();
        for (int hour = 0; hour < 24; hour++) {
            String time = String.format("%02d:00", hour);
            comboBoxFrom.addItem(time);
            comboBoxTo.addItem(time);
        }
        comboBoxFrom.setBounds(144, 232, 93, 21);
        getContentPane().add(comboBoxFrom);

        comboBoxTo.setBounds(144, 262, 93, 21);
        getContentPane().add(comboBoxTo);

        // Next Button
        JButton btnNext = new JButton("Next");
        btnNext.setBounds(276, 319, 83, 21);
        btnNext.addActionListener(e -> {
            // Get selected date
            String selectedYear = (String) comboBoxYear.getSelectedItem();
            String selectedMonth = (String) comboBoxMonth.getSelectedItem();
            String selectedDay = (String) comboBoxDay.getSelectedItem();
            String selectedDate = selectedDay + " " + selectedMonth + " " + selectedYear;
            
           
            // Get selected time
            String selectedStartTime = (String) comboBoxFrom.getSelectedItem();
            String selectedEndTime = (String) comboBoxTo.getSelectedItem();

         // Check if reservation is not null
            if (reservation != null) {
                // Update the reservation with selected date and time
                reservation.setStartTime(selectedStartTime);
                reservation.setEndTime(selectedEndTime);
                reservation.setDate(selectedDate);

                // Add reservation to the database
                db.addReservation(reservation);

                // DEBUGGING: Print reservations after adding
                System.out.println("Reservations after adding:");
                for (Reservation r : db.getReservations()) {
                    System.out.println(r.getReserveID() + " - " + r.getCustEmail() + " - " + r.getDate());
                }
                
                // Proceed to next page (PaxPage)
                new PaxPage(reservation, db).setVisible(true);
                dispose(); // Close current window
                
            } else {
                // Handle the case where reservation is null
                JOptionPane.showMessageDialog(this, "Reservation is not initialized.");
            }
        });

        getContentPane().add(btnNext);
    }

	/*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	Reservation reservation = new Reservation("sample", "RestaurantID", 2, "", "", "", "John Doe", "1234567890", "john@example.com", true);
            new ChooseDateTimePage(reservation, db).setVisible(true);
        });
    } */
}
