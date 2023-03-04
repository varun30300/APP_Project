package Blueprint;

public class Condo extends RentalUnit{
	String unitNum, stNum, stName;

	public Condo(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
			String bathroom, String sqft, String city, String zipCode, String unitNum, String stNum, String stName) {
		super(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode);
		this.unitNum = unitNum;
		this.stNum = stNum;
		this.stName = stName;
	}  
	
}
