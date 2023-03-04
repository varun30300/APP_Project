package Blueprint;
import java.util.HashMap; 

public class Tenant {
	String tenantID; 
	String fullName;
	String tenantStatus;
	String ruId; 
	String leaseID;
	
	HashMap<String, String> payments = new HashMap<String, String>();
	
	public Tenant(String tenantID, String fullName, String tenantStatus, String ruId, String leaseID) {
		this.tenantID = tenantID;
		this.fullName = fullName;
		this.tenantStatus = tenantStatus;
		this.ruId = ruId;
		this.leaseID = leaseID;
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
