package Blueprint;

import static org.junit.Assert.*;
import org.junit.Test;

public class RentalUnitTest {
    
    @Test
    public void testConstructorAndGetters() {
        RentalUnit rentalUnit = new RentalUnit("123", "available", "", "", "apartment", "2", "1", "1000", "San Francisco", "94110");
        assertEquals("123", rentalUnit.getRuId());
        assertEquals("available", rentalUnit.getStatus());
        assertEquals("", rentalUnit.getTenantId());
        assertEquals("", rentalUnit.getLeaseId());
        assertEquals("apartment", rentalUnit.getType());
        assertEquals("2", rentalUnit.getBedrooms());
        assertEquals("1", rentalUnit.getBathroom());
        assertEquals("1000", rentalUnit.getSqft());
        assertEquals("San Francisco", rentalUnit.getCity());
        assertEquals("94110", rentalUnit.getZipCode());
    }
    
    @Test
    public void testSetters() {
        RentalUnit rentalUnit = new RentalUnit("", "", "", "", "", "", "", "", "", "");
        rentalUnit.setRuId("123");
        rentalUnit.setStatus("available");
        rentalUnit.setTenantId("456");
        rentalUnit.setLeaseId("789");
        rentalUnit.setType("apartment");
        rentalUnit.setBedrooms("2");
        rentalUnit.setBathroom("1");
        rentalUnit.setSqft("1000");
        rentalUnit.setCity("San Francisco");
        rentalUnit.setZipCode("94110");
        assertEquals("123", rentalUnit.getRuId());
        assertEquals("available", rentalUnit.getStatus());
        assertEquals("456", rentalUnit.getTenantId());
        assertEquals("789", rentalUnit.getLeaseId());
        assertEquals("apartment", rentalUnit.getType());
        assertEquals("2", rentalUnit.getBedrooms());
        assertEquals("1", rentalUnit.getBathroom());
        assertEquals("1000", rentalUnit.getSqft());
        assertEquals("San Francisco", rentalUnit.getCity());
        assertEquals("94110", rentalUnit.getZipCode());
    }
}

