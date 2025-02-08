import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseDateTimePage extends JFrame {
    public ChooseDateTimePage() {
        setTitle("Choose Date & Time");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(10, 10, 83, 21);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add action for the back button if needed
            }
        });
        add(btnBack);

        JLabel lblSelectDate = new JLabel("SELECT DATE:");
        lblSelectDate.setBounds(60, 95, 100, 21);
        add(lblSelectDate);

        JLabel lblSelectTime = new JLabel("SELECT TIME:");
        lblSelectTime.setBounds(60, 209, 100, 13);
        add(lblSelectTime);

        JLabel lblFrom = new JLabel("FROM:");
        lblFrom.setBounds(91, 236, 40, 13);
        add(lblFrom);

        JLabel lblTo = new JLabel("TO:");
        lblTo.setBounds(104, 266, 20, 13);
        add(lblTo);

        // Year ComboBox (2025 - 2030)
        JComboBox<String> comboBoxYear = new JComboBox<>();
        for (int year = 2025; year <= 2030; year++) {
            comboBoxYear.addItem(String.valueOf(year));
        }
        comboBoxYear.setBounds(130, 138, 93, 21);
        add(comboBoxYear);

        // Month ComboBox (January - February)
        JComboBox<String> comboBoxMonth = new JComboBox<>(new String[]{"January", "February"});
        comboBoxMonth.setBounds(300, 138, 93, 21);
        add(comboBoxMonth);

        // Day ComboBox (1 - 31)
        JComboBox<String> comboBoxDay = new JComboBox<>();
        for (int day = 1; day <= 31; day++) {
            comboBoxDay.addItem(String.valueOf(day));
        }
        comboBoxDay.setBounds(470, 138, 93, 21);
        add(comboBoxDay);

        JLabel lblYear = new JLabel("YEAR");
        lblYear.setBounds(91, 142, 40, 13);
        add(lblYear);

        JLabel lblMonth = new JLabel("MONTH");
        lblMonth.setBounds(250, 142, 50, 13);
        add(lblMonth);

        JLabel lblDay = new JLabel("DAY");
        lblDay.setBounds(437, 142, 30, 13);
        add(lblDay);

        // Time ComboBox (00:00 - 23:00)
        JComboBox<String> comboBoxFrom = new JComboBox<>();
        JComboBox<String> comboBoxTo = new JComboBox<>();
        for (int hour = 0; hour < 24; hour++) {
            String time = String.format("%02d:00", hour);
            comboBoxFrom.addItem(time);
            comboBoxTo.addItem(time);
        }
        comboBoxFrom.setBounds(130, 232, 93, 21);
        add(comboBoxFrom);

        comboBoxTo.setBounds(130, 262, 93, 21);
        add(comboBoxTo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChooseDateTimePage().setVisible(true);
        });
    }
}
