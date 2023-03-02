package payroll.za.ac.cput.factory;

import payroll.za.ac.cput.domain.Race;
import payroll.za.ac.cput.utill.Helper;

public class RaceFactory {

    public static Race createRace(String fullName,String race){

        if (Helper.isNullOrEmpty(fullName)|| Helper.isNullOrEmpty(race))

            return null;

        return new Race.Builder()
                .setFullName(fullName)
                .setRace(race)
                .build();

    }
}
