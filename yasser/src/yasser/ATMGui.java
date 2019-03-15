package yasser;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Button;

public class ATMGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMGui window = new ATMGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATMGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Account user=new Account("222","333",4000);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 10, 434, 261);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(115, 109, 202, 142);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		Label label_1 = new Label("");
		label_1.setBackground(Color.WHITE);
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(10, 32, 424, 47);
		panel_2.add(label_1);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("1"));
			}
		});
		btnNewButton.setBounds(10, 11, 47, 23);
		panel_3.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("2"));

			}
		});
		button.setBounds(80, 11, 47, 23);
		panel_3.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("3"));

			}
		});
		button_1.setBounds(145, 11, 47, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("4"));

			}
		});
		button_2.setBounds(10, 45, 47, 23);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("5"));

			}
		});
		button_3.setBounds(80, 45, 47, 23);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("6"));

			}
		});
		button_4.setBounds(145, 45, 47, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				label_1.setText(label_1.getText().concat("7"));

			}
		});
		button_5.setBounds(10, 79, 47, 23);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("8"));

			}
		});
		button_6.setBounds(80, 79, 47, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("9"));

			}
		});
		button_7.setBounds(145, 79, 47, 23);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("0"));

			}
		});
		button_8.setBounds(80, 108, 47, 23);
		panel_3.add(button_8);
		
		JButton button_9 = new JButton(".");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_1.setText(label_1.getText().concat("."));

			}
		});
		button_9.setBounds(145, 108, 47, 23);
		panel_3.add(button_9);
		
		JButton btnNewButton_1 = new JButton("Withdraw");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.Withdraw(label_1.getText())) {
					JOptionPane.showMessageDialog(null, "Successfully withdrawn $"+label_1.getText());
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Insufficient Funds");
				}
				
			}
		});
		btnNewButton_1.setBounds(10, 130, 89, 47);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deposit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.Deposit(label_1.getText());
				JOptionPane.showMessageDialog(null, "Successfully deposited $"+label_1.getText());
				
			}
		});
		btnNewButton_2.setBounds(335, 130, 89, 35);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				label_1.setText("");
			}
		});
		btnNewButton_3.setBounds(10, 188, 89, 48);
		panel_2.add(btnNewButton_3);
		
		
		
		Label label = new Label("");
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Dead Kansas", Font.PLAIN, 20));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 57, 414, 78);
		panel_1.add(label);
		
		JButton btnBalanceInquiry = new JButton("Balance Inquiry");
		btnBalanceInquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(user.displayBalance());
			}
		});
		btnBalanceInquiry.setBounds(74, 184, 107, 23);
		panel_1.add(btnBalanceInquiry);
		
		JButton btnTransactions = new JButton("Transactions");
		btnTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
			}
		});
		btnTransactions.setBounds(287, 184, 107, 23);
		panel_1.add(btnTransactions);
		Button button_11 = new Button("Next>");
		Button button_10 = new Button("<Previous");
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Client.number==4)
				{
					//button_11.setVisible(false);
				}
				if(Client.number==0)
				{
					//button_10.setVisible(false);
				}
				label.setText(user.previous());
			}
		});
		button_10.setBounds(10, 229, 70, 22);
		panel_1.add(button_10);
		
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label.setText(user.next());
			}
		});
		button_11.setBounds(354, 229, 70, 22);
		panel_1.add(button_11);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCardNumber = new JLabel("Card Number ");
		lblCardNumber.setBounds(71, 44, 67, 14);
		panel.add(lblCardNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(71, 84, 67, 14);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.Login(textField.getText(), textField_1.getText()))
				{
					JOptionPane.showMessageDialog(null, "Successfully logged in!");
					panel.setVisible(false);
					panel_1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Credtentials");
				}
			}
			
		});
		btnLogin.setBounds(165, 169, 89, 23);
		panel.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(158, 41, 114, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Symbol", Font.PLAIN, 11));
		textField_1.setBounds(158, 82, 114, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
	}
}