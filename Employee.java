
public class Employee extends Person {
	
	private String Office;
	private double Salary;
	private String DateHired;

	public Employee(String Name, String Address, int PhoneNumber, String EmailAddress,
			String Office, double Salary, String DateHired) {
		super(Name, Address, PhoneNumber, EmailAddress);
		this.Office = Office;
	    this.Salary = Salary;
	    this.DateHired = DateHired;
	}
	
	//getters
	public String getOffice() {
		return Office;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public String getDateHired() {
		return DateHired;
	}
	
	//setters
	public void setOffice(String Office) {
		this.Office = Office;
	}
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	public void setDateHired(String DateHired) {
		this.DateHired = DateHired;
	}
	// toString method
	public String toString() {
		 return getClass() + super.toString() + " Office: " + this.Office + "Salary: " + this.Salary 
				 + "Date Hired: " + this.DateHired;
	   }
}
