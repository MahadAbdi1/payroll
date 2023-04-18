package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.employee.Contact;
import payroll.za.ac.cput.factory.employee.ContactFactory;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {
    @Test
    public void testPassed(){

        Contact contact = new ContactFactory().CreateContact(
                "Fanta","fanta","0834837112");

        assertNotNull(contact);
        System.out.println(contact.toString());
    }
    @Test
    public void testFailled(){

        Contact contact = new ContactFactory().CreateContact(
                "","fnta","0834837112");

        assertNotNull(contact);
        System.out.println(contact.toString());
    }

}