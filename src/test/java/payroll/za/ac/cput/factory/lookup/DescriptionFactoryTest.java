package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.Description;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionFactoryTest {
    @Test
    public void testDesciptionFactory() {


        Description descr =
                new DescriptionFactory().CreateDescriptionFactory("002", "Black");
        System.out.println(descr.toString());
        assertNotNull(descr);


    }
}