public class House extends RentalUnit{
	String stNum, stName;

	public House(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
			String bathroom, String sqft, String city, String zipCode, String stNum, String stName) {
		super(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode);
		this.stNum = stNum;
		this.stName = stName;
	}
	
}
