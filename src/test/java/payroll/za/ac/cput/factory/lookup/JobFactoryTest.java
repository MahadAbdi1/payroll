package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.Job;

import static org.junit.jupiter.api.Assertions.*;

class JobFactoryTest {
    @Test
    public void testJobFactory(){

        Job job =
                JobFactory.createJobFactory("Manager","R20,000","operational");

        System.out.println(job);
        assertNotNull(job);
    }

}