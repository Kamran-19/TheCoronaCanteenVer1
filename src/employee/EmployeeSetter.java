package employee;

import java.util.*;

public class EmployeeSetter{
	
		//import Customer.CustomerInfo;
		
		private String FirstName;
	    private String LastName;
	    private String d,m,y,email,pass,dob;
	    private int emcount;
	    
	    public EmployeeSetter() {			
			
		}
	    
		public EmployeeSetter(String firstName, String lastName, String d,String m,String y,String email,String pass) {
			
			FirstName = firstName;
			LastName = lastName;
			this.d = d;
			this.m = m;
			this.y = y;
			this.email = email;
			this.pass = pass;
			
		}


		public String getFirstName() {
			return FirstName;
		}


		public void setFirstName(String firstName) {
			FirstName = firstName;
		}


		public String getLastName() {
			return LastName;
		}


		public void setLastName(String lastName) {
			LastName = lastName;
		}
		
		public String setDOB(String day,String month,String year) {

			dob = day+"/"+month+"/"+year;
			return dob;

		}
		

		public String getDOB() {
			return dob;

		}
		
	    public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPass() {
			return pass;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}

		
		//this method makes username of employee
		
		public String getUsername() {
			
			
			//code where emcount will be taken from a file containing the total number of employees
			
			String username = this.FirstName + emcount;
			emcount++;
			
			//code where new emcount number gets stored in that same file (we will overwrite the file)
			
			
			return username;
			
			
			
		}


}
