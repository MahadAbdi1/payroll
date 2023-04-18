package payroll.za.ac.cput.factory.lookup;

import payroll.za.ac.cput.domain.lookup.Description;
import payroll.za.ac.cput.utill.Helper;

public class DescriptionFactory {

    public Description CreateDescriptionFactory(String desciptionId,String desciptionName){

        if (Helper.isNullOrEmpty(desciptionId)|| Helper.isNullOrEmpty(desciptionName))

            return null;

        return new Description.Builder()
                .setDesciptionId(desciptionId)
                .setDesciptionName(desciptionName)
                .build();


    }
}
