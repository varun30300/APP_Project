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
	
}
