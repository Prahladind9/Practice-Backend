package edu.prahlad.java.course2.oop.designPrinciples.programToInterfaceNotImplementation.usecase2.after;

public class Programmer implements Employee {
    public void writeCode() {}

    @Override
    public void doWork() {
        writeCode();
    }
}
