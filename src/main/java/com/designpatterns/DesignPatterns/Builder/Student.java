package com.designpatterns.DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", univName=" + univName + ", psp=" + psp + ", batch=" + batch
                + ", gradYear=" + gradYear + ", phoneNumber=" + phoneNumber + "]";
    }

    public Student(Builder builder) {

        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.univName = builder.getUnivName();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.batch = builder.getBatch();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {

            // Validation Start
            if (this.getAge() < 18) {
                throw new RuntimeException("Age should be atleast 18");
            }
            if (this.getGradYear() > 2023) {
                throw new RuntimeException("More Experiance required");
            }
            // Validation end

            return new Student(this);
        }
    }

}