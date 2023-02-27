package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.Employee;
import payroll.za.ac.cput.domain.Role;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {

 //@Test
//    public void TestPassed(){
//
//     Role role = new RoleFactory().createRole("Admin","Mahad");
//
//     assertNotNull(role);
//     System.out.println(role.toString());
// }
 @Test
 public void test() {

     Role role = new RoleFactory().CreateRole("Admin","Manager");

     assertNotNull(role);
     System.out.println(role.toString());


 }
 }