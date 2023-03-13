package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Blueprint.Condo;

class CondoTest {

	@Test
	final void test() {
		   String ruId = "456";
	        String status = "Available";
	        String tenantId = "";
	        String leaseId = "";
	        String type = "Condo";
	        String bedrooms = "1";
	        String bathroom = "1";
	        String sqft = "800";
	        String city = "San Francisco";
	        String zipCode = "94105";
	        String unitNum = "123";
	        String stNum = "123";
	        String stName = "Main St";
	        
	        Condo condo = new Condo(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode, unitNum, stNum, stName);
	        
	        assertEquals(ruId, condo.getRuId());
	        assertEquals(status, condo.getStatus());
	        assertEquals(tenantId, condo.getTenantId());
	        assertEquals(leaseId, condo.getLeaseId());
	        assertEquals(type, condo.getType());
	        assertEquals(bedrooms, condo.getBedrooms());
	        assertEquals(bathroom, condo.getBathroom());
	        assertEquals(sqft, condo.getSqft());
	        assertEquals(city, condo.getCity());
	        assertEquals(zipCode, condo.getZipCode());
	        assertEquals(unitNum, condo.getUnitNum());
	        assertEquals(stNum, condo.getStNum());
	        assertEquals(stName, condo.getStName());
	    }

}
