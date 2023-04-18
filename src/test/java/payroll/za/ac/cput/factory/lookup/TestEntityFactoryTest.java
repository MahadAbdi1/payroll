package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.TestEnitity;

import static org.junit.jupiter.api.Assertions.*;

class TestEntityFactoryTest {
    @Test
    public void testEntityFacrory(){
        TestEnitity testEnitity =
                TestEntityFactory.CreateTestEntityFactory("test-Id","Test-Name");

        System.out.println(testEnitity.toString());
        assertNotNull(testEnitity);

    }

}