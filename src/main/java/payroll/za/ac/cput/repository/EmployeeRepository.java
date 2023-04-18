package payroll.za.ac.cput.repository;

import payroll.za.ac.cput.domain.employee.Employee;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee,String > {

    public Set<Employee> getAll();

}
