package payroll.za.ac.cput.factory.employee;

import payroll.za.ac.cput.domain.employee.EmployeeSalary;
import payroll.za.ac.cput.utill.Helper;

public class EmployeeSalaryFactory {

    public static EmployeeSalary createEmployeeSalary(String emloyeeName ,String amount){

        if (Helper.isNullOrEmpty(emloyeeName)||Helper.isNullOrEmpty(amount))

            return null;

        return new EmployeeSalary.Builder()
                .setEmloyeeName(emloyeeName)
                .setAmount(amount)
                .build();

    }
}
