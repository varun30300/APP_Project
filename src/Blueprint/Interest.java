package Blueprint;

public class Interest {
	String ruID;
	String firstName;
	String lastName;
	String email;
	String phone;
	
	public Interest(String ruID, String firstName, String lastName, String email, String phone) {
		super();
		this.ruID = ruID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public String getRuID() {
		return ruID;
	}

	public void setRuID(String ruID) {
		this.ruID = ruID;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
