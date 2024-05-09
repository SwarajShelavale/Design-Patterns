package com.designpatterns.DesignPatterns.Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24Eve");
        mar24LLDEvePrototype.setAvgBatchPsp(91.1);
        studentRegistry.register("Mar24Eve", mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("Feb24Eve");
        feb24LLDEvePrototype.setAvgBatchPsp(86.2);
        studentRegistry.register("Feb24Eve", feb24LLDEvePrototype);

        IntelligentStudent may24LLDEveIsPrototype = new IntelligentStudent();
        may24LLDEveIsPrototype.setBatch("Mar24Eve");
        may24LLDEveIsPrototype.setAvgBatchPsp(81);
        may24LLDEveIsPrototype.iq = 100;
        studentRegistry.register("Mar24Eve", may24LLDEveIsPrototype);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        fillRegistry(studentRegistry);

        // Start

        Student swaraj = studentRegistry.get("Mar24Eve").clone();
        swaraj.setName("Swaraj");
        swaraj.setAge(24);
        swaraj.setPsp(99);

        System.out.println(swaraj);

        Student amolIs = studentRegistry.get("Mar24Eve").clone();
        amolIs.setName("Amol");
        amolIs.setAge(23);
        amolIs.setPsp(92);
        System.out.println(amolIs);

        System.out.println("DEBUG");

    }
}
