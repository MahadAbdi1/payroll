package payroll.za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import payroll.za.ac.cput.domain.employee.Contact;
import payroll.za.ac.cput.factory.employee.ContactFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ContactRepositoryImplTest {
    private static ContactRepositoryImpl repository = ContactRepositoryImpl.getRepository();
    private static Contact contact = ContactFactory.CreateContact("Frhn","Tukan","0123456789");

    @Test
    void a_create() {
        Contact created = repository.create(contact);
        assertNotNull(contact);
        assertEquals(contact.getContactNumber(),created.getContactNumber());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Contact read = repository.read(contact.getContactNumber());
        assertNotNull(read);
        assertEquals(contact.getContactNumber(),read.getContactNumber());
    }

    @Test
    void c_update() {
        Contact updated = repository.update(contact);
        assertNotNull(updated);
        assertEquals(contact.getContactNumber(),updated.getContactNumber());

    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(contact.getContactNumber());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All : " + repository.getAll());
        Set<Contact> all = repository.getAll();
        assertNotNull(all);
    }
}