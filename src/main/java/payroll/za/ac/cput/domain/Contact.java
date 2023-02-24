package payroll.za.ac.cput.domain;

public class Contact {
    private String fName;
    private String lName;
    private String contactNumber;

    public Contact(String fName, String lName, String contactNumber) {
        this.fName = fName;
        this.lName = lName;
        this.contactNumber = contactNumber;
    }

    private Contact(Contact.Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.contactNumber = builder.contactNumber;

    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // getters

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // setters


    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", employeeNumber='" + contactNumber + '\'' +
                '}';
    } // ToString

    public static class Builder{
        private String fName;
        private String lName;
        private String contactNumber;

        public Contact.Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Contact.Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Contact.Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Contact.Builder copy(Contact contact){
            this.fName = contact.fName;
            this.lName = contact.lName;
            this.contactNumber = contact.contactNumber;

            return this;
        } // copy method

        public Contact build(){

            return new Contact(this);
        }
    } // builder class

}
