import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class viewReservation extends JFrame{
	public JFrame frame;
	public JPanel mainPanel;
	public CardLayout cardLayout;
    public DefaultTableModel tableModelins;
	
	public viewReservation() {
		frame = new JFrame("View Reservation");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new CardLayout());
	}
	
	
}

public static void main(String[] args) {
	new viewReservation();
}
