package com.home.lambda;

public class TestRunnable {
    
    public static void main(String[] args) {
        
        
        Runnable runnable = new Runnable() {
            
            public void run() {
                System.out.println("Test Runnable without lambda "+Thread.currentThread().getName());
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
        
        
        //With Lambda Expression
        
        runnable = () -> System.out.println("Test Runnable with lambda "+Thread.currentThread().getName());
        Thread testThread = new Thread(runnable);
        testThread.start();
        
        runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Test Runnable with lambda "+Thread.currentThread().getName());
        };
        new Thread(runnable).start();
    }
    
}
