package se.TeamGroup.alla;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AppTest 
{
    @Test
    public void test_Customer_Object()
    {
        Customer customer1 = new Customer("Ben","boson","ben@gmail.com",123);

        assertEquals("Ben", customer1.getFirstName());
        assertEquals("boson", customer1.getLastName());
        assertEquals("ben@gmail.com", customer1.getEmail());
        assertEquals(123, customer1.getId());
    }


}
