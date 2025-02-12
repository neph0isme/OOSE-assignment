import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class depositPayment extends JFrame {
    private Reservation reservation;
	private database db;

	public depositPayment() {
    	//this.db = 
    	
    	setBackground(new Color(128, 255, 255));
        // Set up frame properties
        setTitle("Deposit Payment");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        // ----------------- Top Panel (Title) -----------------
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(128, 255, 255));
        JLabel titleLabel = new JLabel("Deposit Payment", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        topPanel.add(titleLabel);

        // ----------------- Center Panel (Payment Methods) -----------------
        JPanel centerPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        centerPanel.setBackground(new Color(128, 255, 255));
        JLabel methodLabel = new JLabel("Choose Payment Method:", SwingConstants.CENTER);
        methodLabel.setBackground(new Color(128, 255, 255));
        methodLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        centerPanel.add(methodLabel);

        JButton onlineBankingButton = new JButton("Online Banking");
        JButton eWalletButton = new JButton("E-Wallet");
        JButton cardButton = new JButton("Credit/Debit Card");

        centerPanel.add(onlineBankingButton);
        centerPanel.add(eWalletButton);
        centerPanel.add(cardButton);

        // ----------------- Bottom Panel (Back and Done Buttons) -----------------
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(128, 255, 255));
        JButton backButton = new JButton("Back");
        JButton doneButton = new JButton("Done");
        doneButton.setEnabled(false);  // Initially disabled

        bottomPanel.add(backButton);
        bottomPanel.add(doneButton);

        // ----------------- Add Panels to the Frame -----------------
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        // ----------------- Action Listeners -----------------
        final String[] selectedPaymentMethod = {null};

        onlineBankingButton.addActionListener(e -> {
            String[] banks = {"Maybank", "CIMB", "Public Bank", "RHB", "Hong Leong Bank", "AmBank", "UOB Malaysia", "Bank Rakyat"};
            handleSelection("Select your bank:", "Online Banking", banks, selectedPaymentMethod, doneButton);
        });

        eWalletButton.addActionListener(e -> {
            String[] eWallets = {"Touch 'n Go eWallet", "Maybank eWallet", "Boost", "GrabPay", "bigpay"};
            handleSelection("Select your E-Wallet:", "E-Wallet Payment", eWallets, selectedPaymentMethod, doneButton);
        });

        cardButton.addActionListener(e -> handleCardPayment(selectedPaymentMethod, doneButton));

        backButton.addActionListener(e -> {
            new PaxPage(reservation, db).setVisible(true);  // Ensure PaxPage is implemented
            dispose();
        });

        doneButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Reservation Details - Customer information has been saved.", "Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
            new custOption(null).setVisible(true);  // Navigate to custOption interface
            dispose();  // Close PaxPage
        });


        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void handleSelection(String message, String title, String[] options, String[] selectedPaymentMethod, JButton doneButton) {
        String selected = (String) JOptionPane.showInputDialog(this, message, title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selected != null) {
            selectedPaymentMethod[0] = title + " - " + selected;
            JOptionPane.showMessageDialog(this, selectedPaymentMethod[0] + " selected.");
            doneButton.setEnabled(true);
        }
    }

    private void handleCardPayment(String[] selectedPaymentMethod, JButton doneButton) {
        JPanel cardPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        JTextField cardholderNameField = new JTextField();
        JTextField cardNumberField = new JTextField();
        JTextField expirationDateField = new JTextField();
        JTextField cvvField = new JTextField();
        JTextField billingAddressField = new JTextField();
        JTextField zipCodeField = new JTextField();

        cardPanel.add(new JLabel("Cardholder Name:"));
        cardPanel.add(cardholderNameField);
        cardPanel.add(new JLabel("Card Number:"));
        cardPanel.add(cardNumberField);
        cardPanel.add(new JLabel("Expiration Date (MM/YY):"));
        cardPanel.add(expirationDateField);
        cardPanel.add(new JLabel("CVV/CVC Code:"));
        cardPanel.add(cvvField);
        cardPanel.add(new JLabel("Billing Address:"));
        cardPanel.add(billingAddressField);
        cardPanel.add(new JLabel("ZIP/Postal Code:"));
        cardPanel.add(zipCodeField);

        int option = JOptionPane.showConfirmDialog(this, cardPanel, "Enter Credit/Debit Card Information", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            selectedPaymentMethod[0] = "Credit/Debit Card";
            JOptionPane.showMessageDialog(this, "Payment details saved.\nDeposit Payment Successful!");
            doneButton.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(depositPayment::new);
    }
}