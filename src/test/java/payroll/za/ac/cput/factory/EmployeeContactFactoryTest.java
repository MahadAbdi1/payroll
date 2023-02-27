package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.EmployeeContact;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeContactFactoryTest {

    @Test
    public void testPassed(){

        EmployeeContact employeeContact = new EmployeeContactFactory().CreateEmployeeContact
                ("LII","Hussien");
        assertNotNull(employeeContact);
        System.out.println(employeeContact.toString());
    }

}