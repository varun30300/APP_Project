import java.util.ArrayList;

import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.Credentials;
import Blueprint.House;
import Blueprint.Interest;
import Blueprint.RentalUnit;
import Blueprint.Tenant;

import java.util.*;

public class Home {
	
	static ArrayList<RentalUnit> units = new ArrayList<RentalUnit>();
	static ArrayList<Tenant> tenants = new ArrayList<Tenant>();
	static ArrayList<Credentials> creds = new ArrayList<Credentials>();
	static ArrayList<Interest> notif = new ArrayList<Interest>();
	
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
						tenantMainMenu();
					}
				}
				else {
					continue;
				}
			}
			System.out.println("Incorrect Credentials");
			signIn();
			
		}
		else if (signInInput == 2) {
			guestMainMenu();
		}
	}
	
	public static void guestMainMenu() {
		System.out.println("GUEST PANEL");
		System.out.println("1. Display all Properties"); // done
		System.out.println("2. Interested in any Property ?"); // done
		System.out.println("3. Logout"); // done
		Scanner GMMsc = new Scanner(System.in);
		int guesttMainMenuinput = Integer.parseInt(GMMsc.nextLine());
		if (guesttMainMenuinput == 1) {
			PropertyClass.displayProperties(units);
		}
		else if (guesttMainMenuinput == 2) {
			// to do --- return an interest object, then append it to the array list
			System.out.print("Enter the property ID : ");
			String interestedPID = GMMsc.nextLine();
			System.out.println();
			
			System.out.print("Enter First Name : ");
			String interestedFname = GMMsc.nextLine();
			System.out.println();
			
			System.out.print("Enter Last Name : ");
			String interestedLname = GMMsc.nextLine();
			System.out.println();
			
			System.out.print("Enter Email : ");
			String interestedEmail = GMMsc.nextLine();
			System.out.println();
			
			System.out.print("Enter Phone Number : ");
			String interestedPhNum = GMMsc.nextLine();
			System.out.println();
			
			notif.add(new Interest(interestedPID,interestedFname,interestedLname,interestedEmail,interestedPhNum));
		}
		else if (guesttMainMenuinput == 3) {
			signIn();
		}
		guestMainMenu();
	}
	
	public static void tenantMainMenu() {
		System.out.println("TENANT PANEL");
		System.out.println("1. Display all Properties"); //--done
		System.out.println("2. Display Rented Properties"); //--done
		System.out.println("3. Display Vacant Properties"); //--done
		System.out.println("4. Pay Rent");
		System.out.println("5. Logout"); //--done
		System.out.print("Please Select an Option : ");
		Scanner TMMsc = new Scanner(System.in);
		int tenantMainMenuinput = Integer.parseInt(TMMsc.nextLine());
		if (tenantMainMenuinput == 1) {
			PropertyClass.displayProperties(units);
		}
		else if (tenantMainMenuinput == 2) {
			PropertyClass.displayRentedProperties(units);
		}
		else if (tenantMainMenuinput == 3) {
			PropertyClass.displayVacantProperties(units);
		}
		else if (tenantMainMenuinput == 5) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
			signIn();
		}
		tenantMainMenu();
	}

	public static void adminMainMenu() {
		System.out.println("ADMIN PANEL");
		System.out.println("1. Add a property"); //--done
		System.out.println("2. Add a Tenant"); 
		System.out.println("3. Rent a Unit"); 
		System.out.println("4. Display all Properties"); //--done
		System.out.println("5. Display Rented Properties"); //--done
		System.out.println("6. Display Vacant Properties"); //--done
		System.out.println("7. Display all Tenant");
		System.out.println("8. Display all lease");
		System.out.println("9. Display Payments Info");
		System.out.println("10. Show Notifications"); //--done
		System.out.println("11. Logout"); //--done
		System.out.print("Please Select an Option : ");
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
		}
		else if (mainMenuinput == 10) {
			System.out.println("NOTIFICATIONS");
			System.out.println();
			for(int i = 0 ; i < notif.size() ; i++ ) {
				Interest temp = notif.get(i);
				System.out.println(temp.getFirstName() + " " +temp.getLastName() + " is interested in Property ID : " + temp.getRuID());
				System.out.println("Their contact details are : " + temp.getPhone() + " | " + temp.getEmail());
				System.out.println();
			}
		}
		else if (mainMenuinput == 11) {
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
