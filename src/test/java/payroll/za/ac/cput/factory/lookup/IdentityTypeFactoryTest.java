package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.IdentityType;

import static org.junit.jupiter.api.Assertions.*;

class IdentityTypeFactoryTest {

    @Test
    public void testIdentityTypeFactory(){

        IdentityType identityType = IdentityTypeFactory.CreateIdentityType("002","thembise");
        assertNotNull(identityType);

        System.out.println(identityType.toString());
    }

}