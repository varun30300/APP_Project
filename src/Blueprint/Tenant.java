package Blueprint;
import java.util.HashMap; 

public class Tenant {
	String tenantID; 
	String fullName;
	String phoneNumber;
	String email;
	String tenantStatus;
	String ruId; 
	String leaseID;
	String password;

	HashMap<String, String> payments = new HashMap<String, String>(); // month and amt 
	
	public Tenant(String tenantID, String fullName, String phoneNumber, String email, String tenantStatus, String ruId,
			String leaseID) {
		super();
		this.tenantID = tenantID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.tenantStatus = tenantStatus;
		this.ruId = ruId;
		this.leaseID = leaseID;
		this.password = this.tenantID + this.fullName;
	}

	public String getTenantID() {
		return tenantID;
	}

	public void setTenantID(String tenantID) {
		this.tenantID = tenantID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenantStatus() {
		return tenantStatus;
	}

	public void setTenantStatus(String tenantStatus) {
		this.tenantStatus = tenantStatus;
	}

	public String getRuId() {
		return ruId;
	}

	public void setRuId(String ruId) {
		this.ruId = ruId;
	}

	public String getLeaseID() {
		return leaseID;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setLeaseID(String leaseID) {
		this.leaseID = leaseID;
	}

	public HashMap<String, String> getPayments() {
		return payments;
	}

	public void setPayments(HashMap<String, String> payments) {
		this.payments = payments;
	}
	
	
}
