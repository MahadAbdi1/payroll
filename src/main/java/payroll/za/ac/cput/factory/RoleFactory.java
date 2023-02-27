package payroll.za.ac.cput.factory;

import payroll.za.ac.cput.domain.Role;
import payroll.za.ac.cput.utill.Helper;

public class RoleFactory {

    public static Role CreateRole( String admin,String manager){

        if (Helper.isNullOrEmpty(admin)|| Helper.isNullOrEmpty(manager))

            return null;

        return new Role.Builder().
                setAdmin(admin)
                .setManager(manager)
                .build();

    }
}
