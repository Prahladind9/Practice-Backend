package edu.prahlad.java.course1.concurrency;

public class ConcurrencyRunner {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incrementer();
        counter.incrementer();
        counter.incrementer();
        System.out.println(counter.getI());

    }
}
