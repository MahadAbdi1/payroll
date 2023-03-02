package payroll.za.ac.cput.domain;

public class Race {

    private String fullName;
    private String race;

    public Race(String fullName, String race) {
        this.fullName = fullName;
        this.race = race;
    }

    public Race(Builder builder) {
    this.fullName = builder.fullName;
    this.race = builder.race;
    } // builder

    public String getFullName() {
        return fullName;
    }

    public String getRace() {
        return race;
    } // getters

    @Override
    public String toString() {
        return "Race{" +
                "fullName='" + fullName + '\'' +
                ", race='" + race + '\'' +
                '}';
    } // ToString

    public static class Builder{
        private String fullName;
        private String race;

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setRace(String race) {
            this.race = race;
            return this;
        }

        public Builder copy(Race race){

            this.fullName = race.fullName;
            this.race = race.race;
            return this;
        }

        public Race build(){
        return new Race(this);
        }
    } // class builder


}
