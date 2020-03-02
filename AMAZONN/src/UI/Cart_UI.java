package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;

public class Cart_UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart_UI frame = new Cart_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cart_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Checkout");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 50));
		lblNewLabel.setBounds(0, 0, 455, 72);
		contentPane.add(lblNewLabel);
		
		JButton Paybtn = new JButton("PAY");
		Paybtn.setBackground(Color.RED);
		Paybtn.setFont(new Font("Tahoma", Font.BOLD, 40));
		Paybtn.setBounds(275, 290, 170, 87);
		contentPane.add(Paybtn);
		
		JLabel lblNewLabel_1 = new JLabel("Total Amount: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(25, 118, 204, 36);
		contentPane.add(lblNewLabel_1);
		
		JTextPane TotalAmount = new JTextPane();
		TotalAmount.setBounds(239, 118, 206, 36);
		contentPane.add(TotalAmount);
	}
	

}
