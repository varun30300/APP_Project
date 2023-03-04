package Blueprint;

public class Apartment extends RentalUnit{
	String aptNum, stName;

	public String getAptNum() {
		return aptNum;
	}

	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Apartment(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
			String bathroom, String sqft, String city, String zipCode, String aptNum, String stName) {
		super(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode);
		this.aptNum = aptNum;
		this.stName = stName;
	}
	
}
