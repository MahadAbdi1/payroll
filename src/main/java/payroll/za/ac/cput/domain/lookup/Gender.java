package payroll.za.ac.cput.domain.lookup;

public class Gender {

    private String male;
    private String female;

    public Gender(String male, String female) {
        this.male = male;
        this.female = female;
    }

    public Gender( Builder builder) {
        this.male = builder.male;
        this.female = builder.female;

    } // builder constructor


    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "male='" + male + '\'' +
                ", female='" + female + '\'' +
                '}';
    }

    public static class Builder{
        private String male;
        private String female;

        public Builder setMale(String male) {
            this.male = male;
            return this;
        }

        public Builder setFemale(String female) {
            this.female = female;
            return this;
        }


        public Builder copy(Gender gender){
            this.male = gender.male;
            this.female = gender.female;

            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    } // class builder

}
