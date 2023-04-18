package payroll.za.ac.cput.domain.lookup;

public class Description {

    private String desciptionId;
    private String desciptionName;

    public Description(String desciptionId, String desciptionName) {
        this.desciptionId = desciptionId;
        this.desciptionName = desciptionName;
    }

    public Description(Builder builder) {

        this.desciptionId = builder.desciptionId;
        this.desciptionName = builder.desciptionName;
    } // buildr cons

    public String getDesciptionId() {
        return desciptionId;
    }

    public String getDesciptionName() {
        return desciptionName;
    }

    @Override
    public String toString() {
        return "Description{" +
                "desciptionId='" + desciptionId + '\'' +
                ", desciptionName='" + desciptionName + '\'' +
                '}';
    }

    public static class Builder{
        private String desciptionId;
        private String desciptionName;


        public Builder setDesciptionId(String desciptionId) {

            this.desciptionId = desciptionId;
            return this;
        }

        public Builder setDesciptionName(String desciptionName) {
            this.desciptionName = desciptionName;

            return this;
        }

        public Builder copy(Description description){

            this.desciptionId = description.desciptionId;
            this.desciptionName = description.desciptionName;

            return this;
        }

        public Description build(){

            return new Description( this);
        }

    } // buildr class
}

