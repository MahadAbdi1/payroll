package payroll.za.ac.cput.factory.employee;

import payroll.za.ac.cput.domain.employee.Contact;
import payroll.za.ac.cput.utill.Helper;

public class ContactFactory {

    public static Contact CreateContact(String fName, String lName, String contacNumber){


       // String employeeNum = Helper.generatedId();
        if (Helper.isNullOrEmpty(fName)|| Helper.isNullOrEmpty(lName) ||
                Helper.isNullOrEmpty(contacNumber))

            return null;


        return new Contact.Builder().setContactNumber(contacNumber)
                .setfName(fName)
                .setlName(lName)
                .build();


    }
}
