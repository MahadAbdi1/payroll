package payroll.za.ac.cput.factory.employee;

import payroll.za.ac.cput.domain.employee.Employee;
import payroll.za.ac.cput.utill.Helper;

public class EmployeeFactory {

    public static Employee CreateEmployee(String fName, String lName){


        String employeeNum = Helper.generatedId();
        if (Helper.isNullOrEmpty(fName)|| Helper.isNullOrEmpty(lName))

        return null;


        return new Employee.Builder().setEmployeeNumber(employeeNum)
                .setfName(fName)
                .setlName(lName)
                .build();


    }


}
