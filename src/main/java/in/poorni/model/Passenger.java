package in.poorni.model;

public class Passenger{
	private 
	String firstName, lastName, dob;
	int custID;
	public String addPassenger;
	public String getCustID;
	public String getFirstName;
	public String getLastName;
	public String getDob;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getGetCustID() {
		return getCustID;
	}
	public void setGetCustID(String getCustID) {
		this.getCustID = getCustID;
	}
	public String getGetFirstName() {
		return getFirstName;
	}
	public void setGetFirstName(String getFirstName) {
		this.getFirstName = getFirstName;
	}
	public String getGetLastName() {
		return getLastName;
	}
	public void setGetLastName(String getLastName) {
		this.getLastName = getLastName;
	}
	public String getGetDob() {
		return getDob;
	}
	public void setGetDob(String getDob) {
		this.getDob = getDob;
	}
	public String getPassenger() {
		return addPassenger;
	}
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", custID=" + custID
				+ ", getCustID=" + getCustID + ", getFirstName=" + getFirstName + ", getLastName=" + getLastName
				+ ", getDob=" + getDob + "]";
	}
	
	
}