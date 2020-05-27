package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeGUI extends JFrame{
	


	private static final long serialVersionUID = 1L;
	
	private ImageIcon icon;
	private Container c;
	private Font f,nor;
	private JLabel header;
	private ImageIcon img;
	
	private JLabel fname = new JLabel();
	private JLabel lname = new JLabel();
	
	private JLabel title = new JLabel();
	
	private JLabel blank = new JLabel();
	
	private JLabel age = new JLabel();
	
	private JLabel email = new JLabel();
	private JLabel password = new JLabel();
	
	private JTextField tfname = new JTextField();
	private JTextField tlname = new JTextField();
	
	private JTextField temail = new JTextField();
	private JPasswordField pass;
	
	private JComboBox aged,agem,agey;
	
	private JButton confirm = new JButton();
	private JButton clear = new JButton();
	
	EmployeeMainGUI obj1 = new EmployeeMainGUI();
	
	private String[]
		   d = {    "1", "2", "3", "4", "5", 
		            "6", "7", "8", "9", "10", 
		            "11", "12", "13", "14", "15", 
		            "16", "17", "18", "19", "20", 
		            "21", "22", "23", "24", "25", 
		            "26", "27", "28", "29", "30", 
		            "31" }; 
	private String[]
		   m = {"January","February","March","April",
				 "May","June","July","August","September",
				 "October","November","December"};
	private String[] 			
	       y = { "1969", "1995", "1996", "1997", "1998", 
	            "1999", "2000", "2001", "2002", 
	            "2003", "2004", "2005", "2006", 
	            "2007", "2008", "2009", "2010", 
	            "2011", "2012", "2013", "2014", 
	            "2015", "2016", "2017", "2018", 
	            "2019" };  
	
	private static int flag=0;
	
	public static EmployeeSetter obj = new EmployeeSetter();
	
	public static String first,last,em,passw,day,month,year,username;

	
	public EmployeeGUI()
	{
		initComponents();
		softBody();
		
	}
	
	
	public static void main(String[] args) {
		
		EmployeeGUI frame = new EmployeeGUI();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(700,750);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setTitle("Canteen Software");
		
		
		
	}	

	//to set the icon,background of the application
	
	public void initComponents()
	{
		 icon = new ImageIcon(getClass().getResource("imageee.png"));
		 this.setIconImage(icon.getImage()); 
		 
		 c = this.getContentPane();
		 Color back = new Color(210,180,140);
		 c.setBackground(back);
		 
 	}
	
	public void softBody()
	{
		f = new Font("Franklin Gothic",Font.BOLD + Font.ITALIC ,24);
		
		
		img = new ImageIcon(getClass().getResource("e3.PNG"));	
		header = new JLabel(img);
		header.setBounds(275,20,150,150);
		this.add(header);
		
		title.setText("Employee Sign Up Page"); //sets title
		title.setBounds(215,180,500,50);
		title.setFont(f);
		this.add(title);	
			
		
		//First name and Last name Sections: 
		
	 	fname.setText("First name: ");			
	 	fname.setBounds(135,250,500,50);
	 	fname.setFont(f);
	 	fname.setForeground(Color.white);
		this.add(fname);
		

		tfname.setBounds(370, 255, 250, 37);
		tfname.setFont(f);
		this.add(tfname);
		
		lname.setText("Last name: ");
	 	lname.setBounds(135,310,500,50);
	 	lname.setFont(f);
	 	lname.setForeground(Color.white);
		this.add(lname);
		
		
		tlname.setBounds(370, 315, 250, 37);
		tlname.setFont(f);
		this.add(tlname);
		
		
		tfname.addActionListener(new ActionListener() {
		                                              
		public void actionPerformed(ActionEvent e) {
			
			first = tfname.getText();
			
			if(first.isEmpty())
			JOptionPane.showMessageDialog(null, "Enter your first name.");
						
		}		                                              
		});
			
		
		tlname.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				last = tlname.getText();
				if(last.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your last name.");
							
			}		                                              
			});
		
		
		//Date of Birth, Email and Password Sections: 
		
		age.setText("Date of Birth: ");
		age.setBounds(135, 390, 250, 37);
		age.setFont(f);
	 	age.setForeground(Color.white);
		this.add(age);
		
		aged = new JComboBox(d);
		aged.setBounds(370,380,70,50);
		this.add(aged);
		
		agem = new JComboBox(m);
		agem.setBounds(450,380,90,50);
		this.add(agem);
		
		agey = new JComboBox(y);
		agey.setBounds(550,380,70,50);
		this.add(agey);
		
		aged.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				day = aged.getSelectedItem().toString();
				if(day.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your date of birth.");
							
			}		                                              
			});
		
		agem.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				month = agem.getSelectedItem().toString();
				if(month.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your month of birth.");
							
			}		                                              
			});

		agey.addActionListener(new ActionListener() {
    
			public void actionPerformed(ActionEvent e) {
		
				year = agey.getSelectedItem().toString();
				if(year.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your year of birth.");
					
			}		                                              
			});
		
		
		email.setText("Email ID: ");
	 	email.setBounds(135,460,500,50);
	 	email.setFont(f);
	 	email.setForeground(Color.white);
		this.add(email);
		
		fname.setToolTipText("Email address only");

		temail.setBounds(370, 470, 250, 37);
		temail.setFont(new Font("Arial",Font.BOLD,15));
		this.add(temail);
		
		temail.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				em = temail.getText();
				if(em.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your email address.");
							
			}		                                              
			});

		password.setText("New Password: ");
	 	password.setBounds(135,530,500,50);
	 	password.setFont(f);
	 	password.setForeground(Color.white);
		this.add(password);
		
		fname.setToolTipText("Proposed password only");

		pass = new JPasswordField();
		pass.setBounds(370, 537, 250, 37);
		this.add(pass);
		
		pass.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				passw = pass.getText();
				if(passw.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your proposed password name.");
							
			}		                                              
			});
		
		// Confirmation and Reset buttons
		
		confirm.setText("Confirm Sign Up");
	 	confirm.setBounds(165,600,200,50);
		this.add(confirm);


		{	
		confirm.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				{
					JOptionPane.showMessageDialog(null, "Congratulations. Sign Up Complete!");
					
					obj.setFirstName(first);
					obj.setLastName(last);
					obj.setEmail(em);
					obj.setPass(passw);
					obj.setDOB(day, month, year);
					
					username = obj.getUsername();
					
					JOptionPane.showMessageDialog(null,"Username: "+username+"\nPassword: "+passw);
					
					
					obj1.allmethods();
					
					/*
					
					
					this part of the code will basically store ALL the newly entered data of the employee in an
					employee file, which will consist the data of ALL the employees.
					
					
							
					*/
					
										
				}
				}
							
			}		                                             
			);
		}
		

		clear.setText("Restart");
	 	clear.setBounds(400,600,150,50);
		this.add(clear);
		
		JLabel msg = new JLabel();
		
		msg.setText("please press enter after every entry");
		msg.setBounds(160,650,500,50);
		msg.setFont(f);
		this.add(msg);
		
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				tfname.setText("");
				tlname.setText("");
				temail.setText("");
				pass.setText("");
			}
			
		});
		
		
		
		blank.setText(" ");
	 	blank.setBounds(100,120,500,50);
		this.add(blank);
		
		dispose();
		
		
	}
	
	
	
	
	
	

	
	
	

}
