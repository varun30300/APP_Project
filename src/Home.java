import java.util.ArrayList;
import java.util.*;

public class Home {
	
	static ArrayList<RentalUnit> units = new ArrayList<RentalUnit>();
//	(String ruId, String status, String tenantId, String leaseId, String type, String bedrooms,
//	String bathroom, String sqft, String city, String zipCode, String unitNum, String stNum, String stName)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		units.add(new Apartment("1","vacant","nil","nil","Apartment","3","1","1500","Montreal","123456","42","St Mathews"));
		units.add(new Condo("1","vacant","nil","nil","Condo","3","1","1500","Montreal","123456","1","09","St Thiemens"));
		units.add(new House("1","vacant","nil","nil","House","3","1","1500","Montreal","123456","07","St Mathews"));
		
		for(int i = 0 ; i < units.size() ; i++ ) {
			RentalUnit temp = units.get(i);
			System.out.println(temp.type);
		}

		
	}

}
