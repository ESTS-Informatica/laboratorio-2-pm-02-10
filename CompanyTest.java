

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company1;
    private ArrayList<User> clients;
    private ArrayList<User> sellers;
    
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        User client1 = new User(
        "José Manuel", "911111111", 
        "zemanel@yahoo.com");
        User client2 = new User(
        "António Francisco", "922222222", 
        "tochico@hotmail.com");
        clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        sellers = new ArrayList<>();
        User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        sellers.add(seller1);
        sellers.add(seller2);
        company1 = new Company(clients,sellers);
    }

    @Test
    public void testConstructor(){
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSellers());
    }
    
    @Test
    public void testRegisterClient(){
        User client3 = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        assertEquals(true,company1.registerClient(client3));
    }
    
    @Test
    public void testRegisterClients(){
        User client = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        User client2 = new User(
        "mike", "156413615", 
        "waltuh@hotmail.com");
        assertEquals(true,company1.registerClient(client));
        assertEquals(true,company1.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        User client = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        assertEquals(true,company1.registerClient(client));
        assertEquals(false,company1.registerClient(client));
    }
    
    @Test
    public void testRegisterClientNull(){
        User client = null;
        assertEquals(false,company1.registerClient(client));
    }
    
    @Test
    public void testRegisterSeller(){
        User seller = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        assertEquals(true,company1.registerSeller(seller));
    }
    
    @Test
    public void testRegisterSellers(){
        User seller = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        User seller2 = new User(
        "mike", "156413615", 
        "waltuh@hotmail.com");
        assertEquals(true,company1.registerSeller(seller));
        assertEquals(true,company1.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        User seller = new User(
        "Zé", "111111111", 
        "zeeee@hotmail.com");
        assertEquals(true,company1.registerSeller(seller));
        assertEquals(false,company1.registerSeller(seller));
    }
    
    @Test
    public void testRegisterSellerNull(){
        User seller = null;
        assertEquals(false,company1.registerSeller(seller));
    }
    
    @Test
    public void testRegisterProperty(){
        Property property = new Property("nada", 0.0);
        assertEquals(true,company1.registerProperty(property));
    }
    
    @Test
    public void testRegisterProperties(){
        Property property = new Property("nada", 0.0);
        Property property2 = new Property(
        "nada", 1.0);
        assertEquals(true,company1.registerProperty(property));
        assertEquals(true,company1.registerProperty(property2));
    }
    
    @Test
    public void testRegisterPropertyDuplicate(){
        Property property = new Property("nada", 0.0);
        assertEquals(true,company1.registerProperty(property));
        assertEquals(false,company1.registerProperty(property));
    }
    
    @Test
    public void testRegisterPropertyNull(){
        Property property = null;
        assertEquals(false,company1.registerProperty(property));
    }
    
    //Nivel 5
    
    @Test
    public void testCreateSell(){
        //assertEquals(true, company1.createSell(new Sell()));
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
