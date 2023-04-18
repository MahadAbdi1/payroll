package payroll.za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import payroll.za.ac.cput.domain.employee.Employee;
import payroll.za.ac.cput.factory.employee.EmployeeFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class EmployeeRepositoryImplTest {

    private static EmployeeRepositoryImpl repository = EmployeeRepositoryImpl.getRepository();
    private static Employee employee = EmployeeFactory.CreateEmployee("Ahmed","Hussien");


    @Test
    void a_create() {
        Employee created = repository.create(employee);
        assertNotNull(employee);
        assertEquals(employee.getEmployeeNumber(),created.getEmployeeNumber());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Employee read = repository.read(employee.getEmployeeNumber());
        assertNotNull(read);
        assertEquals(employee.getEmployeeNumber(),read.getEmployeeNumber());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Employee updated = repository.update(employee);
        assertNotNull(updated);
        assertEquals(employee.getEmployeeNumber(),updated.getEmployeeNumber());
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(employee.getEmployeeNumber());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All : " + repository.getAll());
        Set<Employee> all = repository.getAll();
        assertNotNull(all);
    }
}