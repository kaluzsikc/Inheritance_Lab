import Employee.techStaff.DatabaseAdmin;
import Employee.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Ben", 1234567, 40000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ben", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1234567, databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000.50);
        assertEquals(45000.50, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, databaseAdmin.payBonus(),0.01);
    }
}
