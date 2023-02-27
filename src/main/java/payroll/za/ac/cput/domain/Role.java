package payroll.za.ac.cput.domain;

public class Role {

    private String admin;
    private String manager;

    // builder constructor


    public Role(String admin, String manager) {
        this.admin = admin;
        this.manager = manager;
    } // const

    public Role(Builder builder){

        this.admin = builder.admin;
        this.manager = builder.manager;;
    }


    public String getAdmin() {
        return admin;
    }

    public String getManager() {
        return manager;
    } // getters


    @Override
    public String toString() {
        return "Role{" +
                "admin='" + admin + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    } // toString

    public static class Builder{
        private String admin;
        private String manager;

        public Builder setAdmin(String admin) {
            this.admin = admin;
            return this;
        }

        public Builder setManager(String manager) {
            this.manager = manager;
            return this;

        } // set manager

        public Builder copy(Role role){
            this.admin = role.admin;
            this.manager = role.manager;
            return this;

        } // copy method


     public  Role build(){
            return new Role(this);
     }

    } // builder class
}
