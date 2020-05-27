package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import universalsignin.firstpage;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class managerguihome {

	private JFrame frmManagerHomePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managerguihome window = new managerguihome();
					window.frmManagerHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public managerguihome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManagerHomePage = new JFrame();
		frmManagerHomePage.setIconImage(Toolkit.getDefaultToolkit().getImage(managerguihome.class.getResource("/universalsignin/imageee.png")));
		frmManagerHomePage.setTitle("Manager Home Page - The Corona Canteen");
		frmManagerHomePage.getContentPane().setBackground(new Color(222, 184, 135));
		frmManagerHomePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome, Manager's Username");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel.setBounds(122, 21, 399, 56);
		frmManagerHomePage.getContentPane().add(lblNewLabel);
		
		JButton ADD = new JButton("Add an Employee");
		ADD.setForeground(new Color(245, 222, 179));
		ADD.setBackground(new Color(0, 128, 128));
		ADD.setBounds(234, 100, 167, 34);
		frmManagerHomePage.getContentPane().add(ADD);
		
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerverifier mk = new managerverifier();				
				mk.main(null);
			}
		});
		
		
		JButton REMOVE = new JButton("Remove an Employee");
		REMOVE.setForeground(new Color(245, 222, 179));
		REMOVE.setBackground(new Color(0, 128, 128));
		REMOVE.setBounds(433, 100, 171, 34);
		frmManagerHomePage.getContentPane().add(REMOVE);
		
		REMOVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerverifier mk = new managerverifier();				
				mk.main(null);
			}
		});
		
		JButton DATABASE = new JButton("Employee Database");
		DATABASE.setForeground(new Color(245, 222, 179));
		DATABASE.setBackground(new Color(0, 128, 128));
		DATABASE.setBounds(234, 145, 167, 34);
		frmManagerHomePage.getContentPane().add(DATABASE);
		
		DATABASE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employeeinfo obj = new employeeinfo();
				obj.main(null);
			}
		});
		
		JButton FLAG = new JButton("Flag an Employee");
		FLAG.setForeground(new Color(245, 222, 179));
		FLAG.setBackground(new Color(0, 128, 128));
		FLAG.setBounds(433, 145, 171, 34);
		frmManagerHomePage.getContentPane().add(FLAG);
		
		JButton FEEDBACK = new JButton("Feedback Section");
		FEEDBACK.setForeground(new Color(245, 222, 179));
		FEEDBACK.setBackground(new Color(0, 128, 128));
		FEEDBACK.setBounds(234, 333, 368, 34);
		frmManagerHomePage.getContentPane().add(FEEDBACK);
		
		JButton PAY = new JButton("Pay Employee");
		PAY.setForeground(new Color(245, 222, 179));
		PAY.setBackground(new Color(0, 128, 128));
		PAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PAY.setBounds(234, 190, 167, 34);
		frmManagerHomePage.getContentPane().add(PAY);
		
		JButton MENU = new JButton("Check Menu");
		MENU.setForeground(new Color(245, 222, 179));
		MENU.setBackground(new Color(0, 128, 128));
		MENU.setBounds(234, 288, 368, 34);
		frmManagerHomePage.getContentPane().add(MENU);
		
		JButton ATTENDANCE = new JButton("Employee Attendance");
		ATTENDANCE.setForeground(new Color(245, 222, 179));
		ATTENDANCE.setBackground(new Color(0, 128, 128));
		ATTENDANCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ATTENDANCE.setBounds(433, 190, 171, 34);
		frmManagerHomePage.getContentPane().add(ATTENDANCE);
		
		JButton SALES = new JButton("Track Total Sales");
		SALES.setForeground(new Color(245, 222, 179));
		SALES.setBackground(new Color(0, 128, 128));
		SALES.setBounds(234, 243, 368, 34);
		frmManagerHomePage.getContentPane().add(SALES);
		
		JLabel icon = new JLabel("");
		icon.setFont(new Font("Arial Black", Font.BOLD, 13));
		icon.setBounds(10, 100, 193, 205);

		Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		icon.setIcon(new ImageIcon(image));
		
		frmManagerHomePage.getContentPane().add(icon);
		
		JButton LOGOUT = new JButton("LOG OUT");
		LOGOUT.setFont(new Font("Arial", Font.BOLD, 10));
		LOGOUT.setForeground(new Color(245, 245, 245));
		LOGOUT.setBackground(new Color(47, 79, 79));
		LOGOUT.setBounds(72, 316, 87, 51);
		
		LOGOUT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmManagerHomePage.dispose();
				firstpage obj = new firstpage();
				obj.main(null);
				
			}
		});
		
		ATTENDANCE.setBounds(433, 190, 171, 34);
		frmManagerHomePage.getContentPane().add(ATTENDANCE);
		
		
		
		frmManagerHomePage.getContentPane().add(LOGOUT);
		frmManagerHomePage.setBounds(100, 100, 652, 456);
		frmManagerHomePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
