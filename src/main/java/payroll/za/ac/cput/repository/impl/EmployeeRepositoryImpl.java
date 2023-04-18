package payroll.za.ac.cput.repository.impl;

import payroll.za.ac.cput.domain.employee.Contact;
import payroll.za.ac.cput.domain.employee.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements payroll.za.ac.cput.repository.EmployeeRepository {

public static EmployeeRepositoryImpl Repository = null;
private Set<Employee> employeeDB = null;

private EmployeeRepositoryImpl(){

    employeeDB =  new HashSet<Employee>();
}
public static EmployeeRepositoryImpl getRepository(){

    if (Repository ==null)
        Repository = new EmployeeRepositoryImpl();

    return Repository;
}


    @Override
    public Employee create(Employee employee) {
    boolean success = employeeDB.add(employee);
    if (!success)

    return null;
    return employee;
    }

    @Override
    public Employee read(String employeeNumber) {

    for (Employee e :employeeDB ){
        if (e.getEmployeeNumber().equals(employeeNumber))
            return e;
    }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
    Employee oldEmployee = read(employee.getEmployeeNumber());
    if (oldEmployee==null){
        employeeDB.remove(employee);
    employeeDB.add(employee);
        return null;
    }
        return employee;
    }

    @Override
    public boolean delete(String employeeNumber) {
    Employee employeeToDelete = read(employeeNumber);
    if (employeeToDelete==null)
        return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public Set<Employee> getAll() {
        return employeeDB;
    }
}
