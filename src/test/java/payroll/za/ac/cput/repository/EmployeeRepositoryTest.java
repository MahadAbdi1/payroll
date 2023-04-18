package payroll.za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import payroll.za.ac.cput.domain.employee.Employee;
import payroll.za.ac.cput.factory.employee.EmployeeFactory;
import payroll.za.ac.cput.repository.impl.EmployeeRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryTest {

    private static EmployeeRepositoryImpl repository = EmployeeRepositoryImpl.getRepository();

   private static Employee employee =
            EmployeeFactory.CreateEmployee("Mahad","Hassan");
    @Test
    void a_create() {
        Employee created = repository.create(employee);
       // assertEquals(employee.getEmployeeNumber(),created.getEmployeeNumber());
        assertEquals(employee.getEmployeeNumber(),created.getEmployeeNumber());
        System.out.println(created);
    }

    @Test
    void b_read() {

    }

    @Test
    void c_update() {
    }

    @Test
    void e_delete() {
    }

    @Test
    void d_getAll() {
    }
}