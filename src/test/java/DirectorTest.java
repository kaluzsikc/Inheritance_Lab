import Employee.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bob", 1234567, 60000.00,"Board", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1234567, director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000.00, director.getSalary(),0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000.00, director.getBudget(),0.01);
    }

    @Test
    public void canGetARaise(){
        director.raiseSalary(10000.01);
        assertEquals(70000.01, director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00, director.payBonus(),0.01);
    }
}
