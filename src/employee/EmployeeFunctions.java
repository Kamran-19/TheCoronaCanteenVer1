package employee;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class EmployeeFunctions {
	
	private EmployeeSetter abc = new EmployeeSetter();
	
	
	public void Add_Attendance() throws FileNotFoundException {	
		
		
		JOptionPane.showMessageDialog(null, "Successfully given attendance.");
		
		File employee = new File("Storage\\Employee_info.txt");
		String username = abc.getUsername();
		String[] arrSplit;
		
		
		Scanner scan = new Scanner(employee);
		
		
        while (scan.hasNextLine()) {

            String data = scan.nextLine();

            if (data.contains(username))
            {

                arrSplit = data.split(",");
                String name = arrSplit[2];
                int attendance = Integer.parseInt(arrSplit[3]);

                attendance = attendance+1;
                
                JOptionPane.showMessageDialog(null, "Successfully given attendance.");
                          
            }}
        
        
		
	}
	
	public void Add_Payment() {
		
		
		
		
		
		
	}
	
	public void changepass() {
		
		
		
	}
	

	//The method adds 2000 to the balance of a customer


	public void Add_Balance() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Customer name: ");
    	String search = sc.next();
    	
    	//code to search the customer by using the name
    	//(maybe we can match it by comparing string with the file name of the customer?)
	    
    	//customer'sfile.Balance = 2000 + customer'sfile.Balance;

	        
	    }
    
    //The method displays payroll of the employee

}
