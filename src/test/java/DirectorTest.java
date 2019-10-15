import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Ross", "TY948376U", 100000.00, "Finance", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ross", director.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("TY948376U", director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(500000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(500.00);
        assertEquals(100500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000.00, director.payBonus(), 0.01);
    }

}
