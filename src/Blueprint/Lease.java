package Blueprint;

public class Lease {
	String leaseId;
	String ruId;
	String tenantId;
	String start;
	String end;
	String rent;
	
	public Lease(String leaseId, String ruId, String tenantId, String start, String end, String rent) {
		super();
		this.leaseId = leaseId;
		this.ruId = ruId;
		this.tenantId = tenantId;
		this.start = start;
		this.end = end;
		this.rent = rent;
	}

	public String getLeaseId() {
		return leaseId;
	}

	public void setLeaseId(String leaseId) {
		this.leaseId = leaseId;
	}

	public String getRuId() {
		return ruId;
	}

	public void setRuId(String ruId) {
		this.ruId = ruId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}
	
	
}
