package edu.prahlad.java.course1.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread {
    private int number;
    public Task(int number){
        this.number = number;
    }

    public void run(){ //SIGNATURE
        System.out.print("\nTask"+number+" Started");
        for(int i = number* 100; i <= number*100 + 99; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask"+number+" Done");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        executorService.execute(new Task(8));
        executorService.execute(new Task(9));

        executorService.shutdown();
    }

    private static void singleThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.print("\nTask3 Kicked off ");
        //Task3
        for(int i = 301; i <= 399; i++){
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 Done");

        System.out.print("\nMain Done");

        executorService.shutdown();
    }
}
