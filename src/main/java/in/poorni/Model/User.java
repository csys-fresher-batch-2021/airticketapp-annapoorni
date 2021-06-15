package in.poorni.Model;

import java.time.LocalDate;
public class User {
	private String username;
	private int age;
	private Long phoneNumber;
	private String email;
	private String password;
	private String gender;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + ", gender=" + gender + ", address=" + address + "]";
	}
	public String getPassword() {
		return password;
	}
	public User(String username, int age, Long phoneNumber, String email, String password, String gender,
			String address) {
		super();
		this.username = username;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.address = address;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}