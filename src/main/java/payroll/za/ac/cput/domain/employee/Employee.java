package payroll.za.ac.cput.domain.employee;

public class Employee {
    private String fName;
    private String lName;
    private String employeeNumber;

    public Employee(String fName, String lName, String employeeNumber) {
        this.fName = fName;
        this.lName = lName;
        this.employeeNumber = employeeNumber;
    }

    private Employee(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.employeeNumber = builder.employeeNumber;

    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    } // getters

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    } // setters


    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                '}';
    } // ToString

    public static class Builder{
        private String fName;
        private String lName;
        private String employeeNumber;

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder copy(Employee employee){
             this.fName = employee.fName;
             this.lName = employee.lName;
             this.employeeNumber = employee.employeeNumber;

             return this;
        } // copy method

        public Employee build(){

            return new Employee(this);
        }
    } // builder class

}
