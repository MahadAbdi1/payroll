package payroll.za.ac.cput.domain.lookup;

public class AddressType {


    private String id;
    private String name;

    public AddressType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public AddressType(Builder builder) {
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
        return "AddressType{" +
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

        public Builder copy(AddressType addressType){
            this.id = addressType.id;
            this.name = addressType.name;

            return this;
        } // copy

        public AddressType build(){

            return new AddressType(this);
        }

    } // builder
}
