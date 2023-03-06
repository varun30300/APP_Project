package Blueprint;

public class Credentials {
	
	String type;
	String username;
	String password;
	
	public Credentials(String type, String username, String password) {
		this.type = type;
		this.username = username;
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
