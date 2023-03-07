package payroll.za.ac.cput.factory.employee;

import payroll.za.ac.cput.domain.employee.EmployeeContact;
import payroll.za.ac.cput.utill.Helper;

public class EmployeeContactFactory {

    public static EmployeeContact CreateEmployeeContact( String empName, String empLastName ){
        if (Helper.isNullOrEmpty(empName)|| Helper.isNullOrEmpty(empLastName))
            return null;

        return new EmployeeContact.Builder()
                .setEmpName(empName)
                .setEmpLastName(empLastName)
                .build();


    }
}
