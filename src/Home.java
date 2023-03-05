import java.util.ArrayList;

import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.Credentials;
import Blueprint.House;
import Blueprint.RentalUnit;
import Blueprint.Tenant;

import java.util.*;

public class Home {
	
	static ArrayList<RentalUnit> units = new ArrayList<RentalUnit>();
	static ArrayList<Tenant> tenants = new ArrayList<Tenant>();
	static ArrayList<Credentials> creds = new ArrayList<Credentials>();
	
	private static void signIn() {
		// TODO Auto-generated method stub
		System.out.println("1. Login with credentials");
		System.out.println("2. Login as Guest");
		System.out.print("Please Select an Option : ");
		Scanner signInSc = new Scanner(System.in);
		int signInInput = Integer.parseInt(signInSc.nextLine());
		if (signInInput == 1) {
			System.out.println("Username : ");
			String username = signInSc.nextLine();
			System.out.println("Password : ");
			String password = signInSc.nextLine();
			
			for(int i = 0 ; i < creds.size() ; i++ ) {
				Credentials temp = creds.get(i);
				if (temp.getUsername().equals(username) && temp.getPassword().equals(password)) {
					if (temp.getType().equals("admin")) {
						adminMainMenu();
					}
					else if (temp.getType().equals("tenant")) {
						System.out.println("Tenant main menu");
					}
				}
				else {
					continue;
				}
			}
			System.out.println("Incorrect Credentials");
			signIn();
			
		}
	}

	public static void adminMainMenu() {
		System.out.println("ADMIN PANEL");
		System.out.println("Please Select an Option : ");
		System.out.println("1. Add a property");
		System.out.println("2. Add a Tenant");
		System.out.println("3. Rent a Unit");
		System.out.println("4. Display all Properties");
		System.out.println("5. Display Rented Properties");
		System.out.println("6. Display Vacant Properties");
		System.out.println("7. Display all lease");
		System.out.println("8. Display Payments Info");
		System.out.println("9. Logout");
		Scanner sc = new Scanner(System.in);
		int mainMenuinput = Integer.parseInt(sc.nextLine());
		if (mainMenuinput == 1) {
			RentalUnit obj = PropertyClass.addAProperty(units.size());
			units.add(obj);
			System.out.println("Property has been added !!");
		}
		else if (mainMenuinput == 2) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
		}
		else if (mainMenuinput == 3) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
		}
		else if (mainMenuinput == 4) {
			PropertyClass.displayProperties(units);
		}
		else if (mainMenuinput == 5) {
			PropertyClass.displayRentedProperties(units);
		}
		else if (mainMenuinput == 6) {
			PropertyClass.displayVacantProperties(units);
		}
		else if (mainMenuinput == 7) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
		}
		else if (mainMenuinput == 8) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
		}
		else if (mainMenuinput == 9) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
			signIn();
		}
		
		else {
			
		}
		
		adminMainMenu();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mock objects 
		units.add(new Apartment("1","rented","nil","nil","Apartment","3","1","1500","Montreal","123456","42","St Mathews"));
		units.add(new Condo("2","vacant","nil","nil","Condo","3","1","1500","Montreal","123456","1","09","St Thiemens"));
		units.add(new House("3","vacant","nil","nil","House","3","1","1500","Montreal","123456","07","St Mathews"));
		
		creds.add(new Credentials("admin","varun","1234"));
		creds.add(new Credentials("admin","angad","4321"));
		creds.add(new Credentials("tenant","deepthi","6789"));
		
//		units Iteration code for reference
//		for(int i = 0 ; i < units.size() ; i++ ) {
//			RentalUnit temp = units.get(i);
//			System.out.println(temp.type);
//		}
		signIn();
	}
}
