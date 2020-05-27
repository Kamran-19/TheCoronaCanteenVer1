package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import java.awt.Label;

public class menunonedit {

	private JFrame frmGeneralMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menunonedit window = new menunonedit();
					window.frmGeneralMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menunonedit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeneralMenu = new JFrame();
		frmGeneralMenu.setTitle("General Menu - The Corona Canteen");
		frmGeneralMenu.setResizable(false);
		frmGeneralMenu.getContentPane().setBackground(new Color(222, 184, 135));
		frmGeneralMenu.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1.setBounds(290, 53, 382, 49);
		frmGeneralMenu.getContentPane().add(lblNewLabel_1);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(menunonedit.class.getResource("/manager/logo.png")));
		logo.setBounds(10, 11, 200, 199);
		frmGeneralMenu.getContentPane().add(logo);
		
		JLabel lblNewLabel_1_1 = new JLabel("GENERAL MENU");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 224));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(351, 117, 252, 49);
		frmGeneralMenu.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 221, 754, 14);
		frmGeneralMenu.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Singara.jpg")));
		lblNewLabel.setBounds(30, 246, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Singara");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(40, 340, 100, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("10 /=");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3.setBounds(61, 375, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Samosa.jpg")));
		lblNewLabel_4.setBounds(217, 246, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Samosa");
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(227, 340, 100, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("10 /=");
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(248, 375, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblEggChowmein = new JLabel("Egg Chowmein");
		lblEggChowmein.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Egg Chowmein.jpg")));
		lblEggChowmein.setBounds(424, 246, 90, 90);
		frmGeneralMenu.getContentPane().add(lblEggChowmein);
		
		JLabel lblNewLabel_2_2 = new JLabel("Egg Chowmein");
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(388, 340, 154, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("50 /=");
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(450, 375, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Chicken Sandwich2.jpg")));
		lblNewLabel_6.setBounds(637, 246, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_3 = new JLabel("Chicken Sandwich");
		lblNewLabel_2_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(590, 340, 186, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("110 /=");
		lblNewLabel_3_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(671, 375, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Chicken Fry.jpg")));
		lblNewLabel_5.setBounds(30, 423, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_4 = new JLabel("Chicken Fry");
		lblNewLabel_2_4.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(20, 518, 120, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("70 /=");
		lblNewLabel_3_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(61, 552, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Chicken Tikka.jpg")));
		lblNewLabel_7.setBounds(217, 423, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_5 = new JLabel("Chicken Tikka");
		lblNewLabel_2_5.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_5.setBounds(188, 517, 147, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("40 /=");
		lblNewLabel_3_5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(248, 552, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_8 = new JLabel("Patties");
		lblNewLabel_8.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Meat Lover Pizza.jpg")));
		lblNewLabel_8.setBounds(424, 423, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_6 = new JLabel("Meat Lover Pizza");
		lblNewLabel_2_6.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_6.setBounds(394, 518, 171, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("120 /=");
		lblNewLabel_3_6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(455, 552, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Patties.jpg")));
		lblNewLabel_9.setBounds(637, 423, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_2_7 = new JLabel("Patties");
		lblNewLabel_2_7.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_7.setBounds(647, 517, 100, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_3_7 = new JLabel("40 /=");
		lblNewLabel_3_7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_7.setBounds(668, 552, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Italian Pizza.jpg")));
		lblNewLabel_10.setBounds(30, 595, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_2_8 = new JLabel("Italian Pizza");
		lblNewLabel_2_8.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_8.setBounds(20, 689, 120, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_3_8 = new JLabel("110 /=");
		lblNewLabel_3_8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_8.setBounds(61, 724, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Shawarma.jpg")));
		lblNewLabel_11.setBounds(217, 595, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_9 = new JLabel("Shwarma");
		lblNewLabel_2_9.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_9.setBounds(217, 689, 100, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_3_9 = new JLabel("80 /=");
		lblNewLabel_3_9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(248, 724, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Chicken Chowmein.jpg")));
		lblNewLabel_12.setBounds(424, 595, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_2_10 = new JLabel("Chicken Chowmein");
		lblNewLabel_2_10.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_10.setBounds(373, 689, 200, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_3_10 = new JLabel("70 /=");
		lblNewLabel_3_10.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_10.setBounds(455, 724, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(menunonedit.class.getResource("/Foods/Naan.jpg")));
		lblNewLabel_13.setBounds(637, 595, 90, 90);
		frmGeneralMenu.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_2_11 = new JLabel("Naan");
		lblNewLabel_2_11.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_2_11.setBounds(647, 689, 100, 37);
		frmGeneralMenu.getContentPane().add(lblNewLabel_2_11);
		
		JLabel lblNewLabel_3_11 = new JLabel("15 /=");
		lblNewLabel_3_11.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_3_11.setBounds(668, 724, 46, 14);
		frmGeneralMenu.getContentPane().add(lblNewLabel_3_11);
		frmGeneralMenu.setBounds(100, 100, 815, 839);
		frmGeneralMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
