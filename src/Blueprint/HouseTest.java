package Blueprint;
import org.junit.Test;
import static org.junit.Assert.*;

public class HouseTest {
    @Test
    public void testHouseConstructor() {
        String ruId = "123";
        String status = "available";
        String tenantId = "";
        String leaseId = "";
        String type = "house";
        String bedrooms = "3";
        String bathroom = "2";
        String sqft = "2000";
        String city = "Los Angeles";
        String zipCode = "90001";
        String stNum = "1234";
        String stName = "Main St";
        
        House house = new House(ruId, status, tenantId, leaseId, type, bedrooms, bathroom, sqft, city, zipCode, stNum, stName);
        
        assertEquals(ruId, house.getRuId());
        assertEquals(status, house.getStatus());
        assertEquals(tenantId, house.getTenantId());
        assertEquals(leaseId, house.getLeaseId());
        assertEquals(type, house.getType());
        assertEquals(bedrooms, house.getBedrooms());
        assertEquals(bathroom, house.getBathroom());
        assertEquals(sqft, house.getSqft());
        assertEquals(city, house.getCity());
        assertEquals(zipCode, house.getZipCode());
        assertEquals(stNum, house.getStNum());
        assertEquals(stName, house.getStName());
    }
    
    @Test
    public void testHouseSetter() {
        House house = new House("", "", "", "", "", "", "", "", "", "", "", "");
        
        String ruId = "123";
        String status = "occupied";
        String tenantId = "456";
        String leaseId = "789";
        String type = "house";
        String bedrooms = "4";
        String bathroom = "3";
        String sqft = "2500";
        String city = "New York";
        String zipCode = "10001";
        String stNum = "5678";
        String stName = "Broadway";
        
        house.setRuId(ruId);
        house.setStatus(status);
        house.setTenantId(tenantId);
        house.setLeaseId(leaseId);
        house.setType(type);
        house.setBedrooms(bedrooms);
        house.setBathroom(bathroom);
        house.setSqft(sqft);
        house.setCity(city);
        house.setZipCode(zipCode);
        house.setStNum(stNum);
        house.setStName(stName);
        
        assertEquals(ruId, house.getRuId());
        assertEquals(status, house.getStatus());
        assertEquals(tenantId, house.getTenantId());
        assertEquals(leaseId, house.getLeaseId());
        assertEquals(type, house.getType());
        assertEquals(bedrooms, house.getBedrooms());
        assertEquals(bathroom, house.getBathroom());
        assertEquals(sqft, house.getSqft());
        assertEquals(city, house.getCity());
        assertEquals(zipCode, house.getZipCode());
        assertEquals(stNum, house.getStNum());
        assertEquals(stName, house.getStName());
    }
}
