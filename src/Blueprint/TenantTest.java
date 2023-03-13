package Blueprint;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class TenantTest {
	
	Tenant tenant;

	@Before
	public void setUp() throws Exception {
		// Create a new Tenant object for each test case
		//tenant = new Tenant("T001", "John Smith", "Active", "RU001", "L001");
	}

	@Test
	public void testGetTenantID() {
		// Test the getTenantID() method
		assertEquals("T001", tenant.getTenantID());
	}

	@Test
	public void testSetTenantID() {
		// Test the setTenantID() method
		tenant.setTenantID("T002");
		assertEquals("T002", tenant.getTenantID());
	}

	@Test
	public void testGetFullName() {
		// Test the getFullName() method
		assertEquals("John Smith", tenant.getFullName());
	}

	@Test
	public void testSetFullName() {
		// Test the setFullName() method
		tenant.setFullName("Jane Doe");
		assertEquals("Jane Doe", tenant.getFullName());
	}

	@Test
	public void testGetTenantStatus() {
		// Test the getTenantStatus() method
		assertEquals("Active", tenant.getTenantStatus());
	}

	@Test
	public void testSetTenantStatus() {
		// Test the setTenantStatus() method
		tenant.setTenantStatus("Inactive");
		assertEquals("Inactive", tenant.getTenantStatus());
	}

	@Test
	public void testGetRuId() {
		// Test the getRuId() method
		assertEquals("RU001", tenant.getRuId());
	}

	@Test
	public void testSetRuId() {
		// Test the setRuId() method
		tenant.setRuId("RU002");
		assertEquals("RU002", tenant.getRuId());
	}

	@Test
	public void testGetLeaseID() {
		// Test the getLeaseID() method
		assertEquals("L001", tenant.getLeaseID());
	}

	@Test
	public void testSetLeaseID() {
		// Test the setLeaseID() method
		tenant.setLeaseID("L002");
		assertEquals("L002", tenant.getLeaseID());
	}

	@Test
	public void testGetPayments() {
		// Test the getPayments() method
		HashMap<String, String> payments = tenant.getPayments();
		assertNotNull(payments);
		assertTrue(payments.isEmpty());
	}

	@Test
	public void testSetPayments() {
		// Test the setPayments() method
		HashMap<String, String> payments = new HashMap<String, String>();
		payments.put("2022-01", "1000.00");
		payments.put("2022-02", "1000.00");
		tenant.setPayments(payments);
		
		HashMap<String, String> actualPayments = tenant.getPayments();
		assertNotNull(actualPayments);
		assertFalse(actualPayments.isEmpty());
		assertEquals(2, actualPayments.size());
		assertEquals("1000.00", actualPayments.get("2022-01"));
		assertEquals("1000.00", actualPayments.get("2022-02"));
	}

}

