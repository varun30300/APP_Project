package tests;

import org.junit.*;

import Blueprint.Lease;

import static org.junit.Assert.*;

public class LeaseTest {

    
    @Test
	public void testLeaseConstructor() {
		String leaseId = "001";
		String ruId = "123";
		String tenantId = "456";
		String start = "2023-04-01";
		String end = "2024-03-31";
		String rent = "1000";
		
		Lease lease = new Lease(leaseId, ruId, tenantId, start, end, rent);
		
		assertEquals(leaseId, lease.getLeaseId());
		assertEquals(ruId, lease.getRuId());
		assertEquals(tenantId, lease.getTenantId());
		assertEquals(start, lease.getStart());
		assertEquals(end, lease.getEnd());
		assertEquals(rent, lease.getRent());
	}
	








}

