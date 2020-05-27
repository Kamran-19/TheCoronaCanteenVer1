package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class flagclass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flagclass window = new flagclass();
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
	public flagclass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmployeesFlagHistory = new JLabel("EMPLOYEES' FLAG HISTORY");
		lblEmployeesFlagHistory.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblEmployeesFlagHistory.setBounds(206, 32, 390, 71);
		frame.getContentPane().add(lblEmployeesFlagHistory);
		
		JLabel lblNewLabel_1_3 = new JLabel("USERNAME");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(24, 114, 134, 40);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(206, 114, 57, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OLD FLAGS");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(340, 114, 125, 40);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NEW FLAG");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(501, 114, 114, 40);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("APPLY");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(648, 114, 74, 40);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBackground(new Color(222, 184, 135));
		rdbtnNewRadioButton.setBounds(538, 163, 23, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("APPLY");
		btnNewButton.setForeground(new Color(255, 255, 224));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setBounds(633, 161, 89, 26);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 759, 422);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
