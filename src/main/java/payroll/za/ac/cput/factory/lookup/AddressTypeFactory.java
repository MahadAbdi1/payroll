package payroll.za.ac.cput.factory.lookup;

import payroll.za.ac.cput.domain.lookup.AddressType;
import payroll.za.ac.cput.utill.Helper;

public class AddressTypeFactory {

    public static AddressType createAddressType(String  id,String name){

        if (Helper.isNullOrEmpty(id) || Helper.isNullOrEmpty(name))

            return null;

        return new AddressType.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
