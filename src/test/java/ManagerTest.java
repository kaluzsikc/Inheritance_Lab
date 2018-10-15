import Employee.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", 123456, 50000.00, "Development");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(123456, manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, manager.getSalary(),0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canGetARaise(){
        manager.raiseSalary(5555.55);
        assertEquals(55555.55, manager.getSalary(),0.01);
    }

    @Test
    public void canNotRaiseSalaryWithNegativeValue(){
        manager.raiseSalary(- 5000.50);
        assertEquals(50000.00, manager.getSalary(),0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Allan");
        assertEquals("Allan", manager.getName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.00, manager.payBonus(),0.01);
    }

}
