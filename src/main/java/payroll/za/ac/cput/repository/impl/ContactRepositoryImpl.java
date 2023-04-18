package payroll.za.ac.cput.repository.impl;

import payroll.za.ac.cput.domain.employee.Contact;
import payroll.za.ac.cput.repository.ContactRepository;

import java.util.HashSet;
import java.util.Set;

public class ContactRepositoryImpl implements ContactRepository {
    public static ContactRepositoryImpl repository = null;
    private Set<Contact> contactDB = null;

    private ContactRepositoryImpl(){
        this.contactDB = new HashSet<Contact>();

    }

    public static ContactRepositoryImpl getRepository() {

        if (repository==null)
            repository = new ContactRepositoryImpl();
        return repository;
    }

    @Override
    public Contact create(Contact contact) {
        boolean success = contactDB.add(contact);
        if (!success)
            return null;
        return contact;
    }

    @Override
    public Contact read(String contactNumber) {
        for (Contact c :contactDB ){
            if (c.getContactNumber().equals(contactNumber))
                return c;
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact oldContact = read(contact.getContactNumber());
        if (oldContact==null){
            contactDB.remove(contact);
            contactDB.add(contact);
            return null;

        }
        return contact;
    }

    @Override
    public boolean delete(String contactNumber) {
        Contact contactToDelete = read(contactNumber);
        if (contactToDelete==null)
            return false;
        contactDB.remove(contactToDelete);

        return true;
    }

    @Override
    public Set<Contact> getAll() {
        return contactDB;
        
    }
}
