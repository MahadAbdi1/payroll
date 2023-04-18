package payroll.za.ac.cput.factory.lookup;

import payroll.za.ac.cput.domain.lookup.TestEnitity;
import payroll.za.ac.cput.utill.Helper;

public class TestEntityFactory {

    public static TestEnitity CreateTestEntityFactory(String testId , String testName ){

        if (Helper.isNullOrEmpty(testId)|| Helper.isNullOrEmpty(testName))
            return null;

        return new TestEnitity.Builder()
                .setTestId(testId)
                .setTestName(testName)
                .build();

    }



}
