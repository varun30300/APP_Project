package Blueprint;
import org.junit.Test;
import static org.junit.Assert.*;

public class CredentialsTest {
    @Test
    public void testCredentialsConstructor() {
        String type = "Admin";
        String username = "admin";
        String password = "password";
        
        Credentials credentials = new Credentials(type, username, password);
        
        assertEquals(type, credentials.getType());
        assertEquals(username, credentials.getUsername());
        assertEquals(password, credentials.getPassword());
    }
    
    @Test
    public void testCredentialsSetter() {
        String type = "User";
        String username = "user";
        String password = "password";
        
        Credentials credentials = new Credentials("", "", "");
        
        credentials.setType(type);
        credentials.setUsername(username);
        credentials.setPassword(password);
        
        assertEquals(type, credentials.getType());
        assertEquals(username, credentials.getUsername());
        assertEquals(password, credentials.getPassword());
    }
}

