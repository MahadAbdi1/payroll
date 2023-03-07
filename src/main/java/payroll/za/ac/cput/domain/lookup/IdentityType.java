package payroll.za.ac.cput.domain.lookup;

public class IdentityType {

    private String id;
    private String name;

    public IdentityType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public IdentityType(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "IdentityType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(IdentityType identityType){

            this.id = identityType.id;
            this.name = identityType.name;

            return this;

        } // copy method

        public IdentityType build(){

            return new IdentityType(this);
        }
    } // builder inner class
}
