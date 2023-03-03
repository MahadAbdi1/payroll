package payroll.za.ac.cput.domain;

public class EmployeeSalary {

    private String emloyeeName;
    private String amount;

    public EmployeeSalary(String emloyeeName, String amount) {
        this.emloyeeName = emloyeeName;
        this.amount = amount;
    }

    public EmployeeSalary(Builder builder) {

        this.emloyeeName = builder.emloyeeName;
        this.amount = builder.amount;
    } // builder const

    public String getEmloyeeName() {
        return emloyeeName;
    }

    public String getAmount() {
        return amount;
    } // getters

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "emloyeeName='" + emloyeeName + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public static class Builder{
        private String emloyeeName;
        private String amount;

        public Builder setEmloyeeName(String emloyeeName) {
            this.emloyeeName = emloyeeName;
            return this;
        }

        public Builder setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder copy(EmployeeSalary employeeSalary){
            this.emloyeeName =employeeSalary.emloyeeName;
            this.amount = employeeSalary.amount;

            return this;

        } // copy

        public EmployeeSalary build(){

            return new EmployeeSalary(this);
        }
    } // builder class


} // emplsalry class
