
public class Student extends Person  {

	public final String STATUS;

public Student(String Name, String Address, int PhoneNumber, String EmailAddress, String Status ) {
	super(Name, Address, PhoneNumber, EmailAddress);
	STATUS = Status;
}
public String getSTATUS() {
	return STATUS;
}
public String toString() {
	 return getClass()+ super.toString() +  " Status: " + STATUS;
  }
}
