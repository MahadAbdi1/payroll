package payroll.za.ac.cput.factory.lookup;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.lookup.Gender;

import static org.junit.jupiter.api.Assertions.*;

class GenderFactoryTest {

    @Test
    public void testGender(){

        Gender gender = GenderFactory.createGender("M","F");

        assertNotNull(gender);

        System.out.println(gender.toString());


    }

}