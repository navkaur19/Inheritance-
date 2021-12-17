
public class Person {
	private String Name;
	private String Address;
	private int PhoneNumber;
	private String EmailAddress;
	
// Constructor
	public Person(String Name, String Address, int PhoneNumber, String EmailAddress ) {
		this.Name = Name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.EmailAddress = EmailAddress;
	}
// Getters
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	
	public String getEmailAddress() {
		return EmailAddress;
	}
	
// Setters
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
// toString method	
	public String toString() {
		 return getClass() + " Name: " + this.Name + ", Address: "
	               + this.Address + ", Phone: " + this.PhoneNumber + ", Email: "
	               + this.EmailAddress;
	   }
	}

