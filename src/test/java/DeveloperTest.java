import Employee.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", 1234567, 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1234567, developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000.10);
        assertEquals(35000.10, developer.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(),0.01);
    }
}
