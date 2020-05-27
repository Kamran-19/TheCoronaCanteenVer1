package employee;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class EmployeeMainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private ImageIcon icon;
	private Container c;
	private Font f,nor;
	private JLabel header;
	private ImageIcon img;
	
	private JLabel title = new JLabel();
	private JLabel welcome = new JLabel();
	private JLabel name = new JLabel();

	private static JButton attendance = new JButton();
	private static JButton menu = new JButton();
	private static JButton changepass = new JButton();
	private static JButton discountlist = new JButton();
	private static JButton refill = new JButton();
	private static JButton restock = new JButton();
	private static JButton addpayment = new JButton();
	
	private JLabel blank = new JLabel();
	
	private static EmployeeFunctions funcobj = new EmployeeFunctions();
	//private ManagerFunctions manobj = new ManagerFunctions();
	
	
	public void allmethods()
	{
		employeehome();
				
	}
	
	public void employeehome() {
		
		EmployeeMainGUI homeframe = new EmployeeMainGUI();
		
		homeframe.setVisible(true);
		homeframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		homeframe.setSize(900,750);
		homeframe.setLocationRelativeTo(null);
		homeframe.setResizable(false);
		
		homeframe.setTitle("Canteen Software");
		
		homeframe.initComponents();
		homeframe.softBody();		
		homeframe.actions();
		
	
		
	}
	
	public void initComponents()
	{
		 icon = new ImageIcon(getClass().getResource("imageee.png"));
		 this.setIconImage(icon.getImage()); 
		 
		 c = this.getContentPane();
		 Color back = new Color(210,180,140);
		 c.setBackground(back);
		 
 	}
	
	public void softBody() {
		
		f = new Font("Franklin Gothic",Font.BOLD + Font.ITALIC ,50);
		nor = new Font("Franklin Gothic",Font.BOLD + Font.ITALIC ,24);
		
		title.setText("Employee Home Page"); //sets title
		title.setBounds(165,50,800,65);
		title.setFont(f);
		this.add(title);	
		
		
		attendance.setText("Give Attendance");
		attendance.setBounds(150,170,200,50);
		this.add(attendance);
		
		menu.setText("View Menu");
		menu.setBounds(150,240,200,50);
		this.add(menu);
		
		discountlist.setText("Check Discount List");
		discountlist.setBounds(150,310,200,50);
		this.add(discountlist);
		
		changepass.setText("Change Password");
		changepass.setBounds(150,380,200,50);
		this.add(changepass);
		
		refill.setText("Refill Customer Balance");
		refill.setBounds(150,450,200,50);
		this.add(refill);
		
		restock.setText("Request Restock");
		restock.setBounds(150,520,200,50);
		this.add(restock);
		
		addpayment.setText("Add Customer's Payment");
		addpayment.setBounds(150,590,200,50);
		this.add(addpayment);
		
		welcome.setText("Welcome,");
		welcome.setBounds(550,250,800,65);
		welcome.setFont(nor);
		this.add(welcome);
		
		
		// Name of Employee will get replaced by the actual name
		// We will get this name from sign-in GUI
		
		name.setText("Name of Employee");
		name.setBounds(500,290,800,65);
		name.setFont(nor);
		this.add(name);
		
		
		blank.setText(" ");
	 	blank.setBounds(100,120,800,50);
		this.add(blank);
		
		actions();
		
	}
	
	
	private static void actions() {

		//Attendance
		attendance.addActionListener(new ActionListener()
		{
			
			public void actionPerformed (ActionEvent e)
			{
				try {
					
					funcobj.Add_Attendance();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		
		
		
		//View Menu
		menu.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
			//	manobj.viewmenu();
			}
			
		});
		
		//Check Discount
		
		discountlist.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
			//	manobj.viewdiscountlist();
			}
			
		});
		
		//Change Password
		
		changepass.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				funcobj.changepass();
			}
			
		});
		
		//Refill Balance
		
		refill.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				funcobj.Add_Balance();
			}
			
		});
		
		restock.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
			//	manobj.restocklist();
			}
			
		});
		
		addpayment.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				
			}
			
		});
		

	}
	

}
