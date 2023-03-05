//	this.city = city;
//	this.zipCode = zipCode;
import java.util.*;
import java.util.stream.Collectors;

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
	
	public static void displayProperties(ArrayList<RentalUnit> units) {
		for(int i=0;i<units.size();i++) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Property ID: "+ units.get(i).getRuId());
			System.out.println("Property Type: " + units.get(i).getType());
			if(units.get(i).getType().equals("Apartment")) {
				Apartment apt= (Apartment)units.get(i);
				System.out.println("Property Address: Apt No - "+apt.getAptNum()+", Street Name - "+ apt.getStName()+", city - "
						+apt.getCity()+", zip code - "+apt.getZipCode());
				
			}else if(units.get(i).getType().equals("Condo")) {
				Condo condo= (Condo)units.get(i);
				System.out.println("Property Address: Unit No - "+condo.getUnitNum()+", Street No - "+ condo.getStNum()+", Street Name: - "+
				condo.getStName()+", city - "
						+condo.getCity()+", zip code - "+condo.getZipCode());
			}else {
				House house=(House)units.get(i);
				System.out.println("Property Address: Street No - "+ house.getStNum()+", Street Name: - "+
						house.getStName()+", city - "
								+house.getCity()+", zip code - "+house.getZipCode());
			}
			System.out.println("Bedrooms: "+units.get(i).getBedrooms());
			System.out.println("Bathrooms: "+units.get(i).getBathroom());
			System.out.println("Square Feet: "+units.get(i).getSqft());
			System.out.println("Current Status: "+units.get(i).getStatus());
			System.out.println("--------------------------------------------------------");
		}
		
	}

	public static void displayRentedProperties(ArrayList<RentalUnit> units) {
		List<RentalUnit> rentedList = units.stream()
			    .filter(obj -> obj.getStatus().equals("rented"))
			    .collect(Collectors.toList());
		displayProperties((ArrayList<RentalUnit>) rentedList);
	}
	
	public static void displayVacantProperties(ArrayList<RentalUnit> units) {
		List<RentalUnit> vacantList = units.stream()
			    .filter(obj -> obj.getStatus().equals("vacant"))
			    .collect(Collectors.toList());
		displayProperties((ArrayList<RentalUnit>) vacantList);
	}
}
//id, type, address(formated)