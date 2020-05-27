package universalsignin;

import manager.addemployee;
import employee.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class signingui extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon icon;
	private Container c;
	private Font f,fo;

	private ImageIcon img;
	
	private JLabel title = new JLabel();
	private JLabel title2 = new JLabel();
	
	private JLabel username = new JLabel();
	private JLabel password = new JLabel();
	
	private JLabel blank = new JLabel();
	
	private Checkbox signinemployee = new Checkbox();
	private Checkbox signincustomer = new Checkbox();
	private Checkbox signinmanager = new Checkbox();
	
	private JLabel emp = new JLabel();
	private JLabel cus = new JLabel();
	private JLabel man = new JLabel();
	
	private Checkbox signupemployee = new Checkbox();
	private Checkbox signupcustomer = new Checkbox();
	
	private JLabel emps = new JLabel();
	private JLabel cuss = new JLabel();

	private JButton signin = new JButton();
	private JButton signup = new JButton();
	
	private JTextField use = new JTextField();
	private JPasswordField pass = new JPasswordField();
	
	private String userid,userpass;
	
	
	
	signingui()
	{
		initComponents();
		softBody();
		actions();
		
	}
	
	
	public static void main(String[] args) {
		
		signingui frame = new signingui();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(700,750);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setTitle("Corona Canteen Software Main Page");
		
		
		
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
		fo = new Font("Franklin Gothic",Font.BOLD + Font.ITALIC ,14);
		
		
		title.setText("Canteen Sign In Page"); //sets title
		title.setBounds(215,25,500,50);
		title.setFont(f);
		this.add(title);
		
		signinemployee.setBounds(200,100,10,50);
		this.add(signinemployee);
		
		signincustomer.setBounds(200,150,10,50);
		this.add(signincustomer);
		
		signinmanager.setBounds(200,200,10,50);
		this.add(signinmanager);
		
		emp.setText("Employee Sign In"); 
		emp.setBounds(230,100,500,50);
		emp.setFont(fo);
		this.add(emp);
		
		cus.setText("Customer Sign In"); 
		cus.setBounds(230,150,500,50);
		cus.setFont(fo);
		this.add(cus);
		
		man.setText("Manager Sign In");
		man.setBounds(230,200,500,50);
		man.setFont(fo);
		this.add(man);
		
		username.setText("Enter Username: ");
		username.setBounds(190,250,500,50);
		username.setFont(fo);
		this.add(username);
		
		password.setText("Enter Password: ");
		password.setBounds(190,300,500,50);
		password.setFont(fo);
		this.add(password);
		
		use.setBounds(350,260,250,35);
		use.setFont(fo);
		this.add(use);
		
		pass.setBounds(350,305,250,35);
		pass.setFont(fo);
		this.add(pass);
		
		title2.setText("Register If You Don't Have An Account"); //sets title
		title2.setBounds(150,435,500,50);
		title2.setFont(f);
		this.add(title2);
		
		signupemployee.setBounds(200,500,10,50);
		this.add(signupemployee);
		
		signupcustomer.setBounds(200,550,10,50);
		this.add(signupcustomer);
		
		emps.setText("Employee Sign Up"); 
		emps.setBounds(230,500,500,50);
		emps.setFont(fo);
		this.add(emps);
		
		cuss.setText("Customer Sign Up"); 
		cuss.setBounds(230,550,500,50);
		cuss.setFont(fo);
		this.add(cuss);
		
		signin.setText("Go To Sign In");
		signin.setBounds(250,350,200,50);
		this.add(signin);
		
		signup.setText("Go To Sign Up");
		signup.setBounds(250,635,200,50);
		this.add(signup);
		
		
		use.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				userid = use.getText();
				if(userid.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your username.");
							
			}		                                              
			});
		
		pass.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				userpass = pass.getText();
				if(userpass.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your password.");
							
			}		                                              
			});
	
		
		
		
		blank.setText(" ");
	 	blank.setBounds(100,650,10,50);
		this.add(blank);
		
		
	}
	
	private void actions() {
		


		
		EmployeeMainGUI obj1 = new EmployeeMainGUI();
		
		
		
		signin.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				if(signinemployee.getState()==true)
				{
					boolean flag;
					String compare = userid + ',' +userpass ;

										
					File customer = new File("Storage\\Employee_info.txt");
			        Scanner scan = null;
			        
					try {
						
						scan = new Scanner(customer);
						
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}

			        int flag_login = 0;

			        while (scan.hasNextLine()) {

			            String data = scan.nextLine();

			            // System.out.println(data1);
			            if (data.contains(compare)) {
			                flag_login = flag_login + 1;
			            }

			        }
			       
			        if (flag_login != 0) {
			            flag = true;
			            
			        } else {
			            flag = false;
			        }

			        if(flag==true)
			        {
			        	obj1.allmethods();
			        }

			    }
					
					
		
				else if(signincustomer.getState()==true)
				{
					//to be done
				}
				else if(signinmanager.getState()==true)
				{
					//to be done
				}	
				
			
		}
					
	}		                                             
	);
		
		
		signup.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				if(signupemployee.getState()==true)
				{
					addemployee aeobj = new addemployee();
					aeobj.main(null);
					
				}
				else if(signupcustomer.getState()==true)
				{
					//to be done
				}	
				
			
		}
					
	}		                                             
	);
		
		
		
	}
	
	
	
	

}
