//	this.city = city;
//	this.zipCode = zipCode;
import java.util.*;

import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.House;
import Blueprint.RentalUnit;
public class PropertyClass {
	
	public static RentalUnit  addAProperty(int size){
		Scanner addAPropertySc = new Scanner(System.in);
		String ruId = String.valueOf(size+1);
		String status = "vacant";
		String tenantId = "nil";
		String leaseId = "nil";
		String unitNum = "";
		String stNum = "";
		String stName = "";
		String aptNum = "";
		
		// set type 
		System.out.print("Enter property type : ");
		String type = addAPropertySc.nextLine();
		System.out.println();
		
		// set bedrooms
		System.out.print("Enter number of Bedrooms : ");
		String bedrooms = addAPropertySc.nextLine();
		System.out.println();
		
		// set bedrooms
		System.out.print("Enter number of Bathrooms : ");
		String bathrooms = addAPropertySc.nextLine();
		System.out.println();
		
		// set sqft
		System.out.print("Enter sqft of the property : ");
		String sqft = addAPropertySc.nextLine();
		System.out.println();
		
		// set unique address 
		if (type.equals("Condo")) {
			System.out.print("Enter Unit number of the property : ");
			unitNum = addAPropertySc.nextLine();
			System.out.println();
			
			System.out.print("Enter Street number of the property : ");
			stNum = addAPropertySc.nextLine();
			System.out.println();
			
			System.out.print("Enter Street name of the property : ");
			stName = addAPropertySc.nextLine();
			System.out.println();
		}
		else if (type.equals("Apartment")) {
			System.out.print("Enter Apartment number of the property : ");
			aptNum = addAPropertySc.nextLine();
			System.out.println();
			
			System.out.print("Enter Street name of the property : ");
			stName = addAPropertySc.nextLine();
			System.out.println();
		}
		else if (type.equals("House")) {
			System.out.print("Enter Street number of the property : ");
			stNum = addAPropertySc.nextLine();
			System.out.println();
			
			System.out.print("Enter Street name of the property : ");
			stName = addAPropertySc.nextLine();
			System.out.println();
		}
		
		// set common address
		System.out.print("Enter city : ");
		String city = addAPropertySc.nextLine();
		System.out.println();
		
		System.out.print("Enter zipcode : ");
		String zipCode = addAPropertySc.nextLine();
		System.out.println();
		
		// creating the Rental unit object for returning
		if (type.equals("Condo")) {
			RentalUnit obj = new Condo(ruId, status, tenantId, leaseId, type, bedrooms, bathrooms, sqft, city, zipCode, unitNum, stNum, stName);
			return obj;
		}
		else if (type.equals("Apartment")) {
			RentalUnit obj = new Apartment(ruId, status, tenantId, leaseId, type, bedrooms, bathrooms, sqft, city, zipCode, aptNum, stName);
			return obj;
		}
		else if (type.equals("House")) {
			RentalUnit obj = new House(ruId, status, tenantId, leaseId, type, bedrooms, bathrooms, sqft, city, zipCode, stNum, stName);
			return obj;
		}
		return null;

	}

	
}
