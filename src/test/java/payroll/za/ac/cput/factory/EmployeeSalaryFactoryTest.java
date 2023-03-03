package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.EmployeeSalary;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSalaryFactoryTest {
    @Test

    public void testPassed(){

        EmployeeSalary employeeSalary =
                EmployeeSalaryFactory.createEmployeeSalary("Mahad Hassan","50,000");
        assertNotNull(employeeSalary);
        System.out.printf(employeeSalary.toString());

    }


}