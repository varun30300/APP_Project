import java.util.*;

import Blueprint.Tenant;

public class TenantClass {
	public static Tenant addTenant(int size) {
		Scanner addATenantSc = new Scanner(System.in);
		String tenantID = String.valueOf(size+1); 
		String fullName;
		String phoneNumber;
		String email;
		
		// set fullName 
		System.out.print("Enter tenant's Full Name : ");
		fullName = addATenantSc.nextLine();
		System.out.println();
		
		// set phoneNumber 
		System.out.print("Enter tenant's Phone Number : ");
		phoneNumber = addATenantSc.nextLine();
		System.out.println();
		
		// set email 
		System.out.print("Enter tenant's email : ");
		email = addATenantSc.nextLine();
		System.out.println();
				
		Tenant newTenant = new Tenant(tenantID,fullName, phoneNumber, email, "invalid", "null", "null");
		
		return newTenant;
	}
	
	public static void displayTenant(ArrayList<Tenant> tenants) {
		for(Tenant tenant : tenants) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Tenant ID : " + tenant.getTenantID());
			System.out.println("Tenant Full Name : " + tenant.getFullName());
			System.out.println("Tenant Phone Number : " + tenant.getPhoneNumber());
			System.out.println("Tenant Email : " + tenant.getEmail());
			System.out.println("Tenant Status : " + tenant.getTenantStatus());
			System.out.println("Tenant Rental Unit : " + tenant.getRuId());
			System.out.println("Tenant Lease ID : " + tenant.getLeaseID());
			System.out.println("--------------------------------------------------------");
		}
	}
}
