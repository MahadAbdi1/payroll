package payroll.za.ac.cput.domain.lookup;

public class TestEnitity {
    private String testId;
    private String testName;


    public TestEnitity(String testId, String testName) {
        this.testId = testId;
        this.testName = testName;
    }

    public TestEnitity(Builder builder) {

        this.testId = builder.testId;
        this.testName = builder.testName;
    } // builder cons


    public String getTestId() {
        return testId;
    }

    public String getTestName() {
        return testName;
    }

    @Override
    public String toString() {
        return "TestEnitity{" +
                "testId='" + testId + '\'' +
                ", testName='" + testName + '\'' +
                '}';
    }

    public static class Builder{
        private String testId;
        private String testName;

        public Builder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public Builder setTestName(String testName) {
            this.testName = testName;

            return this;
        }

        public Builder copy(TestEnitity testEnitity){

            this.testId = testEnitity.testId;
            this.testName = testEnitity.testName;

            return this;

        }
        public TestEnitity build(){

            return new TestEnitity(this);
        }
    } // builder class
}
