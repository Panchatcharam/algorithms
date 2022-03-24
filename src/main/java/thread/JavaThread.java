package thread;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JavaThread {

    public static class ThreadClass implements Runnable {

        @Override
        public void run() {
            synchronized (this) {
                for(int index = 0; index < 2; ++index) {
                    System.out.println("Hello I'm a thread - " + Thread.currentThread());
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class myThread extends Thread {
        @SneakyThrows
        public void run() {
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String [] args) throws InterruptedException {

        Runnable task1 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task2 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task3 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task4 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task5 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task6 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task7 = () -> {
            for(int index = 0; index < 10; ++index) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task8 = () -> System.out.println(Thread.currentThread().getName());
        Runnable task9 = () -> System.out.println(Thread.currentThread().getName());
        Runnable task10 = () -> System.out.println(Thread.currentThread().getName());
        Runnable task11 = () -> System.out.println(Thread.currentThread().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.submit(task6);
        executorService.submit(task7);
        executorService.submit(task8);
        executorService.submit(task9);
        executorService.submit(task10);
        executorService.submit(task11);

        System.out.println("Before Shutdown");
        executorService.shutdown();
        System.out.println("After Shutdown");
//        Integer integer1 = new Integer(2);
//        Integer integer2 = new Integer(2);
//
//        if (integer1 == integer2) {
//            System.out.println("They are same");
//        } else {
//            System.out.println("They are not same");
//        }
//
//        ThreadClass tc = new ThreadClass();
//        Thread t1 = new Thread(tc, "first");
//        Thread t2 = new Thread(tc, "second");
//
//        Thread myThread = new myThread();
//        myThread.start();
//
//        t1.start();
//        t2.start();
    }
}
