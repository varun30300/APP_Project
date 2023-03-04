package Blueprint;
public class RentalUnit {
	String ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode;

	public RentalUnit(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
			String bathroom, String sqft, String city, String zipCode) {
		super();
		this.ruId = ruId;
		this.status = status;
		this.tenantId = tenantId;
		this.leaseId = leaseId;
		this.type = type;
		this.bedrooms = bedrooms;
		this.bathroom = bathroom;
		this.sqft = sqft;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getLeaseId() {
		return leaseId;
	}

	public void setLeaseId(String leaseId) {
		this.leaseId = leaseId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getSqft() {
		return sqft;
	}

	public void setSqft(String sqft) {
		this.sqft = sqft;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getRuId() {
		return ruId;
	}

	public void setRuId(String ruId) {
		this.ruId = ruId;
	}
	
}
