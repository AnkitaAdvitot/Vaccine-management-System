package com.cears.services;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage frame = new homePage();
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
	public homePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 105, 180));
		panel.setBounds(5, 5, 774, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Vaccination Drive");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(150, 33, 452, 44);
		panel.add(lblNewLabel);
		
		JButton Login = new JButton("Login");
		Login.setBorderPainted(false);
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login2 lg = new Login2();
				lg.setVisible(true);
				setVisible(false);
			}
			
		});
		Login.setForeground(new Color(0, 0, 0));
		Login.setBackground(new Color(255, 0, 0));
		Login.setFont(new Font("Arial", Font.BOLD, 20));
		Login.setBounds(5, 402, 153, 44);
		contentPane.add(Login);
		
		JButton SignUp = new JButton("Sign Up\r\n");
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterationPage rg = new RegisterationPage();
				rg.setVisible(true);
				setVisible(false);

			}
		});
		SignUp.setBorderPainted(false);
		SignUp.setFont(new Font("Arial", Font.BOLD, 20));
		SignUp.setBackground(new Color(255, 0, 0));
		SignUp.setBounds(5, 457, 153, 38);
		contentPane.add(SignUp);
		
		 //vaccine = new JLabel("");
		//Image img = new ImageIcon(this.getClass().getResource("/vaccine.png")).getImage();
	   // vaccine.setIcon(new ImageIcon(img));	
		
		//vaccine.setBounds(21, 155, 216, 268);
		//contentPane.add(vaccine);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/vaccine.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(5, 0, 785, 764);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
	}
}
