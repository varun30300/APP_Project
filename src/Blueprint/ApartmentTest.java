package Blueprint;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApartmentTest {
    @Test
    public void testApartmentConstructor() {
        String ruId = "123";
        String status = "Available";
        String tenantId = "";
        String leaseId = "";
        String type = "Apartment";
        String bedrooms = "2";
        String bathroom = "2";
        String sqft = "1000";
        String city = "New York";
        String zipCode = "10001";
        String aptNum = "123A";
        String stName = "Main St";
        
        Apartment apartment = new Apartment(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode, aptNum, stName);
        
        assertEquals(ruId, apartment.getRuId());
        assertEquals(status, apartment.getStatus());
        assertEquals(tenantId, apartment.getTenantId());
        assertEquals(leaseId, apartment.getLeaseId());
        assertEquals(type, apartment.getType());
        assertEquals(bedrooms, apartment.getBedrooms());
        assertEquals(bathroom, apartment.getBathroom());
        assertEquals(sqft, apartment.getSqft());
        assertEquals(city, apartment.getCity());
        assertEquals(zipCode, apartment.getZipCode());
        assertEquals(aptNum, apartment.getAptNum());
        assertEquals(stName, apartment.getStName());
    }
}
