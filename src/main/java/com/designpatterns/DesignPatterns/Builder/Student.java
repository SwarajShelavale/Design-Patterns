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
        return "Student Details: [name=" + name + ", age=" + age + ", univName=" + univName + ", psp=" + psp
                + ", batch=" + batch
                + ", gradYear=" + gradYear + ", phoneNumber=" + phoneNumber + "]";
    }

    public Student(Builder builder) {

        // Validation Start
        if (builder.getAge() < 18) {
            throw new RuntimeException("Age should be atleast 18");
        }
        if (builder.getGradYear() > 2023) {
            throw new RuntimeException("More Experiance required");
        }
        // Validation end

        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();

    }
}
