import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Liliana", "CT748736A", 80000.00, "Art");
    }

    @Test
    public void hasName(){
        assertEquals("Liliana", manager.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("CT748736A", manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Art", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(80500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canNotRaiseSalaryWhenLessThan0() {
        manager.raiseSalary(-500.00);
        assertEquals(80000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(800.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Maria");
        assertEquals("Maria", manager.getName());
    }

    @Test
    public void canNotChangeName(){
        manager.setName(null);
        assertEquals("Liliana", manager.getName());
    }


}
