package DSAQuestions.multithreading;

public class ThreadSleepDemo {
}

 class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(2000);

        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
        System.out.println("Note that the time is not precisely 2000ms cz after thread is put to sleeep state for x time, " +
                "it is set to runnable state and to actually run, depends on when OS is available to run it.");
    }
}