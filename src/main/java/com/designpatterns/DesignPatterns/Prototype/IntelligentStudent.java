package com.designpatterns.DesignPatterns.Prototype;

public class IntelligentStudent extends Student {

    int iq;

    public IntelligentStudent(IntelligentStudent student) {
        // let the parent set other params
        super(student);

        this.iq = student.iq;
    }

    public IntelligentStudent() {

    }

    @Override
    public Student clone() {
        // TODO Auto-generated method stub
        return new IntelligentStudent(this);
    }

}
