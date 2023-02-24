package payroll.za.ac.cput.domain;

import org.junit.jupiter.api.Test;

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