package payroll.za.ac.cput.domain.lookup;

public class Job {

    private String jobTitle;
    private String wage;
    private String roleDescription;

    public Job(String jobTitle, String wage, String roleDescription) {
        this.jobTitle = jobTitle;
        this.wage = wage;
        this.roleDescription = roleDescription;
    }

    public Job(Builder builder) {

        this.jobTitle = builder.jobTitle;
        this.wage = builder.wage;
        this.roleDescription = builder.roleDescription;

    } // builder const

    public String getJobTitle() {
        return jobTitle;
    }

    public String getWage() {
        return wage;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", wage='" + wage + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }


    public static class Builder{
        private String jobTitle;
        private String wage;
        private String roleDescription;


        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;

            return this;
        }

        public Builder setWage(String wage) {
            this.wage = wage;
            return this;
        }

        public Builder setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }

        public Job build(){

            return new Job(this);
        }
    } // builder class
}
