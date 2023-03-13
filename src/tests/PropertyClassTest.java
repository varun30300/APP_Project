package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import Blueprint.Apartment;
import Blueprint.Condo;
import Blueprint.House;
import Blueprint.RentalUnit;
import mains.PropertyClass;


public class PropertyClassTest {
    
    @Test
    public void testDisplayProperties() {
    	ArrayList<RentalUnit> units = new ArrayList<>();
        RentalUnit condo = new Condo("1", "rented", "123", "456", "Condo", "2", "2", "1000",
                "Los Angeles", "90001", "101", "1234", "Main St");
        RentalUnit apartment = new Apartment("2", "vacant", "nil", "nil", "Apartment", "1",
                "1", "500", "San Francisco", "94101", "101", "Main St");
        RentalUnit house = new House("3", "vacant", "nil", "nil", "House", "3", "2", "2000",
                "New York", "10001", "1234", "Main St");
        units.add(condo);
        units.add(apartment);
        units.add(house);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PropertyClass.displayProperties(units);

        String expectedOutput = "--------------------------------------------------------\r\n"
        		+ "Property ID: 1\r\n"
        		+ "Property Type: Condo\r\n"
        		+ "Property Address: Unit No - 101, Street No - 1234, Street Name: - Main St, city - Los Angeles, zip code - 90001\r\n"
        		+ "Bedrooms: 2\r\n"
        		+ "Bathrooms: 2\r\n"
        		+ "Square Feet: 1000\r\n"
        		+ "Current Status: rented\r\n"
        		+ "Rented by Tenant : 123\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "Property ID: 2\r\n"
        		+ "Property Type: Apartment\r\n"
        		+ "Property Address: Apt No - 101, Street Name - Main St, city - San Francisco, zip code - 94101\r\n"
        		+ "Bedrooms: 1\r\n"
        		+ "Bathrooms: 1\r\n"
        		+ "Square Feet: 500\r\n"
        		+ "Current Status: vacant\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "Property ID: 3\r\n"
        		+ "Property Type: House\r\n"
        		+ "Property Address: Street No - 1234, Street Name: - Main St, city - New York, zip code - 10001\r\n"
        		+ "Bedrooms: 3\r\n"
        		+ "Bathrooms: 2\r\n"
        		+ "Square Feet: 2000\r\n"
        		+ "Current Status: vacant\r\n"
        		+ "--------------------------------------------------------\r\n";

        assertEquals(expectedOutput, outContent.toString());
    }

	@Test
	public void testDisplayVacantProperties() {
		ArrayList<RentalUnit> units = new ArrayList<>();
        RentalUnit condo = new Condo("1", "rented", "123", "456", "Condo", "2", "2", "1000",
                "Los Angeles", "90001", "101", "1234", "Main St");
        RentalUnit apartment = new Apartment("2", "vacant", "nil", "nil", "Apartment", "1",
                "1", "500", "San Francisco", "94101", "101", "Main St");
        RentalUnit house = new House("3", "vacant", "nil", "nil", "House", "3", "2", "2000",
                "New York", "10001", "1234", "Main St");
        units.add(condo);
        units.add(apartment);
        units.add(house);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PropertyClass.displayVacantProperties(units);
        String expectedOutput = "--------------------------------------------------------\r\n"
        		+ "Property ID: 2\r\n"
        		+ "Property Type: Apartment\r\n"
        		+ "Property Address: Apt No - 101, Street Name - Main St, city - San Francisco, zip code - 94101\r\n"
        		+ "Bedrooms: 1\r\n"
        		+ "Bathrooms: 1\r\n"
        		+ "Square Feet: 500\r\n"
        		+ "Current Status: vacant\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "Property ID: 3\r\n"
        		+ "Property Type: House\r\n"
        		+ "Property Address: Street No - 1234, Street Name: - Main St, city - New York, zip code - 10001\r\n"
        		+ "Bedrooms: 3\r\n"
        		+ "Bathrooms: 2\r\n"
        		+ "Square Feet: 2000\r\n"
        		+ "Current Status: vacant\r\n"
        		+ "--------------------------------------------------------\r\n";
        		

		
			assertEquals(expectedOutput, outContent.toString());
	}
	@Test
	public void testDisplayRentedProperties() {
		ArrayList<RentalUnit> units = new ArrayList<>();
        RentalUnit condo = new Condo("1", "rented", "123", "456", "Condo", "2", "2", "1000",
                "Los Angeles", "90001", "101", "1234", "Main St");
        RentalUnit apartment = new Apartment("2", "vacant", "nil", "nil", "Apartment", "1",
                "1", "500", "San Francisco", "94101", "101", "Main St");
        RentalUnit house = new House("3", "vacant", "nil", "nil", "House", "3", "2", "2000",
                "New York", "10001", "1234", "Main St");
        units.add(condo);
        units.add(apartment);
        units.add(house);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PropertyClass.displayRentedProperties(units);
        String expectedOutput = "--------------------------------------------------------\r\n"
        		+ "Property ID: 1\r\n"
        		+ "Property Type: Condo\r\n"
        		+ "Property Address: Unit No - 101, Street No - 1234, Street Name: - Main St, city - Los Angeles, zip code - 90001\r\n"
        		+ "Bedrooms: 2\r\n"
        		+ "Bathrooms: 2\r\n"
        		+ "Square Feet: 1000\r\n"
        		+ "Current Status: rented\r\n"
        		+ "Rented by Tenant : 123\r\n"
        		+ "--------------------------------------------------------\r\n";
        		

		
			assertEquals(expectedOutput, outContent.toString());
	}
}
