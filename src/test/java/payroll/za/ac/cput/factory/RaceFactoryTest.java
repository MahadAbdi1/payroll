package payroll.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import payroll.za.ac.cput.domain.Race;

import static org.junit.jupiter.api.Assertions.*;

class RaceFactoryTest {
   @Test
    public void testPassed(){
        Race race = new RaceFactory().createRace("Hamza Ali Bare","Black");
        assertNotNull(race);
       System.out.println(race.toString());


    }


}