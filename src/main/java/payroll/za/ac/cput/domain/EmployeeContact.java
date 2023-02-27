package payroll.za.ac.cput.domain;

public class EmployeeContact {

    private String empName;
    private String empLastName;

    public EmployeeContact(String empName, String empLastName) {
        this.empName = empName;
        this.empLastName = empLastName;
    } // const

    public EmployeeContact(Builder builder ) {
       this.empName = builder.empName;
       this.empLastName = builder.empLastName;;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    } // getters

    @Override
    public String toString() {
        return "EmployeeContact{" +
                "empName='" + empName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public static class Builder{
        private String empName;
        private String empLastName;

        public Builder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder setEmpLastName(String empLastName) {
            this.empLastName = empLastName;
            return this;
        }

        public Builder copy(EmployeeContact employeeContact){
            this.empName = employeeContact.empName;
            this.empLastName = employeeContact.empLastName;
            return this;

        } // copy method
        public EmployeeContact build(){

            return new EmployeeContact(this);
        }
    } // builder class
}
