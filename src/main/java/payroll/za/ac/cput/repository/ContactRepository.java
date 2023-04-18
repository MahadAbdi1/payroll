package payroll.za.ac.cput.repository;

import payroll.za.ac.cput.domain.employee.Contact;

import java.util.Set;

public interface ContactRepository extends IRepository<Contact,String>{

    public Set<Contact>getAll();

}
