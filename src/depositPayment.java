import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depositPayment extends JFrame {
    public depositPayment() {
        // Create the main frame with BorderLayout
        JFrame frame = new JFrame("Deposit Payment");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ----------------- Top Panel (Title) -----------------
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JLabel titleLabel = new JLabel("Deposit Payment", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        topPanel.add(titleLabel, BorderLayout.CENTER);

        // ----------------- Center Panel (Payment Methods) -----------------
        JPanel centerPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JLabel methodLabel = new JLabel("Choose Payment Method:", SwingConstants.CENTER);
        methodLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton onlineBankingButton = new JButton("Online Banking");
        JButton eWalletButton = new JButton("E-Wallet");
        JButton cardButton = new JButton("Credit/Debit Card");

        centerPanel.add(methodLabel);
        centerPanel.add(onlineBankingButton);
        centerPanel.add(eWalletButton);
        centerPanel.add(cardButton);

        // ----------------- Bottom Panel (Back and Done Buttons) -----------------
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton backButton = new JButton("<-");
        backButton.setPreferredSize(new Dimension(50, 30));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.RED);
        backButton.setFocusPainted(false);
        backButton.addActionListener(e -> frame.dispose());

        Component horizontalGlue = Box.createHorizontalGlue();

        JButton doneButton = new JButton("Done");
        doneButton.setEnabled(false);  // Initially disabled
        doneButton.addActionListener(e -> {
            // Show a pop-up message confirming the reservation details
            JOptionPane.showMessageDialog(frame, 
                "Reservation Details - Customer information has been saved.", 
                "Reservation Confirmation", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Open the next interface (ViewReservationGUI)
            frame.dispose();
            new viewReserve(null); // Ensure this class exists
        });

        bottomPanel.add(backButton);
        bottomPanel.add(horizontalGlue);
        bottomPanel.add(doneButton);

        // ----------------- Payment Method Selection Handling -----------------
        final String[] selectedPaymentMethod = {null};

        onlineBankingButton.addActionListener(e -> {
            String[] banks = {"Maybank", "CIMB", "Public Bank", "RHB", "Hong Leong Bank", "AmBank", "UOB Malaysia", "Bank Rakyat"};
            String selectedBank = (String) JOptionPane.showInputDialog(
                    frame, "Select your bank:", "Online Banking", JOptionPane.QUESTION_MESSAGE, null, banks, banks[0]);
            if (selectedBank != null) {
                selectedPaymentMethod[0] = "Online Banking - " + selectedBank;
                JOptionPane.showMessageDialog(frame, selectedPaymentMethod[0] + " selected.");
                doneButton.setEnabled(true);
            }
        });

        eWalletButton.addActionListener(e -> {
            String[] eWallets = {"Touch 'n Go eWallet", "Maybank eWallet", "Boost", "GrabPay", "bigpay"};
            String selectedEWallet = (String) JOptionPane.showInputDialog(
                    frame, "Select your E-Wallet:", "E-Wallet Payment", JOptionPane.QUESTION_MESSAGE, null, eWallets, eWallets[0]);
            if (selectedEWallet != null) {
                selectedPaymentMethod[0] = "E-Wallet - " + selectedEWallet;
                JOptionPane.showMessageDialog(frame, selectedPaymentMethod[0] + " selected.");
                doneButton.setEnabled(true);
            }
        });

        cardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                int option = JOptionPane.showConfirmDialog(
                        frame, cardPanel, "Enter Credit/Debit Card Information", JOptionPane.OK_CANCEL_OPTION);
                
                if (option == JOptionPane.OK_OPTION) {
                    String cardholderName = cardholderNameField.getText();
                    String cardNumber = cardNumberField.getText();
                    String expirationDate = expirationDateField.getText();
                    String cvv = cvvField.getText();
                    String billingAddress = billingAddressField.getText();
                    String zipCode = zipCodeField.getText();

                    JOptionPane.showMessageDialog(frame, "Payment details:\n" +
                            "Cardholder: " + cardholderName + "\n" +
                            "Card Number: " + cardNumber + "\n" +
                            "Expiration Date: " + expirationDate + "\n" +
                            "CVV: " + cvv + "\n" +
                            "Billing Address: " + billingAddress + "\n" +
                            "ZIP: " + zipCode + "\n\nDeposit Payment Successful!");
                    selectedPaymentMethod[0] = "Credit/Debit Card";
                    doneButton.setEnabled(true);
                }
            }
        });

        // ----------------- Add Panels to the Frame -----------------
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new depositPayment();
    }
}
