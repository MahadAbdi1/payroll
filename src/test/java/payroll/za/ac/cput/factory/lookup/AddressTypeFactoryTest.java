package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.AddressType;

import static org.junit.jupiter.api.Assertions.*;

class AddressTypeFactoryTest {

    @Test
    public void AddressTypeTest(){

        AddressType addressType = AddressTypeFactory.createAddressType("010","Mahad");
        assertNotNull(addressType);
        System.out.println(addressType.toString());
    }

}