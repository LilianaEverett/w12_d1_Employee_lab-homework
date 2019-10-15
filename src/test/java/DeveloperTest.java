import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Ian", "TF345617T", 35000.00);
    }
    @Test
    public void hasName() {
        assertEquals("Ian", developer.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("TF345617T", developer.getNin());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500.00);
        assertEquals(35500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, developer.payBonus(), 0.01);
    }
}
