package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class rmvemployee {

	private JFrame frmEmployeeRemovalPage;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rmvemployee window = new rmvemployee();
					window.frmEmployeeRemovalPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public rmvemployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeRemovalPage = new JFrame();
		frmEmployeeRemovalPage.setIconImage(Toolkit.getDefaultToolkit().getImage(rmvemployee.class.getResource("/employee/imageee.png")));
		frmEmployeeRemovalPage.setTitle("Employee Removal Page - The Corona Canteen");
		frmEmployeeRemovalPage.setResizable(false);
		frmEmployeeRemovalPage.getContentPane().setBackground(new Color(222, 184, 135));
		frmEmployeeRemovalPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Username");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(50, 81, 165, 42);
		frmEmployeeRemovalPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Username");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(50, 123, 165, 42);
		frmEmployeeRemovalPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Username");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(50, 188, 165, 42);
		frmEmployeeRemovalPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Employee Username");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(50, 221, 165, 42);
		frmEmployeeRemovalPage.getContentPane().add(lblNewLabel_3);
		
		JLabel lblConfirmProcess = new JLabel("Confirm Process : ");
		lblConfirmProcess.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblConfirmProcess.setBounds(129, 274, 165, 42);
		frmEmployeeRemovalPage.getContentPane().add(lblConfirmProcess);
		
		JLabel lblR = new JLabel("EMPLOYEE REMOVAL PAGE");
		lblR.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblR.setBounds(104, 11, 334, 55);
		frmEmployeeRemovalPage.getContentPane().add(lblR);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("\u2705");
		tglbtnNewToggleButton.setBackground(new Color(211, 211, 211));
		tglbtnNewToggleButton.setBounds(279, 286, 121, 23);
		frmEmployeeRemovalPage.getContentPane().add(tglbtnNewToggleButton);
		
		textField = new JTextField();
		textField.setBounds(252, 94, 204, 20);
		frmEmployeeRemovalPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 201, 204, 20);
		frmEmployeeRemovalPage.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 136, 207, 20);
		frmEmployeeRemovalPage.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(252, 234, 204, 20);
		frmEmployeeRemovalPage.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(250, 250, 210));
		btnNewButton.setBounds(225, 334, 89, 46);
		frmEmployeeRemovalPage.getContentPane().add(btnNewButton);
		frmEmployeeRemovalPage.setBounds(100, 100, 566, 430);
		frmEmployeeRemovalPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
