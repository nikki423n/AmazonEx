package UI;
import control.*;

//import main.*;

import java.util.ArrayList;


import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import UI.Main_UI;
import control.Games;
import javax.swing.JScrollBar;



public class Main_UI extends JFrame {

	public int main;
	private JTextField Fireball;
	private JTextField textField;
	private JTextField Quantity;
	private JPanel contentPane;
	private JTextField ProductsTextBox;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_UI frame = new Main_UI();
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
	public Main_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 522);
		
		/*JTextField MainTextBox = new JTextField();
		MainTextBox.setText("abc");
		//contentPane.add(MainTextBox, BorderLayout.CENTER);
		MainTextBox.setColumns(10); 
		*/
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("FIREBALL");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		menuBar.add(lblNewLabel);
		
		JMenu mnNewMenu = new JMenu("All");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane productscrollpane = new JScrollPane();
		productscrollpane.setBounds(20, 425, 545, -412);
		contentPane.add(productscrollpane);
		
		
		
		JTextPane mainproducts = new JTextPane();
		mainproducts.setText("Fireball");
		mainproducts.setBounds(20, 11, 545, 420);
		mainproducts.setForeground(Color.BLACK);
		contentPane.add(mainproducts);
		//ScrollPane.setViewportView(mainproducts);
		mainproducts.setFont(new Font("Agency FB", Font.PLAIN, 18));
		
		JPanel cartbtn = new JPanel();
		cartbtn.setBounds(575, 0, 318, 431);
		cartbtn.setBackground(Color.DARK_GRAY);
		getContentPane().add(cartbtn);
		cartbtn.setLayout(null);
		
		
		
		JLabel lblNewLabel1 = new JLabel("product #");
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel1.setBounds(20, 10, 96, 20);
		cartbtn.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("QTY");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 41, 89, 26);
		cartbtn.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 10, 86, 20);
		cartbtn.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 41, 86, 20);
		cartbtn.add(textField_2);
		textField_2.setColumns(10);
		
		JButton AddToCart = new JButton("Add to Cart");
		AddToCart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AddToCart.setBounds(10, 97, 139, 23);
		cartbtn.add(AddToCart);
		
		JScrollPane CartScrollPane = new JScrollPane();
		CartScrollPane.setBounds(20, 386, 273, -255);
		cartbtn.add(CartScrollPane);
		
		JTextPane Cart = new JTextPane();
		Cart.setBounds(20, 131, 273, 267);
		Cart.setEditable(false);
		
		
		
		cartbtn.add(Cart);
		
		//ProductStorage myProductList = new ProductStorage();
		
		ProductStorage.main(null);
		
		ArrayList<Games> prodGames = ProductStorage.getGamesList();
		
		//games button
		
		JButton games = new JButton("Games");
		games.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	String games = textField.getText();
				//String [] gamesInput = {"Games"};
			
				//mainproducts.setText(myProductList.getGamesList());
				
				String allGames = "";
				
				for (int i = 0; i < prodGames.size(); i++)
		        {
					allGames = allGames + prodGames.get(i).setDescription() + "\n";
					//mainproducts.setText(prodGames.get(i).setDescription());
					//mainproducts.setText("\n");
		        }
				
				mainproducts.setText(allGames);
				allGames = "";
		
	
			}
		});
		mnNewMenu.add(games);
		
		ArrayList<Electronics> prodElectronics = ProductStorage.getElectronicsList();
		
		//electronics button
		JButton electronics = new JButton("Electronics");
		electronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String Electronics = textField.getText();
				
		 //mainproducts.setText(ProductStorage.main("Electronics"));
				String allElectronics = "";
				
				for (int i = 0; i < prodElectronics.size(); i++)
		        {
					allElectronics = allElectronics + prodElectronics.get(i).setDescription() + "\n";
					//mainproducts.setText(prodGames.get(i).setDescription());
					//mainproducts.setText("\n");
		        }
				
				mainproducts.setText(allElectronics);
				allElectronics = "";

				
			}
		});
		mnNewMenu.add(electronics);
		
		ArrayList<Clothes> prodClothes = ProductStorage.getClothesList();
		
		//clothes button
		JButton clothes = new JButton("Clothes");
		clothes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	String Clothes = textField.getText();
				
			//	 mainproducts.setText(ProductStorage.main("Clothes"));
				 
				String allClothes = "";
				
				for (int i = 0; i < prodClothes.size(); i++)
		        {
					allClothes = allClothes + prodClothes.get(i).setDescription() + "\n";
					//mainproducts.setText(prodGames.get(i).setDescription());
					//mainproducts.setText("\n");
		        }
				
				mainproducts.setText(allClothes);
				allClothes = "";
				
			}
		});
		mnNewMenu.add(clothes);
		
		JButton search = new JButton("Search");
		search.setFont(new Font("Tahoma", Font.PLAIN, 20));
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	String Search = textField.getText();
				
			//	 mainproducts.setText(Search.main(null));
				 
				 
				//double click the button after there is available
			
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		menuBar.add(scrollPane);
		
		JTextPane txtpnInsertSearch = new JTextPane();
		scrollPane.setViewportView(txtpnInsertSearch);
		txtpnInsertSearch.setText("insert search category");
		menuBar.add(search);
		
		
		JButton Checkout = new JButton("Checkout");
		Checkout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart_UI second = new Cart_UI();
				second.setVisible(true);
				
				
				
					
			}
		});
		
		menuBar.add(Checkout);		
	
		
	}
}
