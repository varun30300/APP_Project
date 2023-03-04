import java.util.ArrayList;

import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.House;
import Blueprint.RentalUnit;

import java.util.*;

public class Home {
	
	static ArrayList<RentalUnit> units = new ArrayList<RentalUnit>();

	public static void mainMenu() {
		System.out.println("Please Select an Option : ");
		System.out.println("1. Add a property");
		Scanner sc = new Scanner(System.in);
		int mainMenuinput = Integer.parseInt(sc.nextLine());
		if (mainMenuinput == 1) {
			RentalUnit obj = PropertyClass.addAProperty(units.size());
			units.add(obj);
			System.out.println("Property has been added !!");
		}
		if (mainMenuinput == 2) {
//			RentalUnit obj = PropertyClass.displayProperties(units.size());
//			units.add(obj);
		}
		
		mainMenu();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		units.add(new Apartment("1","vacant","nil","nil","Apartment","3","1","1500","Montreal","123456","42","St Mathews"));
		units.add(new Condo("2","vacant","nil","nil","Condo","3","1","1500","Montreal","123456","1","09","St Thiemens"));
		units.add(new House("3","vacant","nil","nil","House","3","1","1500","Montreal","123456","07","St Mathews"));
		
//		units Iteration code for reference
//		for(int i = 0 ; i < units.size() ; i++ ) {
//			RentalUnit temp = units.get(i);
//			System.out.println(temp.type);
//		}
		
		
		mainMenu();
	}
}
