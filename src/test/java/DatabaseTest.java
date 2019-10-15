import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Dolores", "UI748392R", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dolores", databaseAdmin.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("UI748392R", databaseAdmin.getNin());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals(40500.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, databaseAdmin.payBonus(), 0.01);
    }

}
