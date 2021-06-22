package in.poorni.model;

public class RegisterModel {
	private String name;
	private String password;
	private String email;
	private String moblieNo;
	private String age;
	private String adhaarNo;
	private String address;
	private String pincode;

	public RegisterModel(String name, String password, String email, String moblieNo, String age, String adhaarNo,
			String address, String pincode) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.moblieNo = moblieNo;
		this.age = age;
		this.adhaarNo = adhaarNo;
		this.address = address;
		this.pincode = pincode;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMoblieNo() {
		return moblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", password=" + password + ", email=" + email + ", moblieNo=" + moblieNo
				+ ", age=" + age + ", adhaarNo=" + adhaarNo + ", address=" + address + ", pincode=" + pincode + "]";
	}



}
