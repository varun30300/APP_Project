package Blueprint;

public class Apartment extends RentalUnit{
	String aptNum, stName;

	public Apartment(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
			String bathroom, String sqft, String city, String zipCode, String aptNum, String stName) {
		super(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode);
		this.aptNum = aptNum;
		this.stName = stName;
	}
	
}
