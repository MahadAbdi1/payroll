package payroll.za.ac.cput.factory.lookup;

import jdk.jshell.Snippet;
import payroll.za.ac.cput.domain.lookup.Job;
import payroll.za.ac.cput.utill.Helper;

public class JobFactory {

    public static Job createJobFactory( String jobTitle, String wage, String roleDescription){


        if (Helper.isNullOrEmpty(jobTitle)|| Helper.isNullOrEmpty(wage)
                || Helper.isNullOrEmpty(roleDescription))
            return null;

        return new Job.Builder()
                .setJobTitle(jobTitle)
                .setWage(wage)
                .setRoleDescription(roleDescription)
                .build();
    }
}
