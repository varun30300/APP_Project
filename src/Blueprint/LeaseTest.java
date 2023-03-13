package Blueprint;

import org.junit.*;
import static org.junit.Assert.*;

public class LeaseTest {

    Lease lease;

    @Before
    public void setUp() {
        lease = new Lease("001", "101", "001", "2022-01-01", "2022-12-31", "1000");
    }

    @Test
    public void testGetLeaseId() {
        assertEquals("001", lease.getLeaseId());
    }

    @Test
    public void testSetLeaseId() {
        lease.setLeaseId("002");
        assertEquals("002", lease.getLeaseId());
    }

    @Test
    public void testGetRuId() {
        assertEquals("101", lease.getRuId());
    }

    @Test
    public void testSetRuId() {
        lease.setRuId("102");
        assertEquals("102", lease.getRuId());
    }

    @Test
    public void testGetTenantId() {
        assertEquals("001", lease.getTenantId());
    }

    @Test
    public void testSetTenantId() {
        lease.setTenantId("002");
        assertEquals("002", lease.getTenantId());
    }

    @Test
    public void testGetStart() {
        assertEquals("2022-01-01", lease.getStart());
    }

    @Test
    public void testSetStart() {
        lease.setStart("2022-02-01");
        assertEquals("2022-02-01", lease.getStart());
    }

    @Test
    public void testGetEnd() {
        assertEquals("2022-12-31", lease.getEnd());
    }

    @Test
    public void testSetEnd() {
        lease.setEnd("2023-01-31");
        assertEquals("2023-01-31", lease.getEnd());
    }

    @Test
    public void testGetRent() {
        assertEquals("1000", lease.getRent());
    }

    @Test
    public void testSetRent() {
        lease.setRent("1200");
        assertEquals("1200", lease.getRent());
    }
    
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

