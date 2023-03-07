package payroll.za.ac.cput.factory.lookup;

import payroll.za.ac.cput.domain.lookup.IdentityType;
import payroll.za.ac.cput.utill.Helper;

public class IdentityTypeFactory {

    public static IdentityType CreateIdentityType(String  id,String  name){

        if (Helper.isNullOrEmpty(id)|| Helper.isNullOrEmpty(name))

            return null;

        return new IdentityType.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
