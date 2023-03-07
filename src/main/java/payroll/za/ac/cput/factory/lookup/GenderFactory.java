package payroll.za.ac.cput.factory.lookup;

import payroll.za.ac.cput.domain.lookup.Gender;
import payroll.za.ac.cput.utill.Helper;

public class GenderFactory {

    public static Gender createGender(String male , String female){


        if (Helper.isNullOrEmpty(male) || Helper.isNullOrEmpty(female))

            return null;

        return new Gender.Builder().setMale(male)
                .setFemale(female)
                .build();
    }
}
