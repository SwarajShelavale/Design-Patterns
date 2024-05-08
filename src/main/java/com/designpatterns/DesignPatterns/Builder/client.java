package com.designpatterns.DesignPatterns.Builder;

import com.designpatterns.DesignPatterns.Builder.Student.Builder;

public class client {
    public static void main(String[] args) {
        Student student1 = Student.getBuilder()
                .setName("Swaraj")
                .setAge(24)
                .setBatch("MFW eve")
                .setPsp(91.9)
                .setGradYear(2022)
                .setPhoneNumber("91929292992")
                .setUnivName("DBATU")
                .build();
        System.out.println(student1);
        System.out.println("DEBUG");
    }
}
