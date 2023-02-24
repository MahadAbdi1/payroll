package payroll.za.ac.cput.factory;

import payroll.za.ac.cput.domain.Contact;
import payroll.za.ac.cput.domain.Employee;
import payroll.za.ac.cput.utill.Helper;

public class ContactFactory {

    public static Contact CreateEmployee(String fName, String lName,String contacNumber){


       // String employeeNum = Helper.generatedId();
        if (Helper.isNullOrEmpty(fName)|| Helper.isNullOrEmpty(lName) || Helper.isNullOrEmpty(contacNumber))

            return null;


        return new Contact.Builder().setContactNumber(contacNumber)
                .setfName(fName)
                .setlName(lName)
                .build();


    }
}