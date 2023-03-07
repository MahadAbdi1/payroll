package payroll.za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.employee.Employee;

public class EmployeeTest {

    @Test

    public void test(){

        Employee employee = new Employee.Builder()
                .setfName("Mahad")
                .setlName("Hassan")
                .setEmployeeNumber("011282")
                .build();
        System.out.println(employee);
    }


}