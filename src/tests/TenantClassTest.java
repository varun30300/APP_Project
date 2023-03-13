package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Blueprint.Tenant;
import mains.PropertyClass;
import mains.TenantClass;

public class TenantClassTest {

    ArrayList<Tenant> tenants;
    
    @Before
    public void setUp() {
        tenants = new ArrayList<Tenant>();
        Tenant tenant1 = new Tenant("1", "John Doe", "555-1234", "jdoe@email.com", "active", "1", "A101");
        Tenant tenant2 = new Tenant("2", "Jane Smith", "555-5678", "jsmith@email.com", "inactive", "null", "null");
        tenants.add(tenant1);
        tenants.add(tenant2);
    }
    
    @Test
    public void testAddTenant() {
        String input = "John\n555-1234\njdoe@email.com\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        Tenant newTenant = TenantClass.addTenant(tenants.size());
        assertNotNull(newTenant);
        assertEquals("3", newTenant.getTenantID());
        assertEquals("John", newTenant.getFullName());
        assertEquals("555-1234", newTenant.getPhoneNumber());
        assertEquals("jdoe@email.com", newTenant.getEmail());
        assertEquals("inactive", newTenant.getTenantStatus());
        assertEquals("null", newTenant.getRuId());
        assertEquals("null", newTenant.getLeaseID());
    }
    
    @Test
    public void testDisplayTenant() {
        
        System.out.println("here"+tenants);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TenantClass.displayTenant(tenants);
        String expectedOutput = "--------------------------------------------------------\r\n"
        		+ "Tenant ID : 1\r\n"
        		+ "Tenant Full Name : John Doe\r\n"
        		+ "Tenant Phone Number : 555-1234\r\n"
        		+ "Tenant Email : jdoe@email.com\r\n"
        		+ "Tenant Status : active\r\n"
        		+ "Tenant Rental Unit : 1\r\n"
        		+ "Tenant Lease ID : A101\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "Tenant ID : 2\r\n"
        		+ "Tenant Full Name : Jane Smith\r\n"
        		+ "Tenant Phone Number : 555-5678\r\n"
        		+ "Tenant Email : jsmith@email.com\r\n"
        		+ "Tenant Status : inactive\r\n"
        		+ "Tenant Rental Unit : null\r\n"
        		+ "Tenant Lease ID : null\r\n"
        		+ "--------------------------------------------------------\r\n"
        		+ "";
        		

		
			assertEquals(expectedOutput, outContent.toString());
    }

}

