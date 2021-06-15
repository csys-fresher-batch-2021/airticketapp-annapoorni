package in.poorni.Model;
import java.sql.*;

public class InsertCustomer {
	public String addCustomer;

	private String firstName, lastName, country, city, state, zip, email;
	long dob;
	
	public String getFirstName(){ return firstName; }
	public void setFirstName(String firstName){ this.firstName = firstName; }
	
	public String getLastName(){ return lastName; }
	public void setLastName(String lastName){ this.lastName = lastName; }
	
	public long getDob(){ return dob; }
	public void setDob(String dob){ int yearDob = 0;
	int monthDob = 0;
	int dayDob = 0;
	this.dob = yearDob + monthDob + dayDob; }
	
	public String getCountry(){ return country; }
	public void setCountry(String country){ this.country = country; }
	
	public String getCity(){ return city; }
	public void setCity(String city){ this.city = city; }
	
	public String getState(){ return state; }
	public void setState(String state){ this.state = state; }
	
	public String getZip(){ return zip; }
	public void setZip(String zip){ this.zip = zip; }
	
	public String getEmail(){ return email; }
	public void setEmail(String email){ this.email = email; }
	public String getCustomer() {
		// TODO Auto-generated method stub
		return addCustomer;
	}
}