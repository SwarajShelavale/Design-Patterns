package com.designpatterns.DesignPatterns.Builder;

public class client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Swaraj");
        builder.setAge(25);
        builder.setBatch("MFW eve");
        builder.setPsp(91.9);
        builder.setGradYear(2022);
        builder.setPhoneNumber("91929292992");

        Student student = new Student(builder);
        System.out.println(student);
        System.out.println("DEBUG");
    }
}
