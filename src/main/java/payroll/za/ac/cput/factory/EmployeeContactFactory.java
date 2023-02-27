package payroll.za.ac.cput.factory;

import payroll.za.ac.cput.domain.EmployeeContact;
import payroll.za.ac.cput.domain.Role;
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
