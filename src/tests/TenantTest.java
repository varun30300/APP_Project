package tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;
import Blueprint.Tenant;

public class TenantTest {
	 Tenant tenant = new Tenant("", "John Doe", "1234567890", "johndoe@example.com", "active", "001", "001");

    @Test
    public void testConstructorandGetters() {
      Tenant tenant = new Tenant("", "John Doe", "1234567890", "johndoe@example.com", "active", "001", "001");
      assertEquals("", tenant.getTenantID());
      assertEquals("John Doe", tenant.getFullName());
      assertEquals("1234567890", tenant.getPhoneNumber());
      assertEquals("johndoe@example.com", tenant.getEmail());
      assertEquals("active", tenant.getTenantStatus());
      assertEquals("001", tenant.getRuId());
      assertEquals("001", tenant.getLeaseID());
      assertEquals("John Doe", tenant.getPassword());
    }

	@Test
	public void testSetPayments() {
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

