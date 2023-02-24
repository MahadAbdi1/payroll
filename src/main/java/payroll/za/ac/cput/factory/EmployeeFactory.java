package payroll.za.ac.cput.factory;

import payroll.za.ac.cput.domain.Employee;
import payroll.za.ac.cput.utill.Helper;

import java.util.UUID;

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
