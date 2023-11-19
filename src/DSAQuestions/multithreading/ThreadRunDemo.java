package DSAQuestions.multithreading;

public class ThreadRunDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadRunnable(), "runnableT1");
        Thread t2 = new Thread(new ThreadRunnable(), "runnableT2");
        System.out.println("Starting runnable threads");

        t1.start();
        t2.start();
        System.out.println("Runnable threads started");

        Thread myThread1 = new MyThread("myThread1");
        Thread myThread2 = new MyThread("myThread2");
        System.out.println("starting threads extending thread class");
        myThread2.start();
        myThread1.start();
        System.out.println("threads extending thread class started");




    }
}
