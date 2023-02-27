package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    @Test
    public void test(){

        Employee employee = new EmployeeFactory().CreateEmployee(
                "Mahad","Haassan");

        assertNotNull(employee);
        System.out.println(employee.toString());

    }
   // @Test
    public void testWirthFail(){

        Employee employee = new EmployeeFactory().CreateEmployee(
                "","Wyne");

        assertNotNull(employee);
        System.out.println(employee.toString());

    }

}