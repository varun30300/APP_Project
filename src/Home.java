import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.Credentials;
import Blueprint.House;
import Blueprint.Interest;
import Blueprint.Lease;
import Blueprint.RentalUnit;
import Blueprint.Tenant;

import java.util.*;

public class Home {
	
	static ArrayList<RentalUnit> units = new ArrayList<RentalUnit>();
	static ArrayList<Tenant> tenants = new ArrayList<Tenant>();
	static ArrayList<Credentials> creds = new ArrayList<Credentials>();
	static ArrayList<Interest> notif = new ArrayList<Interest>();
	static ArrayList<Lease> leases = new ArrayList<Lease>();
	
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
						tenantMainMenu(temp.getTenID());
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
			
			for (RentalUnit unit : units) {
				if (unit.getRuId().equals(interestedPID) && unit.getStatus().equals("rented")) {
					System.out.println("The property you are interested in is currently rented. We will send you an email when it is vacant.");
					ArrayList<String> temp = unit.getWaitList();
					temp.add(interestedEmail);
					unit.setWaitList(temp);
				}
			}
		}
		else if (guesttMainMenuinput == 3) {
			signIn();
		}
		guestMainMenu();
	}
	
	public static void tenantMainMenu(String id) {
		System.out.println("TENANT PANEL");
		System.out.println("1. Display all Properties"); //--done
		System.out.println("2. Display Rented Properties"); //--done
		System.out.println("3. Display Vacant Properties"); //--done
		System.out.println("4. Pay Rent"); //--done
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
		else if (tenantMainMenuinput == 4) {
			Scanner payRentSc = new Scanner(System.in);
			
			System.out.print("For which month do you want to pay rent (mm/yy) : ");
			String month = payRentSc.nextLine();
			System.out.println();
			
			System.out.println("Enter your rent amount : ");
			String rentAmt = payRentSc.nextLine();
			System.out.println();
			
			
			
			for(Tenant tenant : tenants) {
				if (tenant.getTenantID().equals(id)) {
					HashMap<String, String> temp = tenant.getPayments();
					temp.put(month, rentAmt);
					tenant.setPayments(temp);
					System.out.println("Rent is paid.");
				}
			}
		}
		else if (tenantMainMenuinput == 5) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
			signIn();
		}
		tenantMainMenu("0");
	}

	public static void adminMainMenu() {
		System.out.println("ADMIN PANEL");
		System.out.println("1. Add a property"); //--done
		System.out.println("2. Add a Tenant"); // --done
		System.out.println("3. Rent a Unit"); //-done
		System.out.println("4. Display all Properties"); //--done
		System.out.println("5. Display Rented Properties"); //--done
		System.out.println("6. Display Vacant Properties"); //--done
		System.out.println("7. Display all Tenant"); //--done
		System.out.println("8. Display all lease"); //-- done
		System.out.println("9. Display Payments Info"); //--done
		System.out.println("10. Show Notifications"); //--done
		System.out.println("11. Vacate a Rental Unit"); //-done
		System.out.println("12. Check pending rents"); //-done
		System.out.println("13. Logout"); //--done
		System.out.print("Please Select an Option : ");
		Scanner sc = new Scanner(System.in);
		int mainMenuinput = Integer.parseInt(sc.nextLine());
		if (mainMenuinput == 1) {
			RentalUnit obj = PropertyClass.addAProperty(units.size());
			units.add(obj);
			System.out.println("Property has been added !!");
		}
		else if (mainMenuinput == 2) {
			Tenant obj = TenantClass.addTenant(tenants.size());
			tenants.add(obj);
			System.out.println("A new Tenant " + obj.getFullName() + " has been added, their Tenant ID is " + obj.getTenantID() + " ,please share this with the new tenant.");
			creds.add(new Credentials("tenant", obj.getFullName(), obj.getPassword(), obj.getTenantID()));
			System.out.println("Their credentials are : " + obj.getFullName() + " | " + obj.getPassword());
		}
		else if (mainMenuinput == 3) {
			Scanner rentAPropSc = new Scanner(System.in);
			
			System.out.println("________________________________________");
			System.out.println("Creating a new LEASE");
			
			System.out.print("Enter Tenant ID : ");
			String tenID = rentAPropSc.nextLine();
			System.out.println();
			
			System.out.print("Enter Property ID : ");
			String ruID = rentAPropSc.nextLine();
			System.out.println();
			
			
			String leaseID = String.valueOf(leases.size()+1);
			
			System.out.print("Enter lease start date (mm/yy) : ");
			String start = rentAPropSc.nextLine();
			System.out.println();
			
			System.out.print("Enter lease end date (mm/yy) : ");
			String end = rentAPropSc.nextLine();
			System.out.println();
			
			System.out.print("Enter rent amount : ");
			String rent = rentAPropSc.nextLine();
			System.out.println();
			
			leases.add(new Lease(leaseID, ruID, tenID, start, end, rent));
			
			System.out.println("NEW LEASE CREATED");
//			System.out.println(units.size());
			for(RentalUnit unit : units) {
				if (unit.getRuId().equals(ruID)) {
					unit.setStatus("rented");
					unit.setLeaseId(leaseID);
					unit.setTenantId(tenID);
				}
			}
			
			for(Tenant tenant : tenants) {
				if (tenant.getTenantID().equals(tenID)) {
					tenant.setTenantStatus("active");
					tenant.setRuId(ruID);
					tenant.setLeaseID(leaseID);
				}
			}
			
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
			TenantClass.displayTenant(tenants);
		}
		else if (mainMenuinput == 8) {
			for(Lease lease: leases) {
				String tenID = lease.getTenantId();
				String name ="";
				for (Tenant tenant : tenants) {
					if (tenant.getTenantID().equals(tenID)) {
						name = tenant.getFullName();
						break;
					}
				}
				System.out.println("__________________");
				System.out.println("Lease ID :" + lease.getLeaseId());
				System.out.println("Tenant is " + name);
				System.out.println("Lease starts on " + lease.getStart() + " and ends on " + lease.getEnd());
				System.out.println("Rent anount is " + lease.getRent());
			}
		}
		else if (mainMenuinput == 9) {
			for(Tenant tenant: tenants) {
				HashMap<String, String> temp = tenant.getPayments();
				System.out.println("Payment info of Tenant ID : " + tenant.getTenantID());
				 for (Map.Entry<String,String> mapElement : temp.entrySet()) {
					 String key = mapElement.getKey();
					 String value = mapElement.getValue();
					 System.out.println(key + " : " + value);
				 }
				 System.out.println("_________________");
			}
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
		if (mainMenuinput == 13) {
			signIn();
		}
		
		if (mainMenuinput == 12) {
			
			Scanner rentCheckSc = new Scanner(System.in);
			
			System.out.println("Enter the month and year (mm/yy) : ");
			String check = rentCheckSc.nextLine();
			System.out.println();
			
			for (Tenant tenant : tenants) {
				if (tenant.getPayments().containsKey(check) == false) {
					System.out.println(tenant.getFullName() + "---------- pending");
				}
			}
			
		}
		
		else if (mainMenuinput == 11) {
			// reset the status ruid leaseid of the tenant living in the unit  //-done
			// reset status tenantid and lease id of the property  // - done
			// send email to everyone on ruId waitlist // -done
			// reset the waitlist //-done
			Scanner vacateSc = new Scanner(System.in);
		
			System.out.println("Enter the Property ID you want to vacate : ");
			String ruID = vacateSc.nextLine();
			String tenID = "";
//			String leaseID = "";
			
			for(RentalUnit unit : units) {
				if (unit.getRuId().equals(ruID)) {
					tenID = unit.getTenantId();
					unit.setTenantId("nil");
					unit.setStatus("vacant");
					unit.setLeaseId("nil");
					
					for (String email : unit.getWaitList()) {
						System.out.println("Email Sent to " + email);
					}
					
					unit.setWaitList(new ArrayList<String>());
				}
			}
			
			for (Tenant tenant :tenants) {
				if (tenant.getTenantID().equals(tenID)) {
					tenant.setRuId("null");
					tenant.setTenantStatus("inactive");
					tenant.setLeaseID("null");
				}
			}
			
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
		
		creds.add(new Credentials("admin","varun","1234","-1"));
		creds.add(new Credentials("admin","angad","4321","-1"));
//		creds.add(new Credentials("tenant","deepthi","6789"));
		
//		units Iteration code for reference
//		for(int i = 0 ; i < units.size() ; i++ ) {
//			RentalUnit temp = units.get(i);
//			System.out.println(temp.type);
//		}
		signIn();
	}
}
